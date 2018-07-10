
Feature: Add new personnel

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario Outline: Verificar la creacion de un nuevo Personal.
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Personal' en la pagina 'Menu Principal'
    And click en el submenu 'Personal'
    Given click en el boton 'Agregar nuevo personal'
    When llenar el campo nombre <nombre>
    When llenar el campo apellido <apellido>
    When llenar el campo email <email>
    When llenar el campo direccion <direccion>
    When llenar el campo telefono <telefono>
    When seleccionar el 'Area' de instalaciones hidricas 
    Then click en 'Enviar' el nuevo personal
    Examples:
            | nombre | apellido     | email             | direccion       | telefono |
            | Romulo | Zoto torrez  | romu@gmail.com    | America Nro 345 | 69504113 |
