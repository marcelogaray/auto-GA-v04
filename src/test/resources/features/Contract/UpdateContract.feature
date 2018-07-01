# Editar contratos

Feature: Editar contratos

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Editar los datos de un item
    Given menu principal este cargado en pagina de inicio
    And seleccionar la opcion 'Personal' en la pagina 'menu principal'
    And seleccionar el submenu 'Contratos' del menu 'Personal'
    And mostrar 'Lista de Contratos'
    And seleccionar boton Editar del primer item lista contratos
    And modificar datos del 'formulario de Contrato a Editar'
      | contractCodesEdit | contractDescriptionsEdit   | contractSalarysEdit | contractDatesEdit     |
      | 0028          | descripcion Pruebas          | 3500            | 06/25/2018        |
    And click en el boton 'Enviar' para grabar los datos editados del formulario
    Then validar que la 'Lista de Contratos' este visible

