
# viavarejo
Teste Via Varejo

Para realizar o teste da API enviada, realizar os seguintes procedimentos:

1 - Abrir o programa (Essa API foi realizada via Eclipse)
2 - Rodar a aplicação da classe Application.java (Para rodar a aplicação com o Spring boot)
3 - Abrir o software "Postman", Selecionar o tipo de requisição que será enviada (No nosso caso será o "Post"), e no campo de inserir a url colocar o seguinte parametro: "localhost:8080/negociacao/comprar" 
4- No campo "Body", selecionar como "raw" e colocar no formato "JSON".
5- Colocar o seguinte parametro no campo "Body":

{
"produto" : {"codigo" : 2, "nome" : "Produto", "valor" : 600 },

"condicaoPagamento" : {"valorEntrada" : 500, "qtdeParcelas" : 6}

}

e apertar o "SEND"

6- Após isso, será vizualizado o número de parcela indicado, o valor de cada parcela e a taxa de juros ao mês (O juros será aplicado somente quando o número de parcelas for superior a 06 (seis) parcelas)
