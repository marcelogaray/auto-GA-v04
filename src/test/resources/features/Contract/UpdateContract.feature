# Editar contratos

Feature: Update Contract

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar lista de Contratos este correctamente cargado
    Given menu principal este cargado en pagina de Inicio
    And seleccionar la opcion 'Personal' en la pagina 'menu principal'
    And seleccionar el submenu 'Contratos' del menu 'Personal'
    And mostrar 'Lista de Contratos'
    And seleccionar boton Editar del primer item lista contratos
    And modificar datos del 'formulario de Contrato a Editar'
      | contractCodesEdit | contractDescriptionsEdit   | contractSalarysEdit | contractDatesEdit     |
      | 0028          | descripcion Pruebas          | 3500            | 06/25/2018        |
    Then seleccionar boton 'Enviar' para grabar los datos editados del formulario

