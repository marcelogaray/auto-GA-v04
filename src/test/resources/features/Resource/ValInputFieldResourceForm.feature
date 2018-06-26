  # Marcos Bustos Jimenez

  Feature: ValidarInputFieldsEnFormularioCreacionRecursos

    Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
      Given 'SSI-D' pagina de inicio de sesion es cargada
      And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  # RF04-TC-129 Validar componentes del formulario de creación de Recurso (Costo inputField, Detalle inputField)
    Scenario: RF04-TC-127 - Verificar la creacion de nuevos de Recursos
      Given 'Menu principal' estee cargado
      And menu 'Programa SSO' este seleccionado de la pagina 'Home'
      And seleccionar sub menu 'Recursos'
      And click en el boton 'Agregrar nuevo recurso' de la pagina 'Recursos'
      Then validar que el inputField 'Costo' este visible
      And validar que el inputField 'Detalle' este visible