Feature: Navegacion y busqueda de consulados en el portal de RENIEC

  Como ciudadano interesado en los consulados en el extranjero
  Quiero navegar en el sitio web de RENIEC
  Para buscar oficinas consulares que atiendan en la ciudad de Cuenca

  Scenario: El ciudadano busca la palabra "Cuenca" en la lista de consulados
    Given que el ciudadano abre la paina principal de RENIEC
    When hace clic en CONSULADOS EN EL MUNDO
    Then selecciona Lista de Consulados en el mundo
    And cambia a la nueva pestana abierta
    And escribe "Cuenca" en el campo de búsqueda de oficina consular
    And realiza la busqueda
    Then debería ver un mensaje con el texto "Cuenca"
    Then regresa a la pestana original
