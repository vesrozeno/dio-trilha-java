# 📱 Desafio UML iPhone

Este desafio faz tem como objetivo aplicar **conceitos de orientação a objetos** e **modelagem UML**, simulando as funcionalidades básicas de um iPhone.

---

## 🎯 Objetivo do Desafio

Modelar e implementar, em Java, um dispositivo **iPhone** capaz de desempenhar três funções principais:

- Navegador de internet
- Reprodutor de música
- Telefone

Essas funcionalidades são representadas por **interfaces**.

---

### Interfaces criadas

- **WebBrowser**

  - Responsável por ações de navegação na web

- **MusicPlayer**

  - Responsável pela reprodução de músicas

- **Phone**

  - Responsável por funcionalidades telefônicas

Cada interface define um **contrato** que deve ser obrigatoriamente implementado pelas classes que a realizam.

---

### Relação UML Utilizada

Foi utilizada a relação **Realization (`..|>`)**, que em UML representa a **implementação de uma interface por uma classe**.

Isso equivale, em Java, ao uso da palavra-chave `implements`.

Sendo assim, uma classe `IPhone` implementa as 3 interfaces, enquanto uma classe `Safari`, `IPod` ou `Mobile Phone` implementariam apenas uma das três.

![Diagrama](https://github.com/vesrozeno/dio-trilha-java/blob/main/uml-iphone/images/uml-iphone.png?raw=true)

## 📚 Conceitos Trabalhados

- Orientação a Objetos
- Interfaces em Java
- Implementação múltipla de interfaces
- Contratos de comportamento
- Diagrama de Classes UML
- Separação de responsabilidades
- Boas práticas de modelagem

📂 Caminho: `/uml-iphone`  
📌 Status: Finalizado
