#Create user
Feature: Create user

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar la creacion de usuarios desde 'Formulario de Usuario'
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Personal' en la pagina 'Menu Principal'
    And seleccionar submenu 'Usuario' en menu 'Personal'
    And hacer clic en el boton 'Agregar Nuevo Usuario'
    When formulario de 'Registro Nuevo Usuario' este cargado
    And registrar usuarios con username, password con los siguiente datos
      | username | password  | userActive |
      | tom      | password1 | true       |
    And presionar en el Boton de 'Guardar' para guardar la informacion
    Then validar que la 'Lista de Usuarios' este visible

