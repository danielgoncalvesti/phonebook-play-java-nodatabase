package controllers;
import static play.data.Form.form;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import models.Contato;
import play.data.FormFactory;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by mrgoncalvesdaniel on 20/10/16.
 */
public class ContatoCRUD extends Controller {

    private final Form<Contato> contatoForm;

    @Inject
    public ContatoCRUD(FormFactory formFactory) {
        this.contatoForm = formFactory.form(Contato.class);
    }

    public Result list(String filter) {
        List<Contato> contatos = models.ContatoHelper.findByName(filter);
        return ok(views.html.index.render(contatos));
    }

    public Result doRemove(long id) {
        models.ContatoHelper.delete(id);
        return redirect(routes.ContatoCRUD.list(""));
    }

    public Result add() {
        Form<Contato> form = contatoForm.fill(new Contato());
        return ok(views.html.novo.render(form, "Add Contact"));
    }

    public Result edit(long id) {
        Contato contato = models.ContatoHelper.findById(id);
        if (contato != null) {
            Form<Contato> form = contatoForm.fill(contato);
            return ok(views.html.edit.render(form, "Edit Contact"));
        } else {
            return redirect(routes.ContatoCRUD.list(""));
        }
    }

    public Result doEdit() {
        Form<Contato> form = contatoForm.bindFromRequest(request());
        if (form.hasErrors()) {
            flash("erro", "Foram identificados problemas no cadastro do telefone. Preencha como o exemplo: +551198525-1525");
            return badRequest(views.html.edit.render(form, "Edit Contact"));
        } else {
            models.ContatoHelper.save(form.get());
//            flash("sucesso", "Alterado com sucesso!");
            return redirect(routes.ContatoCRUD.list(""));
        }

    }
    public Result doNovo() {
        Form<Contato> form = contatoForm.bindFromRequest(request());
        if (form.hasErrors()) {
            flash("erro", "Foram identificados problemas no cadastro do telefone. Preencha como o exemplo: +551198525-1525");
            return badRequest(views.html.novo.render(form, "Add Contact"));
        } else {
            models.ContatoHelper.save(form.get());
            flash("success", "Contact successfully added!");
            return redirect(routes.ContatoCRUD.list(""));
        }

    }

}
