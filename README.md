# RockBar
RockBar é um sistema de gerenciamento de bebidas. Foi um trabalho realizado para a disciplina de POO2, aplicando os padrões de projeto Strategy, Decorator e Observer.

**Explicação do Sistema** <br>
O sistema de gerenciamento de bebidas, onde o cliente de uma mesa solicita uma bebida, o bartender registra o pedido e a mesa, e notifica a todos dos pedidos que foram solicitados.

**Explicação do uso dos padrões de Projeto**
- O padrão Observer foi utilizado para gerenciamento dos pedidos, registrando o pedido em si(a bebida escolhida) e qual mesa essa bebida pertence, além de registrar todos os pedidos feitos em um array, com as possibilidades de registrar, remover e notificar(pecorrer todo array e printar os pedidos feitos)
- O padrão Strategy foi utilizado para criar as variações de bebidas e todos seu tipo específico de bebidas, com preço, nome e descrições desse produto.
- O padrão Decorator foi utilizado para incrementar mais ingredientes as Bebidas do tipo Drink, assim é possível selecionar mais ingredientes, e de forma que o preço e os ingredientes são somados no preço e descrição final do drink.

# CONTRIBUTING
Fiquem a Vontade para fazer melhorias, um design bacana para esse sistema, o que a criatividade permitir.
