@test
Feature: Sanity limpieza y aprovisionamiento de recursos

  yo como que quiero realizar una limpieza de recursos
  cargar la mercancia y el inventario en la plataforma epos

  Scenario: se quiere ingresar a la plataforma epos
    Given Se ejecutan procedimientos en bd y soapUi
    When Se ingresa a la plataforma epos para cargue de inventario
      | user       | password   |
      | CQ10960370 | Tigo.2018* |
    Then Se ingresa a entrada masiva de mercancia
    And  Se completa datos para cargar mercancia

