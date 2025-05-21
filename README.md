# 🌍 Projeto Educacional Multidisciplinar

Este projeto foi desenvolvido com o objetivo de aplicar conceitos de **programação orientada a objetos (POO)** de forma multidisciplinar, abordando temas das áreas de **Geografia**, **Matemática** e **Ciências** por meio da modelagem e manipulação de objetos Java.

## 🧠 Temas Abordados

- **Geografia**: Representação de biomas com suas características e climas.
- **Matemática**: Cálculo da área de figuras geométricas como quadrado, triângulo e círculo.
- **Ciências**: Estados físicos da matéria (sólido, líquido e gasoso), suas propriedades e exemplos.

## 🧱 Estrutura e Modelagem

O projeto é dividido em pacotes organizados conforme o tema:

src/<br>
├── app/ # Classe Main (menu principal)<br>
├── model/<br>
│ ├── bioma/ # Classes Bioma, Floresta, Tundra, Deserto<br>
│ ├── geometria/ # Classes FiguraGeometrica, Quadrado, Triangulo, Circulo<br>
│ └── estado_materia/ # Classes EstadoMateria, Solido, Liquido, Gasoso<br>
└── util/ # Classe Utils para entrada do usuário<br>

perl
Copiar
Editar

### 🧭 Pacote `model.bioma`

Contém a classe abstrata `Bioma` e suas subclasses:
- `Floresta`
- `Tundra`
- `Deserto`

Cada bioma possui descrição e informações sobre o clima, com uso de polimorfismo.

### 📐 Pacote `model.geometria`

Contém a classe abstrata `FiguraGeometrica` e subclasses:
- `Quadrado`
- `Triangulo`
- `Circulo`

Cada figura implementa o cálculo de área e fornece uma descrição.

### 🔬 Pacote `model.estado_materia`

Classe abstrata `EstadoMateria` e subclasses:
- `Solido`
- `Liquido`
- `Gasoso`

Cada classe define as características físicas e dá um exemplo.

### 🛠 Pacote `util`

A classe `Utils` facilita a leitura de entradas do usuário com tratamento de erros.

---

## ▶️ Instruções de Execução

1. **Pré-requisitos:**
   - Java JDK 8 ou superior
   - IDE (Eclipse, IntelliJ, VSCode) ou terminal com compilador `javac`

2. **Clonar o projeto:**

```bash
git clone https://github.com/seu-usuario/projeto-multidisciplinar.git
cd projeto-multidisciplinar
Compilar os arquivos (caso esteja no terminal):

bash
Copiar
Editar
javac app/Main.java
Executar o programa:

bash
Copiar
Editar
java app.Main
Navegar pelo menu interativo para criar objetos dos diferentes temas.

💡 Exemplos de Uso
Escolher um bioma e ver a descrição e o clima.

Calcular a área de figuras com valores inseridos pelo usuário.

Explorar os três estados da matéria com exemplos práticos.

📚 Conceitos Aplicados
Herança e polimorfismo

Classes e métodos abstratos

Encapsulamento

Modularização de código

Tratamento de exceções com try-catch

Interação via console

📌 Autor
Seu Nome Aqui
Projeto educacional desenvolvido como prática de Programação Orientada a Objetos em Java.
