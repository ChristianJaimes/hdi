@operacion
@suma
Feature: Sumar

  Background:
    Given Cesar quiere realizar una operacion matematica
    Given Cesar quiere realizar una operacion matematica

  @positivo
  Scenario: Sumar numeros enteros
    When Cesar suma 2 mas 2
    Then Cesar deberia ver que el resultado es 4

  @negativo
  Scenario: Sumar numeros negativos
    When Kate suma -2 mas -2
    Then Kate deberia ver que el resultado es -4