package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ElementosWebTodoTestUsuario;

public class PreguntaUsuario implements Question<Boolean> {
   String pregunta;
    public PreguntaUsuario(String pregunta){
       this.pregunta=pregunta;
   }

   public static PreguntaUsuario seRegistro(String pregunta){
   return new PreguntaUsuario(pregunta);
}

    @Override
    public Boolean answeredBy(Actor actor) {
        String respuesta;
        respuesta= Text.of(ElementosWebTodoTestUsuario.verificacion).viewedBy(actor).asString();
        if(respuesta.equals(pregunta)){
            return true;
        }else
        {
            return false;
        }
    }
}
