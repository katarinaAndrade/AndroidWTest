# AndroidWTest

Project Status : under construction 🚧 

done ✅ - Kolin Gradle

done ✅ - Multi modules

under construction 🚧 - Clean Architecture

under construction 🚧 - Funcionalidade 1

A app deverá recolher a lista de códigos postais existente num ficheiro CSV publicado em
https://github.com/centraldedados/codigos_postais , fazendo o download desse ficheiro.
A recolha dos códigos postais deverá ser feita no primeiro, e somente no primeiro, arranque da aplicação.
Ou seja, a lista deverá ser gravada localmente para evitar nova recolha; exceptuando quando a app
termina antes do download estar completo.
Enquanto o download ocorre, a app deverá apresentar um indicador de actividade.
Enunciado

under construction 🚧 - Funcionalidade 1

A app deverá apresentar um ecrã que liste códigos postais.
Cada entrada deverá apresentar o código postal no formato ####-### , em conjunto com a designação
postal.
O ecrã deverá ser pesquisável, assincronamente.
O teclado não deverá sobrepor-se a nenhuma entrada na lista; ou seja, se for feito scroll até ao fundo
do ecrã, a última entrada não deverá ficar atrás do teclado.
Deverá ser possível pesquisar por código ou nome, não sendo necessário inserir o nome por inteiro ou por
ordem; além disso, a pesquisa deverá ser insensível a diacríticos e à caixa usada. Exemplificando, os
resultados das seguintes pesquisas deverão conter 
  
  "2695-650, São João da Talha":
  "2695"
  "2695-650"
  "2695 650"
  "São João"
  "sAo joA da TaLH"
  "sao talha"
  "talh joa"
  "joao talha"
  "talha 650 joao"

É de evitar o uso de memória de trabalho (por exemplo, arrays); ou seja, dever-se-á tirar proveito de uma
base de dados.
