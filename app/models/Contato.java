package models;

import play.data.validation.Constraints;
import static play.data.validation.Constraints.*;
import scala.collection.Seq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;


/**
 * Created by mrgoncalvesdaniel on 21/10/16.
 */
public class Contato{

//value="\\+?[0-9]+",
    public Long id;
    @Required
    public String nome;
    @Required
    @Pattern(
            value="\\+?[0-9]{4}[0-9]{5}([- .])[0-9]{4}",
            message = "Opcional usar '+', seguido de digitos e espaços"
    )
    public String telefone;

    public Contato(){

    }


}
