import play.*;
import models.*;

/**
 * Created by mrgoncalvesdaniel on 22/10/16.
 */
public class Global extends GlobalSettings {

    public void onStart(Application app) {
        ContatoHelper.save(novoContato("Daniel Goncalves", "+551198767-0000"));
        ContatoHelper.save(novoContato("Josefina", "+551198646-5500"));
        ContatoHelper.save(novoContato("Pedro Augusto", "+551198333-8800"));
        ContatoHelper.save(novoContato("Joana Santos", "+551198322-3301"));
        ContatoHelper.save(novoContato("Janaina Pedrosa", "+551198333-8802"));
        ContatoHelper.save(novoContato("Roberto Barros", "+551198333-8803"));

    }

    private Contato novoContato(String nome, String telefone) {
        Contato contato = new Contato();
        contato.nome = nome;
        contato.telefone = telefone;
        return contato;
    }
}
