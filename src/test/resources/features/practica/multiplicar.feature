@operacion
@multiplicacion
Feature: multiplicar
  esto es una multiplicacion

  @positivo
  Scenario Outline: multiplicacion
    When cesar multiplica <factorUno> por <factorDos>
    Then cesar deberia ver que el resultado de la multiplicacion es <resultado>
    Examples:
      | factorUno | factorDos | resultado |
      | 2         | 2         | 4         |
      | 5         | 5         | 25        |