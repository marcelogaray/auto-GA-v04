  # Marcos Bustos Jimenez

  Feature: AgregarRecursos

  Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
   Given 'SSI-D' pagina de inicio de sesion es cargada
   And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

  # RF04-TC-127 feature review the display header list of resources
  Scenario: RF04-TC-127 - Verificar la creacion de nuevos de Recursos
  Given 'Menu principal' estee cargado
  And menu 'Programa SSO' este seleccionado de la pagina 'Home'
  And seleccionar sub menu 'Recursos'
  And click en el boton 'Agregrar nuevo recurso' de la pagina 'Recursos'
  And llenar el formulario con valores validos de la pagiga 'Agregar Recursos' costo = "100.5" y detalle = "Test"
  Then validar que la lista de la pagina 'Recursos' este visible