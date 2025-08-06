# <span style="font-size:1em; font-weight:bold;">🎮 Jogo de Sudoku em Linha de Comando</span>


Este projeto é uma implementação de um jogo de Sudoku funcional que roda diretamente no terminal, desenvolvido como parte de um desafio de programação em Java.
🎯 Sobre o Projeto

A criação deste jogo de Sudoku foi motivada pelo desafio de código proposto no Bootcamp GFT START #5 Java, uma parceria entre a Digital Innovation One (DIO) e a GFT. O objetivo era aplicar e aprofundar conhecimentos fundamentais da linguagem Java e boas práticas de desenvolvimento em um projeto prático e desafiador.
🛠️ Tecnologias e Processo de Desenvolvimento

Para construir este projeto, foquei em utilizar ferramentas e conceitos que são padrão na indústria de desenvolvimento de software, garantindo um código limpo, organizado e de fácil manutenção.
Tecnologias Utilizadas

    Java 21: Utilizei uma versão moderna da linguagem Java para ter acesso a funcionalidades atualizadas e garantir a performance.

    Apache Maven: Escolhi o Maven como ferramenta de automação de build e gerenciamento de projeto por vários motivos estratégicos:

        Padronização: Ele cria uma estrutura de diretórios universal (src/main/java, target, etc.), o que facilita a colaboração e a compreensão do projeto por outros desenvolvedores.

        Automação de Build: Automatiza todo o processo de compilação e empacotamento (.jar), tornando o build do projeto simples e repetível com comandos como mvn clean package.

        Facilidade de Evolução: Ele facilita a evolução do projeto. Se no futuro quisermos adicionar uma interface gráfica (frontend), o Maven simplifica a gestão de novas dependências e a criação de módulos separados para o backend e o frontend.

Estrutura e Lógica do Projeto

O desenvolvimento foi guiado pelos princípios da Programação Orientada a Objetos (POO) para criar um sistema modular e coeso.

    Classe Celula: Representa o objeto mais básico do jogo, cada um dos 81 quadrados do tabuleiro. Ela encapsula um valor e um estado fixo, garantindo que os números iniciais do desafio não possam ser alterados.

    Classe Tabuleiro: É o coração da lógica do jogo. Ela gerencia uma matriz de objetos Celula e é responsável por inicializar o jogo a partir de argumentos, validar as jogadas (verificando linhas, colunas e blocos 3x3) e exibir o estado atual do jogo.

    Classe SudokuGame: Orquestra o jogo. Contém o método main e o laço principal (while), que mantém o jogo rodando enquanto não for resolvido. É responsável por capturar o input do usuário e interagir com o Tabuleiro.

🚀 Como Executar o Projeto

Para rodar este projeto na sua máquina, siga os passos abaixo.
Pré-requisitos

    Java JDK 21 ou superior

    Apache Maven

    Git

Passo a Passo

    Clone o repositório para a sua máquina local:

    git clone https://github.com/seu-usuario/sudoku-console.git

    Navegue até a pasta do projeto:

    cd sudoku-console

    Compile e empacote o projeto. Este comando irá baixar as dependências, compilar o código e criar um arquivo .jar executável na pasta target/.

    mvn clean package

    Execute o jogo, escolhendo um dos níveis de dificuldade abaixo.

🎲 Níveis de Dificuldade

Modo Fácil (Tabuleiro Vazio)

Comece do zero e preencha todo o tabuleiro.

java -jar target/sudoku-console-1.0-SNAPSHOT.jar

Modo Médio

Comece com um tabuleiro parcialmente preenchido.

java -jar target/sudoku-console-1.0-SNAPSHOT.jar "2,0;9,true" "3,0;5,false" "4,0;8,true" "5,0;6,true" "6,0;2,true" "7,0;3,false" "8,0;1,false" "0,1;1,false" "1,1;3,true" "2,1;5,false" "3,1;4,false" "4,1;7,true" "5,1;2,false" "6,1;8,false" "7,1;9,true" "8,1;6,true" "0,2;2,false" "1,2;6,true" "2,2;8,false" "3,2;9,false" "4,2;1,true" "5,2;3,false" "6,2;7,false" "7,2;4,false" "8,2;5,true" "0,3;5,true" "1,3;1,false" "2,3;3,true" "3,3;7,false" "4,3;6,false" "5,3;4,false" "6,3;9,false" "7,3;8,true" "8,3;2,false" "0,4;8,false" "1,4;9,true" "2,4;7,false" "3,4;1,true" "4,4;2,true" "5,4;5,true" "6,4;3,false" "7,4;6,true" "8,4;4,false" "0,5;6,false" "1,5;4,true" "2,5;2,false" "3,5;3,false" "4,5;9,false" "5,5;8,false" "6,5;1,true" "7,5;5,false" "8,5;7,true" "0,6;7,true" "1,6;5,false" "2,6;4,false" "3,6;2,false" "4,6;3,true" "5,6;9,false" "6,6;6,false" "7,6;1,true" "8,6;8,false" "0,7;9,true" "1,7;8,true" "2,7;1,false" "3,7;6,false" "4,7;4,true" "5,7;7,false" "6,7;5,false" "7,7;2,true" "8,7;3,false" "0,8;3,false" "1,8;2,false" "2,8;6,true" "3,8;8,true" "4,8;5,true" "5,8;1,false" "6,8;4,true" "7,8;7,false" "8,8;9,false"

Modo Difícil

Comece com apenas algumas dicas.

java -jar target/sudoku-console-1.0-SNAPSHOT.jar "2,0;9,true" "4,0;8,true" "1,1;3,true" "4,1;7,true" "7,1;9,true" "8,1;6,true" "4,2;1,true" "8,2;5,true" "0,3;5,true" "2,3;3,true" "7,3;8,true" "1,4;9,true" "3,4;1,true" "4,4;2,true" "5,4;5,true" "7,4;6,true" "1,5;4,true" "6,5;1,true" "8,5;7,true" "0,6;7,true" "4,6;3,true" "7,6;1,true" "0,7;9,true" "1,7;8,true" "4,7;4,true" "7,7;2,true" "2,8;6,true" "3,8;8,true" "4,8;5,true" "6,8;4,true"

✨ Agradecimentos

Agradeço à Digital Innovation One (DIO) e à GFT pela oportunidade de participar do bootcamp e pelo desafio que inspirou a criação deste projeto.

