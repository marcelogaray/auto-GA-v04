Feature: Personal

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
    Given 'SSI-D' pagina de inicio de sesion es cargada
    And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  Scenario Outline: Verificar Busqueda de Personal
    Given 'Menu principal' estee cargado
    And seleccionar menu 'Personal' en la pagina 'Menu Principal'
    And seleccionar submenu 'Personal' en menu 'Personal'
    When ingresar <correo> para 'Buscar Personal' en la tabla
    Then el resultado de 'Buscar Personal' deberia ser <resultado>
    Examples:
            | correo                 | resultado |
            | franzelunico@gmail.com | 1         |
            | asdfdiasdfasdfkasasdfs | 0         |
