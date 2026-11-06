# Sistema de Gestão de Ordens de Serviço para Oficina Mecânica (MVP)

Um Produto Mínimo Viável (MVP) desenvolvido para digitalizar e otimizar a gestão de manutenções automóveis numa oficina mecânica local. Este projeto substitui o controlo manual em cadernos de papel por uma solução web responsiva, ágil e focada na rápida recuperação do histórico de intervenções.

## 🎯 O Problema e a Solução
A gestão exclusivamente manual do histórico de reparações e do fecho de caixa semanal consome tempo produtivo excessivo e gera estrangulamentos operacionais. O objetivo deste software é devolver tempo de trabalho ao mecânico chefe no pátio de reparações e proporcionar maior rastreabilidade e transparência aos clientes.

## 🌍 Impacto Social (ODS 9)
Este projeto está diretamente alinhado com o **Objetivo de Desenvolvimento Sustentável 9 (Indústria, Inovação e Infraestruturas)** da ONU. A solução promove a modernização tecnológica de um microempreendimento local, integrando-o na economia digital através de uma infraestrutura de gestão acessível e resiliente, sem exigir conhecimentos complexos de informática.

## ⚙️ Funcionalidades Principais
*   **Registo Rápido de Veículos (RF01):** Cadastro de viaturas por matrícula, com validação de unicidade, marca/modelo e contacto de referência.
*   **Abertura de Ordens de Serviço (RF02):** Criação ágil de novas OS vinculadas a um veículo, detalhando a descrição do serviço prestado e o valor financeiro.
*   **Consulta Instantânea de Histórico (RF03):** Recuperação imediata de todas as intervenções passadas através de uma simples pesquisa pela matrícula.
*   **Fecho de Caixa Semanal (RF04):** Painel de cálculo automático do somatório financeiro dos serviços registados nos últimos sete dias.

## 🛠️ Arquitetura e Tecnologias
A aplicação foi concebida sob o padrão arquitetural **MVC (Model-View-Controller)** numa estrutura monolítica, separando claramente a camada de apresentação, regras de negócio e persistência de dados.

*   **Linguagem:** Java 21
*   **Framework Base:** Spring Boot 4.1.2
*   **Apresentação (View):** Thymeleaf (Server-Side Rendering) com HTML5/CSS responsivo
*   **Persistência (Model):** Spring Data JPA (Hibernate)
*   **Base de Dados:** PostgreSQL (Hospedagem gerida via Supabase)
*   **Segurança:** Proteção contra injeções SQL, sanitização de entradas (XSS) e autenticação com senhas protegidas por hash robusto (Bcrypt), seguindo as diretrizes OWASP Top 10.

## 📱 Acessibilidade e Usabilidade
A interface foi desenhada de forma responsiva (Mobile-First) para ser utilizada diretamente num telemóvel durante o horário de trabalho. O design inclui áreas de toque amplas (mínimo de 44x44 pixels nos botões), alto contraste visual para mitigar o encandeamento da luz solar na oficina e uma hierarquia de navegação hiperfocada, minimizando a necessidade de formação técnica.

## 🚀 Como Executar o Projeto Localmente

1. Clone este repositório:
   ```bash
   git clone [https://github.com/vieiranicco/mvp-oficina-gestao-os.git](https://github.com/vieiranicco/mvp-oficina-gestao-os.git)