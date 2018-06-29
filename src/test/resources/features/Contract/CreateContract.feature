# Crear contratos

Feature: Create Contract

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Agregar nuevo contrato
    Given menu principal este cargado en pagina de inicio
    And seleccionar la opcion 'Personal' en la pagina 'menu principal'
    And seleccionar el submenu 'Contratos' del menu 'Personal'
    And mostrar 'Lista de Contratos'
    And seleccionar boton Agregar Nuevo Contrato del Area de contratos
    And llenar 'formulario de Contrato Nuevo'
      | contractCodes | contractDescriptions   | contractSalarys | contractDates     |
      | 111         | contrato seguro            | 3800           | 06/22/2018        |
    Then seleccionar Boton 'Enviar' para grabar los datos del formulario

