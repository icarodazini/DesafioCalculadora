# Desafio TROPA DO JAVA 1 - Desafio Calculadora
Desafio 1 - Construção de uma calculadora para diversos fins.

PRIMEIRO - Dêm fork no projeto e conforme forem progredindo, adicionem as suas branches para o ramo principal 
para que eu avalie e aceite.

![](../../../../../AppData/Local/Temp/68747470733a2f2f646f63732e6769746875622e636f6d2f6173736574732f696d616765732f68656c702f7265706f7369746f72792f666f726b5f627574746f6e2e706e67.png)

Acesse o FORK criado e faça o git CLONE normalmente.

Após concluído, utilize:

git checkout -b "NOMEDABRANCH"

git add . 

git commit -m "NomeDasAlterações"

git push.

*PRIMEIRO DESAFIO*

O desafio consiste na criação de uma super calculadora, que vai possuir diversas funções de cálculo. A calculadora deverá ser criada utilizando o Java e Maven.

Você deverá criar uma calculadora que respeite as regras de negócios descritas a seguir e que consiga resolver todos os problemas propostos.

No arquivo de inicialização, você poderá colocar SOMENTE uma chamada para a aplicação que deverá ser feita com um switch case em outra classe SEPARADA!


REGRAS DA CALCULADORA


A calculadora deverá possuir 4 funções.

1 - A primeira função é uma calculadora básica, onde ela deverá realizar as 4 operações matemáticas básicas - Adição, subtração, multiplicação e divisão.

1.1 - Regra de negócio 1 - O usuário poderá escolher entre 4 opções, e realizar uma delas com DOIS NÚMEROS.

1.2 - Regra de negócio EXTRA - O usuário poderá fazer a mesma coisa que a opção anterior, porém ele poderá digitar antes dos cálculos, quantos números ele deseja operar (soma com 5, 10, 20 números por exemplo).

2 - A segunda função é uma calculadora de IMC, onde o usuário deve digitar seu NOME, IDADE, PESO E ALTURA, e obter a seguinte resposta:

:: Você, FULANONOME, que possuí 999 ANOS, está com o IMC de 9999 e se enquadra na faixa de OBESIDADE AGUDA. ::

2.1 - Regra EXTRA - Você poderá aplicar a orientação a objetos aqui, criando para cada usuário participante um OBJETO, em que será possível salvar essas informações para posterior consulta.

3 - A terceira função é uma calculadora de imposto de renda, onde o usuário deverá digitar a sua renda mensal BRUTO e a calculadora deverá devolver o salário LÍQUIDO que está pessoa receberá:

3.1 - Busque a tabela de imposto de renda atual vigente no Brasil e calcule com base nele, os campos de entrada são: Nome, idade e salário, e a resposta deverá ser:

:: Você, FULANONOME, que possuí 999 ANOS, recebe 99999 reais BRUTOS POR MÊS, está na faixa de imposto de 999% E, por isso, receberá LÍQUIDO 99999R$.

3.2 - O valor BRUTO e liquido deverá possuir SOMENTE duas casas decimais após a vírgula.

3.3 - EXTRA - Você deverá implementar uma função que diz de acordo com o que ele receber, se ele receberá mais dinheiro como pessoa FÍSICA OU JURÍDICA (procure saber a % como PJ).


4 - Calculadora de Gasolina - O usuário deverá saber quantos LITROS de gasolina ele vai gastar para realizar uma viagem, portanto, o usuário deverá digitar:

Quantos KM por litro de gasolina o carro faz

Quantos KM ele deverá percorrer

Qual o valor atual da Gasolina no posto que ele abastece.

4.1 - A calculadora deverá responder quantos LITROS ele precisará abastecer em seu carro e qual o VALOR que ele vai gastar para realizar a viagem.

4.EXTRA - oferecer a opção do usuário colocar somente ida ou ida e volta

4.EXTRA 2 - Oferecer a opção do usuário colocar a opção de alcool ou gasolina para o usuário e dizer qual a opção mais vantajosa no momento.


