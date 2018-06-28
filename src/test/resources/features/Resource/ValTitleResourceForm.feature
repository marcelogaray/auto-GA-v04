  # Marcos Bustos Jimenez

  Feature: ValidarTituloFormularioCreacionRecursos

    Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
      Given 'SSI-D' pagina de inicio de sesion es cargada
      And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  # RF04-TC-128 feature review title form create resource
    Scenario: RF04-TC-127 - Verificar el título del formulario de creación de un nuevos de Recursos
      Given 'Menu principal' estee cargado
      And seleccionar la opcion 'Programa SSO' del menu principal de la pagina 'Home'
      And seleccionar la opcion 'Recursos' en el sub menu de 'Programa SSO'
      And click en el boton 'Agregrar nuevo recurso' de la pagina 'Recursos'
      Then validar si el titulo 'Crear Recurso' es visible en la pagina de 'Agregar Recursos'