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
        ContatoHelper.save(novoContato("Ana Paula Barros", "+551198333-8703"));
        ContatoHelper.save(novoContato("Reginaldo Oliveira", "+551198333-8882"));
        ContatoHelper.save(novoContato("Roberto Fredes", "+551198333-8803"));
        ContatoHelper.save(novoContato("Alfredo Barros", "+551198333-8103"));
        ContatoHelper.save(novoContato("Juliana Fraga", "+551198333-8006"));
        ContatoHelper.save(novoContato("Roberto Barros", "+551198333-8503"));
        ContatoHelper.save(novoContato("Paulo Cesar", "+551198333-8808"));
        ContatoHelper.save(novoContato("Roberto Jan", "+551198333-8603"));
        ContatoHelper.save(novoContato("Renato Bay", "+551198333-8706"));

    }

    private Contato novoContato(String nome, String telefone) {
        Contato contato = new Contato();
        contato.nome = nome;
        contato.telefone = telefone;
        return contato;
    }
}
