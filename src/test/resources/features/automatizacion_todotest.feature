Feature: Realizar un registro de manera exitosa en el sitio web todotest
  como usuario
  quiero Ingresar al sitio web www.todotest.com y diligenciar todos los datos
  para Registrar un usuario
  @caso1
  Scenario: ingresar al sito web y realizar el registro de un usuario
    Given ingreso al sitio web
    When  Diligenciar todos los campos y registrar un usuario
     |  nombre     |  apellido   | correo           |edad      |telefono     |postal|pais        | sexo   |permiso    |permisoc1|tipo         |password   |confirmarpass|
     |    jairo    |  nombre     | usb112@gmail.com |De 25 a 34| 302145263   |12345 |Colombia    |Hombre  |B (Turismo)| Si      |Voy por libre|Pjairo123  |Pjairo123    |
    Then  Verificar el registro exitoso"Registro confirmado"
