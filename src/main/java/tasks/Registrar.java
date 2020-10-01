package tasks;

import model.TodoTestDataDrive;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import userinterface.ElementosWebTodoTestUsuario;
import util.Constantes;
import java.util.List;

public class Registrar implements Task {
    List<TodoTestDataDrive> losdatos;
   public Registrar(List losdatos){
       this.losdatos=losdatos;
   }

    public static Registrar unUsuarioCon(List<TodoTestDataDrive> losdatos){
        return new Registrar(losdatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Click.on(ElementosWebTodoTestUsuario.aceptar),
               Click.on(ElementosWebTodoTestUsuario.registrarse),
               Enter.theValue(losdatos.get(Constantes.posicion).getNombre()).into(ElementosWebTodoTestUsuario.nombre),
               Enter.theValue(losdatos.get(Constantes.posicion).getApellido()).into(ElementosWebTodoTestUsuario.apellido),
               Enter.theValue(losdatos.get(Constantes.posicion).getCorreo()).into(ElementosWebTodoTestUsuario.email),
               SelectFromOptions.byVisibleText(losdatos.get(Constantes.posicion).getEdad()).from(ElementosWebTodoTestUsuario.edad),
               Enter.theValue(losdatos.get(Constantes.posicion).getTelefono()).into(ElementosWebTodoTestUsuario.telefono),
               Enter.theValue(losdatos.get(Constantes.posicion).getPostal()).into(ElementosWebTodoTestUsuario.postal),
               SelectFromOptions.byVisibleText(losdatos.get(Constantes.posicion).getPais()).from(ElementosWebTodoTestUsuario.pais),
               Check.whether(losdatos.get(Constantes.posicion).getSexo().equals("Hombre"))
                       .andIfSo(Click.on(ElementosWebTodoTestUsuario.sexoh))
                       .otherwise(Click.on(ElementosWebTodoTestUsuario.sexom)),
               SelectFromOptions.byVisibleText(losdatos.get(Constantes.posicion).getPermiso()).from(ElementosWebTodoTestUsuario.permisos),
               Click.on(ElementosWebTodoTestUsuario.libre),
               Enter.theValue(losdatos.get(Constantes.posicion).getPassword()).into(ElementosWebTodoTestUsuario.password),
               Enter.theValue(losdatos.get(Constantes.posicion).getConfirmarpass()).into(ElementosWebTodoTestUsuario.confirmar),
               Click.on(ElementosWebTodoTestUsuario.checkacepto),
               Click.on(ElementosWebTodoTestUsuario.checkleido),
               Click.on(ElementosWebTodoTestUsuario.confirmarm)
       );
    }
}
