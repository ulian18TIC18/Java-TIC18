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
           
Palavras-Chave:
1- try: Define um bloco de código no qual exceções podem ocorrer.
2- catch: Captura e trata exceções específicas. Pode haver vários blocos catch para tratar diferentes tipos de exceções.
3- finally: Define um bloco de código que é sempre executado, independentemente de ocorrer ou não uma exceção. Geralmente utilizado para liberar recursos.
4- throw: Utilizado para explicitamente lançar uma exceção.
5- throws: Indica que um método pode lançar exceções específicas. Deve ser declarado na assinatura do método.
6- try-with-resources (Java 7+): Utilizado para simplificar o tratamento de recursos que implementam a interface AutoCloseable ou Closeable.

Práticas Comuns:
1: Identificar Exceções Adequadas: Escolher as exceções apropriadas para capturar e tratar, considerando o tipo específico de problema que pode ocorrer.
2: Não Capturar Exceções Demais: Evitar capturar exceções genéricas demais, como Exception ou Throwable, a menos que seja estritamente necessário.
3: Log de Exceções: Registrar informações sobre exceções, incluindo mensagens de erro e pilhas de chamadas, para facilitar a depuração.
4: Tratamento de Exceções Significativo: O tratamento de exceções deve ser significativo e proporcional ao contexto do aplicativo. Em alguns casos, pode ser apropriado relançar a exceção se não puder ser tratada adequadamente naquele ponto.
5: Bloco finally para Liberação de Recursos: Utilizar blocos finally para garantir que os recursos sejam liberados corretamente, mesmo em caso de exceção.
6: Encadeamento de Exceções (Java 7+): O Java permite encadear exceções usando o construtor de exceções que aceita uma exceção anterior como causa (Throwable).
7: Exceções Não Verificadas para Situações Irrecuperáveis: Reservar o uso de exceções não verificadas (subclasses de RuntimeException) para situações irrecuperáveis, como erros de programação ou condições imprevisíveis.
8: Evitar Suprimir Exceções: Evitar o uso excessivo de blocos try-catch para suprimir exceções sem realizar ações significativas no bloco catch.
9: Utilizar try-with-resources para Recursos: Ao lidar com recursos que implementam AutoCloseable ou Closeable, utilizar o try-with-resources para garantir que os recursos sejam fechados automaticamente.

QUESTÃO 4: Bloco try/catch serve para tratamento de exceções, tratamento de códigos que podem não ser totalmente atendidos e gerarem alguma exceção/erro.
O try consegue recuperar erros que possam ocorrer no código fornecido em seu bloco.
O catch por sua vez faz o tratamento dos erros que aconteceram.

QUESTÃO 5: Tratamento de Exceções Personalizadas com Spring Boot em Java
No desenvolvimento de aplicativos Java usando o framework Spring Boot, o tratamento de exceções é uma parte essencial para garantir uma experiência de usuário suave e lidar adequadamente com erros inesperados. O Spring Boot oferece recursos robustos para capturar e tratar exceções de maneira personalizada, permitindo que os desenvolvedores personalizem o comportamento de manipulação de erros de acordo com as necessidades específicas do aplicativo.

Entendendo as Exceções no Spring Boot
Antes de mergulharmos na criação de tratamentos de exceções personalizados, é importante entender como o Spring Boot lida com exceções internamente. O Spring Boot emprega um mecanismo de manipulação de exceções centralizado chamado "ExceptionHandler". Esse mecanismo captura exceções lançadas por um controlador (controller) e trata-as de acordo com a lógica definida pelo desenvolvedor.
O ponto de partida para o tratamento de exceções personalizadas no Spring Boot é a anotação @ControllerAdvice. Essa anotação marca uma classe como um manipulador de exceções global, que será aplicado a todos os controladores no aplicativo. Por meio do @ControllerAdvice, é possível definir métodos para lidar com exceções específicas ou genéricas.
