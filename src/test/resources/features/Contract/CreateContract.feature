# Crear contratos
@create
Feature: Create Contract

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Agregar nuevo contrato
    Given Pagina de inicio cargada correctamente
    And Ingresar a menu 'Personal' en la pagina del 'Menu Principal'
    And Ingresar al submenu 'Contratos' en menu 'Personal'
    And Mostrar 'Lista de Contratos'
    And Seleccionar boton Agregar Nuevo Contrato del Area de contratos
    And Llenar 'formulario de Contrato Nuevo'
      | contractCodes | contractDescriptions   | contractSalarys | contractDates     |
      | 0007          | descripcion            | 3500            | 06/22/2018        |
    And Seleccionar Boton 'Enviar' para grabar los datos del formulario

