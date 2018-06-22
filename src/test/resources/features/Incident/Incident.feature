# Incident Feature
  Feature: Lista de Incidentes

    Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
      Given 'SSI-D' pagina de inicio de sesion es cargada
      And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

    Scenario: Verificar que la cabecera de lista de Incidentes deben ser mostrados correctamente.
      Given Menu principal estee cargado
      And Presionar en la opcion Incidentes del menu principal
      Then Verificar que la tabla de incidentes se muestre correctamente