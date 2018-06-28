#Create user
Feature: Create user

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar la creacion de usuarios desde 'Formulario de Usuario'
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Personal' en la pagina 'Menu Principal'
    And Seleccionar submenu 'Usuario' en menu 'Personal'
    And Hacer clic en el boton 'Agregar Nuevo Usuario'
    When Formulario de 'Registro Nuevo Usuario' este cargado
    And Registrar usuarios con username, password con los siguiente datos
      | username | password  | userActive |
      | tom      | password1 | true       |
    And Presionar en el Boton de 'Guardar' para guardar la informacion
    Then Validar que la 'Lista de Usuarios' este visible

