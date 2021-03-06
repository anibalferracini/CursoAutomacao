#language: pt
  #encoding: UTF-8
  @ui
  Funcionalidade: Trello UI
    @ui
    Esquema do Cenario: Criando, comentando e deletando um Card
      Dado que esteja logado no trello
      E acesse o board
      Quando crio um card com o nome "<Card Name>"
      E comento "<Comment>"
      Entao o card deve ester na lista
      Quando excluo o card
      Entao o card nao existe mais
      Exemplos:
        |Card Name    | Comment                 |
        |Neto Card 1  | Comentario Neto Card 1  |
