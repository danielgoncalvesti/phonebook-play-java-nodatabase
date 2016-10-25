package models;
import models.Contato;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by mrgoncalvesdaniel on 23/10/16.
 */
public class ContatoHelper {
    private static Map<Long, Contato> contatos = new ConcurrentHashMap<Long, Contato>();

    private static AtomicLong uuid = new AtomicLong();

    public static void delete(long id) {
        contatos.remove(id);
    }

    public static Contato findById(long id) {
        return contatos.get(id);
    }

    public static List<Contato> findByName(String filter){
        List<Contato> result = new ArrayList<Contato>();
        for (Contato contato: contatos.values()){
            if (contato.nome.toLowerCase().toLowerCase().contains(filter.toLowerCase())){
                result.add(contato);
            }
        }
        return result;
    }


    public static void save(Contato contato) {
        if (contato.id == null) {
            contato.id = uuid.incrementAndGet();
        }
        contatos.put(contato.id, contato);
    }
}
