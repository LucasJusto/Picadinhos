Repositório que guarda o algoritmo mais rápido (que eu ja consegui fazer) para o problema dos picadinhos.

Problema dos picadinhos:
Imagine o número 15
<p> 1+2+3+4+5 = 15
<p> 4+5+6 = 15
<p> 7+8 = 15
<p> 15 = 15

Estes 4 somatórios de números sequenciais (ordem dos naturais) tem como resultado 15, ou seja 15 tem 4 picadinhos.
Sabendo o que são picadinhos de um número, o problema trata de dizer qual o número com mais picadinhos de 1 a 1 milhão, o que
se for feito com um algoritmo simples demora vários dias para um computador responder. Eu consegui fazer este código
que resolve o problema em menos de 1 segundo e começa a ter demora notavel somente do 1 a 100 milhões (15 segundos).

<b>Algoritmo 1 (PicadinhosRuim)</b>:
  <p>É o algoritmo que mais demora. Demora vários dias para responder de 1 a 1 milhão. Ele simplesmente testa todos os somatórios possiveis de 1 até (n/2)+1 ( por que se somar metade+1 + metade+2 sempre vai dar maior que o número ) para cada n de 1 até 1 milhão.
  
 <b>Algoritmo 2 (PicadinhosMedio)</b>
 <p> É o algoritmo desenvolvido no segundo contato com o problema, ja com algumas otimizaçes como trocar o calculo de somatórios ( ao em vez de usar laços usar a fórmula de gauss que é O(1) e nao O(n) como laços). E ficar alterando inicio e fim de acordo com o resultado do somatorio anterior. Mas isso ainda testa varios somatorios repitidos para cada n de 1 até 1 milhao.
 <p><b>Algoritmo 3 (Picadinhos)</b>
  <p>É o melhor algoritmo desenvolvido por mim até agora para os picadinhos, foi desenvolvido no terceiro contato com o problema dos picadinhos. Ele basicamente nota que no algoritmo antigo testavamos vários somatorios mais de uma vez, e entao seria mais inteligente testar todos os possiveis direto e só anotar quantos somatorios tem como respostas os numeros de 1 a 1 milhao. E a cada iteraçao dessas ver o maior ja achado até entao.

<b>COMPARAÇÃO DOS 3 ALGORITMOS:</b> (resposta, picadinhos, tempo em ms)

<p>PICADINHOS RUIM(1 a 1.000): 945 16 3225ms

<p>PICADINHOS MEDIO(1 a 10.000): 3465  24 169ms

<p>PICADINHOS (1 a 10.000): 3465 24 6ms
  
  <b>PICADINHOS(resultados para 1, 10 e 100 milhoes com o melhor algoritmo deste respositorio)</b>
  <p><b>1 milhao:</b> <b>Resultado:</b> 675.675 <b>Resultado:</b> <b>Picadinhos:</b> 96 <b>Tempo:</b> 61ms
  <p><b>10 milhoes:</b> <b>Resultado:</b> 6.891.885 <b>Picadinhos:</b> 160 <b>Tempo:</b> 1234ms
  <p><b>100 milhoes:</b> <b>Resultado:</b> 72.747.675 <b>Picadinhos:</b>288 <b>Tempo:</b>15275ms
  
