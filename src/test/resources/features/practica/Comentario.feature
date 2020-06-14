Feature: Comentario

  Scenario: agrego un comentario
    When cesar en la seccion de PCs agrega el comentario
    """
    Esto es un comentario
    bastante largo y que tiene
    mucha informacion
    """
    Then Cesar debe ver el nuevo comentario