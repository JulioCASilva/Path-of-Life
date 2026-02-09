# Path of Life 

Path of Life é um aplicativo Android criado para centralizar, em um único lugar, funcionalidades que normalmente ficam espalhadas em vários apps diferentes.

A ideia surgiu da necessidade de organizar melhor a rotina pessoal, já que eu utilizava:
- um app para controle de gastos,
- outro para rotina e tarefas,
- outro para registrar treinos (carga, tempo, etc.),
- e outro para acompanhar hábitos como beber água e ler livros.

Em vez de manter tudo separado, o Path of Life reúne essas funcionalidades em um único app, facilitando o acompanhamento da vida financeira, hábitos, treinos e rotina diária.

---

## Funcionalidades do App

- **Controle de Gastos**
    - Registro e visualização de despesas
- **Rotina**
    - Lista de tarefas e compromissos do dia
- **Treinos**
    - Registro de exercícios, carga e tempo
- **Hábitos**
    - Acompanhamento de hábitos como leitura, ingestão de água, etc.

---

## Arquitetura do Projeto

O projeto segue uma arquitetura **feature-first**, com separação clara de responsabilidades, utilizando **Jetpack Compose**, e está preparado para o padrão **MVVM** na camada de apresentação.

---

## Organização por Camadas

### `app/`
Contém as classes responsáveis pela inicialização do aplicativo e pela navegação:
- `MainActivity`
- `App.kt`
- Grafo de navegação e rotas

### `core/designsystem/`
Responsável por tudo que é **UI reutilizável**, incluindo:
- Componentes visuais (TopBar, BottomBar)
- Tema da aplicação (cores, tipografia)

### `feature/`
Cada funcionalidade do app é organizada em sua própria feature, seguindo o conceito de **feature-first**.

Cada feature pode evoluir para conter:
- `presentation`: telas (Compose) + ViewModel + UiState/Event (**MVVM**)
- `domain`: regras de negócio (use cases, models)
- `data`: repositórios e fontes de dados (Room, DataStore, API)

---

## Tecnologias Utilizadas

- Kotlin
- Jetpack Compose
- Navigation Compose
- Material Design 3


