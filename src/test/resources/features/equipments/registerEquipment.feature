
  Feature: Register Equipment

    Background: Pagina de inicio es mostrada una vez que se ponen los credenciales correctos de inicio de sesión
      Given 'SSI-D' pagina de inicio de sesion es cargada
      And Ingresar los credenciales validos en la pagina 'Login' para ingresar al sistema

    Scenario: Verificar el registro de un nuevo usuario desde 'Formulario de Equipamiento'
      Given 'Menu principal' estee cargado
      And seleccionar menu 'Equipamiento' en la pagina 'Menu Principal'
      And seleccionar submenu 'Equipamiento' en menu 'Equipamiento'
      And hacer Click en el boton 'Crear nuevo Equipamiento'
      When formulario de 'Registro de nuevo Equipamiento' esta cargado
      And registrar equipamiento con datos validos como ser
        | equipmentName | equipmentType | equipmentDesc     | equipmentImage       |
        | Air Drill     | equipo        | Description Drill | C:\\Users\\drill.jpg |
      Then verificar que la 'Lista de Equipamientos' este visible