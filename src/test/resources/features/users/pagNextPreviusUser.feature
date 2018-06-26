#Verify Pagination Next and Previvius
Feature: Verificar paginacion Next y Previus en lista de usuarios

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario: Verificar lista de Usuarios este correctamente cargado
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Personal' en la pagina 'Menu Principal'
    And Seleccionar submenu 'Usuario' en menu 'Personal'
    When Seleccionar en boton next de la lista
    And Seleccionar en boton de previus de la lista
    Then Validar que la 'Lista de Usuarios' este visible