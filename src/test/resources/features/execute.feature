@test
Feature: Sanity limpieza y aprovisionamiento de recursos

  yo como que quiero realizar una limpieza de recursos
  cargar la mercancia y el inventario en la plataforma epos

  @epos
  Scenario: se quiere ingresar a la plataforma epos
    Given Se ejecutan procedimientos en bd y soapUi
    When Se ingresa a la plataforma epos para cargue de inventario
      | user       | password   |
      | CQ10960370 | Tigo.2018* |
    And Se ingresa a entrada masiva de mercancia
    Then Se completa datos para cargar mercancia

  @inventory
  Scenario: realizar el cargue de inventario
    Given Se ingresa a la plataforma epos para cargue de inventario
      | user       | password   |
      | CQ10960370 | Tigo.2018* |
    When  Se ingresa a cargue de inventario
    Then Deberia poder realizar el cargue de inventario

  @windex
  Scenario: realizar la confirmacion de inventario
    Given se ingresa a la plataforma epos windex
      | user       | password   |
      | CQ10960370 | Tigo.2018* |
    When se confirma la asignacion de inventario
    Then se deberia poder ver mensaje de confimacion exitosa

  @portal
  Scenario: se requiere realizar una activacion de una linea en prepago
    Given Se ingresa al portal CRM para activacion prepago
      | user       | password   |
      | CQ10960370 | Tigo.2022* |
    When Se hace activacion de una linea en prepago
    Then Se deberia ver en pantalla unica la linea activa en prepago
