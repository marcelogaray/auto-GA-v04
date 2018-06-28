  # Marcos Bustos Jimenez
  Feature: ValidarBotonAtrasEnFormularioCreacionRecursos

    Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
      Given 'SSI-D' pagina de inicio de sesion es cargada
      And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  # RF04-TC-136 Validar que el boton cancelar del formulario de creacion de recursos retorne al listado de recursos
    Scenario: RF04-TC-133 - Verificar la creacion de nuevos de Recursos
      Given 'Menu principal' estee cargado
      And seleccionar la opcion 'Programa SSO' del menu principal de la pagina 'Home'
      And seleccionar la opcion 'Recursos' en el sub menu de 'Programa SSO'
      And click en el boton 'Agregrar nuevo recurso' de la pagina 'Recursos'
      And click en el boton 'Cancelar' de la pagina 'Agregar Recursos'
      Then validar que la lista de la pagina 'Recursos' este visible