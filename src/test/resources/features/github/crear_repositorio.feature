@repo
Feature: Crear Repositorio
  Yo como suario de github quiero crear repositorios para versionar mi codigo fuente

  Scenario: Crear Repositorio Exitosamente
    Given Christian esta autenticado
      | aaaa | aaa |
    When Christian crea un repositorio
    Then Christian debe ver la pagina del nuevo repositorio