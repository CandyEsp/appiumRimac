Feature: LOGIN RIMAC

  @RIMAC
  Scenario Outline: Login Exitoso

    Given Ingreso a la aplicacion de RIMAC
    When Ingreso el user "<caso_prueba>"
    And la contrasena "<caso_prueba>"
    Then se da clic en el boton Iniciar



    Examples:
      | caso_prueba |
      |           1 |
