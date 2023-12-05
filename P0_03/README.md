PO_03

QUESTÃO 1: Exceções são erros que podem ocorrer durante a execução de um programa. Tais erros podem ser de lógica, conversões, acessos entre outros. 
Mesmo para o programador experiente é praticamente impossível prever todos os erros que podem ocorrer.

QUESTÃO 2: As checked exceptions são as exceções verificadas em tempo de compilação, ou seja, se algum código dentro do método lançar uma exceção verificada, o método deve tratar a exceção ou deve re-lançar a exceção usando a palavra-chave throws.
As unchecked exceptions são as exceções que não são verificadas no momento da compilação, ou seja, se um método lançar uma exceção não verificada, o compilador não vai obrigar a usar try catch nem re-lançar a exceção usando throws.
A maior diferença entre as exceções verificadas e não verificadas é que as exceções verificadas são forçadas pelo compilador e usadas para indicar condições excepcionais que estão fora do controle do programa, enquanto as exceções não verificadas ocorrem durante o tempo de execução e são usadas para indicar erros de programação.

QUESTÃO 3: Não consumir a Exception depois de capturar ela;
           Crie as suas Exceptions;
           Logue a Exception ou de Throw, mas nunca faça as duas coisas;
           Nunca devolva uma exception dentro de um bloco de Finally.
           
