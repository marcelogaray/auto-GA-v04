#Listar Equipamientos
@ListEqui
Feature: List Equipments

    Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
      Given 'SSI-D' pagina de inicio de sesion es cargada
      And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

    Scenario: Verificar lista de Equipamientos este correctamente cargado
      Given 'Menu principal' estee cargado
      And seleccionar menu 'Equipamiento' en la pagina 'Menu Principal'
      And seleccionar submenu 'Equipamiento' en menu 'Equipamiento'
      Then verificar que la 'Lista de Equipamientos' este visible