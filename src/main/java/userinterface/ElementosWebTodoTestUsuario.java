package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebTodoTestUsuario {
    public static final Target aceptar=Target.the("click en aceptar").located(By.xpath("//button[@class='sc-bwzfXH fOfeoe']"));
    public static final Target registrarse=Target.the("click en registrase").located(By.xpath("//a[@class='op_d']"));
    public static final Target nombre =Target.the("ingreso nombre").located(By.id("nom"));
    public static final Target apellido =Target.the("ingreso apellido").located(By.id("ape"));
    public static final Target email =Target.the("ingreso email").located(By.id("email"));
    public static final Target edad =Target.the("ingreso edad").located(By.id("any"));
    public static final Target telefono=Target.the("ingreso telefono").located(By.id("tel"));
    public static final Target postal=Target.the("ingreso codigopostal").located(By.id("cp"));
    public static final Target pais=Target.the("ingreso pais").located(By.id("pais"));
    public static final Target sexoh=Target.the("click hombre").located(By.xpath("//label[contains(text(),'Hombre')]"));
    public static final Target sexom=Target.the("click mujer").located(By.id("sex_d"));
    public static final Target permisos=Target.the("select permiso").located(By.id("perm"));
    public static final Target libre=Target.the("click en voy libre").located(By.xpath("//label[contains(text(),'Voy por libre.')]"));
    public static final Target password=Target.the("ingreso password").located(By.id("contra"));
    public static final Target confirmar=Target.the("ingreso confirmar").located(By.id("contrarep"));
    public static final Target checkacepto=Target.the("click en aceptar").located(By.xpath("//label[contains(text(),'Acepto ser informado de vuestros descuentos por ma')]"));
    public static final Target checkleido=Target.the("click en heleido").located(By.xpath("//div[@class='checkbox dotinf']//label[1]"));
    public static final Target confirmarm=Target.the("click en confirmar").located(By.xpath("//a[@id='bot_reg']"));
    public static final Target verificacion=Target.the("verificar questions").located(By.xpath("//div[@class='tit']"));
}
