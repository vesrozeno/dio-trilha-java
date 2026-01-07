# 🧠 Abstraindo o Bootcamp

Projeto para praticar conceitos de **abstração** e **orientação a objetos** através da modelagem de um Bootcamp com conteúdos (cursos e mentorias) e desenvolvedores que se inscrevem e concluem estes conteúdos.

## 🔍 O que foi desenvolvido

- **Classes principais:** `Content` (abstrata), `Course`, `Mentorship`, `Bootcamp`, `Dev` e `App` (classe com o método `main` que demonstra o fluxo).
- **Fluxo implementado:** criação de cursos e mentorias; agrupamento em um `Bootcamp`; inscrição de `Dev` no bootcamp; progresso dos devs consumindo conteúdos e cálculo de XP acumulado.
- **Coleções e datas:** uso de `Set` (com `LinkedHashSet` para manter ordem de inserção) e `LocalDate` para data de mentorias e duração do bootcamp.

## ✅ Conceitos explorados

- Abstração (classe abstrata `Content`)
- Herança e polimorfismo (`Course` e `Mentorship` estendem `Content`)
- Estruturas de dados (`Set`, `LinkedHashSet`, `HashSet`)
- Encapsulamento e boas práticas de modelagem em Java
