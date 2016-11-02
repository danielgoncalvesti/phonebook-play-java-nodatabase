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


    public Long id;
    @Required
    public String nome;
    @Required
    public String telefone;

    public Contato(){

    }


}
