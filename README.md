<h1>PROBLEMA DOS PICADINHOS</h1>
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

<p><b>PICADINHOS RUIM(1 a 1.000):</b> <b>Resultado:</b> 945 <b>Picadinhos:</b> 16 <b>Tempo:</b> 3225ms

<p><b>PICADINHOS MEDIO(1 a 10.000):</b> <b>Resultado:</b> 3465  <b>Picadinhos:</b> 24 <b>Tempo:</b> 169ms

<p><b>PICADINHOS (1 a 10.000):</b> <b>Resultado:</b> 3465 <b>Picadinhos:</b> 24 <b>Tempo:</b> 6ms
  <h2>MELHOR ALGORITMO</h2>
  <b>PICADINHOS(resultados para 1, 10 e 100 milhoes com o melhor algoritmo deste respositorio)</b>
  <p><b>1 milhao:</b> <b>Resultado:</b> 675.675  <b>Picadinhos:</b> 96 <b>Tempo:</b> 27ms
  <p><b>10 milhoes:</b> <b>Resultado:</b> 6.891.885 <b>Picadinhos:</b> 160 <b>Tempo:</b> 1234ms
  <p><b>100 milhoes:</b> <b>Resultado:</b> 72.747.675 <b>Picadinhos:</b> 288 <b>Tempo:</b> 15275ms
    
<h2>ATUALIZAÇÃO DE CASO</h2>
<p>Fiz uma otimização extra e adicionei neste repositório (PicadinhosGodLike.java), basicamente notei que os somatórios estavam em ordem sequencial nesses 2 fors, entao ao em vez de ficar chamando uma formula fechada que apresenta divisão e multiplicação (operaçoes que devem ter seus custos operacionais levados em conta) notei que seria melhor só fazer result+=j o que era bem mais barato que a formula (levando em conta que ela era usada literalmente milhoes de vezes). Isso apresentou uma melhora signitificativa no percentual de tempo que o programa demora pra responder, mas não foi nada representativo em questao de tempo real, ja que tratava-se de poucos milissegundos e porcentagem de poucos milissegundos são outros poucos milissegundos (inotável para um ser humano).
  
