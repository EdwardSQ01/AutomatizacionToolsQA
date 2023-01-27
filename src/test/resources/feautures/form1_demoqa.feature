Feature: Dado que el usuario ingrese a tools qa entonces debe

  @Prueba
  Scenario Outline: Completar el primer formulario ToolsQA
    Given Ingreso al sitio web ToolsQA
    When Completo los campos del formulario <Nombre>, <Apellido>, <Email>,  <Telefono>
    And  Adjunto una imagen en el formulario
    Then Confirmo el envio del primer formulario

    Examples:

      | Nombre | Apellido | Email   |Telefono|
      | Edward | Susa     | esusa@pibox.app |313521771|
