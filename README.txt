Implementação de um padrão Adapter em Java, utilizando o conceito de tomada que pode ser adaptada para diferentes tipos de plugues, logo abaixo:

1) Tomada: classe que representa a tomada propriamente dita, que pode ser adaptada para diferentes tipos de plugues;

2) Plugue: classe abstrata que representa um plugue genérico, que pode ser adaptado para se encaixar na tomada;

3) PlugueDeDoisPinos: classe que representa um plugue com dois pinos;

4) PlugueDeTresPinos: classe que representa um plugue com três pinos;

5) AdaptadorDePlugue: classe que implementa o padrão Adapter, adaptando um plugue específico para ser utilizado na tomada.