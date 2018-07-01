#Verify Pagination Next and Previvius
Feature: Verificar paginacion next y previus en lista de usuarios

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar la paginacion de la lista de usuario
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Personal' en la pagina 'Menu Principal'
    And Seleccionar submenu 'Usuario' en menu 'Personal'
    When seleccionar en boton next de la lista
    And seleccionar en boton de previus de la lista
    Then validar que la 'Lista de Usuarios' este visible