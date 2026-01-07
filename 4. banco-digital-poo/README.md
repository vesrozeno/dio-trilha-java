# 💳 Banco Digital (POO)

Desafio desenvolvido para **consolidar os principais conceitos de Programação Orientada a Objetos**, por meio da implementação das regras básicas de funcionamento de um **banco digital**.
O foco do projeto foi transformar conceitos teóricos em **soluções práticas**, priorizando organização, reutilização de código e clareza na modelagem do domínio.

Durante o desenvolvimento, foram simuladas operações bancárias essenciais, aplicando boas práticas de design orientado a objetos e separação de responsabilidades.

**Conceitos explorados:**

- Abstração para modelar entidades e comportamentos do domínio bancário
- Interfaces para definição de contratos e padronização de funcionalidades
- Herança para reaproveitamento e especialização de classes
- Polimorfismo para flexibilizar comportamentos em tempo de execução
- Estruturação e organização do código seguindo princípios de POO

Além do que foi desenvolvido durante as aulas, foi criado um método que lista o nome de todos clientes do banco:

```java
public void imprimirClientes() {
        if (contas == null || contas.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        System.out.println("Clientes titulares:");
        java.util.Set<String> nomes = new java.util.LinkedHashSet<>();
        for (Conta c : contas) {
            if (c.getCliente() != null && c.getCliente().getNome() != null) {
                nomes.add(c.getCliente().getNome());
            }
        }

        for (String nomeCliente : nomes) {
            System.out.println(nomeCliente);
        }
    }

```
