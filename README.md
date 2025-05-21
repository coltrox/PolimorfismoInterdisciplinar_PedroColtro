🌍 Projeto Interdisciplinar - Polimorfismo em Java
🚀 Sobre o Projeto
Este projeto foi desenvolvido com o objetivo de aplicar os conceitos fundamentais de Programação Orientada a Objetos (POO) — com foco em polimorfismo, herança, abstração e encapsulamento — de forma interdisciplinar, utilizando temas das disciplinas de Geografia, Matemática e Ciências.

O programa permite que o usuário interaja de forma dinâmica, selecionando temas, fornecendo informações e visualizando os dados através de uma aplicação em Java orientada a objetos.

🌟 Temas Abordados
📍 Geografia: Biomas do Mundo
Classe Abstrata: Bioma

Subclasses: Floresta, Deserto, Tundra

Cada subclasse representa um tipo de bioma, com sua definição e exemplos específicos.

🔺 Matemática: Figuras Geométricas
Classe Abstrata: FiguraGeometrica

Subclasses: Circulo, Quadrado, Triangulo

O usuário fornece dimensões, e o programa calcula área e perímetro de acordo com a figura selecionada.

🔬 Ciências: Estados Físicos da Matéria
Classe Abstrata: EstadoMateria

Subclasses: Solido, Liquido, Gasoso

Cada estado apresenta suas propriedades específicas, como forma e volume, de forma interativa e didática.

🏛️ Modelagem Orientada a Objetos
📦 Pacote	🗂️ Classe Base	🏗️ Subclasses
model.bioma	Bioma	Floresta, Deserto, Tundra
model.geometria	FiguraGeometrica	Circulo, Quadrado, Triangulo
model.estado_materia	EstadoMateria	Solido, Liquido, Gasoso

✔️ Todas as classes possuem pelo menos 2 métodos abstratos polimórficos, implementados de formas distintas nas subclasses.

🗂️ Estrutura de Pastas
bash
Copiar
Editar
POLIMORFISMO_INTERDISCIPLINAR/
├── src/
│   ├── app/                        # Classe principal (Main)
│   │   └── Main.java
│   ├── model/                      # Modelagem dos temas
│   │   ├── bioma/
│   │   │   ├── Bioma.java
│   │   │   ├── Deserto.java
│   │   │   ├── Floresta.java
│   │   │   └── Tundra.java
│   │   ├── estado_materia/
│   │   │   ├── EstadoMateria.java
│   │   │   ├── Gasoso.java
│   │   │   ├── Liquido.java
│   │   │   └── Solido.java
│   │   └── geometria/
│   │       ├── FiguraGeometrica.java
│   │       ├── Circulo.java
│   │       ├── Quadrado.java
│   │       └── Triangulo.java
│   └── util/
│       └── Utils.java               # Classe auxiliar
└── README.md                        # Documentação

🧠 Funcionalidades
✅ Menu interativo com os três temas.

✅ Entrada dinâmica de dados do usuário.

✅ Validação de entrada e tratamento de erros.

✅ Sugestões automáticas de países para biomas.

✅ Cálculo de área e perímetro de figuras geométricas.

✅ Definição e exemplos dos estados físicos da matéria.

✅ Uso real de polimorfismo, com métodos sobrescritos nas subclasses.

✅ Armazenamento dos objetos em listas dinâmicas.

✅ Exibição detalhada dos dados de cada objeto criado.

🎯 Exemplo de Execução
yaml
Copiar
Editar
=== MENU PRINCIPAL ===
Escolha uma categoria:
1 - Biomas (Geografia)
2 - Figuras Geométricas (Matemática)
3 - Estados da Matéria (Ciências)
4 - Sair
Opção: 1

--- Cadastro de Bioma ---
Sugestões de países para Floresta: Brasil, Canadá, Indonésia, Congo
Digite o nome do bioma: Amazônia
Digite o país: Brasil

Bioma cadastrado com sucesso!
Definição: Área com grande concentração de árvores e biodiversidade.
Exemplo: A Floresta Amazônica no Brasil.

--- Listagem dos Biomas Cadastrados ---
Bioma: Floresta - Amazônia no Brasil
🏃‍♂️ Como Executar
✔️ Pré-requisitos:
Java JDK instalado (versão 11 ou superior).

IDE recomendada: IntelliJ, Eclipse, VS Code ou terminal com compilador.

🚦 Passos:
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/seu-usuario/POLIMORFISMO_INTERDISCIPLINAR.git
Acesse a pasta do projeto:

bash
Copiar
Editar
cd POLIMORFISMO_INTERDISCIPLINAR
Compile o projeto:

bash
Copiar
Editar
javac -d bin src/**/*.java
Execute:

bash
Copiar
Editar
java -cp bin app.Main
✔️ O programa irá abrir o menu interativo no terminal.

📜 Tecnologias Utilizadas
☕ Java (linguagem principal)

💡 Programação Orientada a Objetos

🔧 Execução via terminal ou qualquer IDE Java

📂 Organização modular e profissional

🔥 Diferenciais do Projeto
🏆 Código limpo, comentado e organizado.

🔄 Menu com loop interativo até o usuário desejar sair.

🛠️ Tratamento de exceções e validações robustas.

🗺️ Abordagem interdisciplinar aplicando conceitos de três áreas do conhecimento.

🤝 Contribuições
Sinta-se à vontade para abrir issues, enviar pull requests ou sugerir melhorias!

📝 Licença
Este projeto está sob a licença MIT. Consulte o arquivo LICENSE para mais informações.

👨‍💻 Autor
Desenvolvido por [Seu Nome Aqui] como parte de uma atividade interdisciplinar de Programação Orientada a Objetos, integrando conceitos de Geografia, Matemática e Ciências.