# 🌍 Projeto Educacional Multidisciplinar

Este projeto foi desenvolvido com o objetivo de aplicar conceitos de **programação orientada a objetos (POO)** de forma multidisciplinar, abordando temas das áreas de **Geografia**, **História** e **Biologia** por meio da modelagem e manipulação de objetos Java.

## 🧠 Temas Abordados

- **Geografia**: Explicação Guerra Fria.
- **História**: Explicação Revolução Francesa.
- **Ciências**: Descrição macromoléculas.

## 🧱 Estrutura e Modelagem

O projeto é dividido em pacotes organizados conforme o tema:

src/<br>
├──  app/  Classe Main (menu principal) <br>
├──  model/<br>
│  ├──   geopolitica/  Classes Blocos, Causas, ConsequenciasGF, GuerraFria <br>
│  ├──   macromoleculas/  Classes AcidosNucleicos, Carboidratos, Lipidios, MacroMoleculas, Proteinas <br>
│  └──   revolucaofrancesa/  Classes RevolucaoFrancesa, Causa, ConsequenciasRF, QuedaBastilha, RevolucaoFrancesa <br>
└──   util/  Classe Utils para entrada do usuário <br>


### 🧭 Pacote `model.geopolitica`

Contém a classe abstrata `GuerraFria` e suas subclasses:
- `Blocos`
- `Causas`
- `ConsequenciasGF`

Cada bioma possui descrição e informações sobre o clima, com uso de polimorfismo.

### 🧬 Pacote `model.macromoleculas`

Contém a classe abstrata `MacroMoleculas` e subclasses:
- `AcidosNucleicos`
- `Carboidratos`
- `Lipidios`
- `Proteinas`

Cada figura implementa o cálculo de área e fornece uma descrição.

### 🔬 Pacote `model.revolucaofrancesa`

Classe abstrata `RevolucaoFrancesa` e subclasses:
- `Causa`
- `ConsequenciasRF`
- `QuedaBastilha`

Cada classe define as características físicas e dá um exemplo.

### 🛠 Pacote `util`

A classe `Utils` facilita a leitura de entradas do usuário com tratamento de erros.

---

## ▶️ Instruções de Execução

1. **Pré-requisitos:**
   - Java JDK 8 ou superior

2. **Clonar o projeto:**

```bash
git clone https://github.com/coltrox/PolimorfismoInterdisciplinar_PedroColtro.git
```
```bash
cd PolimorfismoInterdisciplinar_PedroColtro
```
```bash
Compilar os arquivos (caso esteja no terminal):
```

Navegar pelo menu interativo para criar objetos dos diferentes temas.
<br><br>

## 📚 Conceitos Aplicados
Herança e polimorfismo

Classes e métodos abstratos

Encapsulamento

Modularização de código

Tratamento de exceções com try-catch

Interação via console

## 📌 Autores
PEDRO COLTRO | MYLENNA PONCIANO | LUCAS DÁVILA
