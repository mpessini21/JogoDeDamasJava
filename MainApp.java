/**
 * A classe MainApp contém um programa que atende
 * ao enunciado do trabalho 4, utilizando vetores bidimensionais
 * para criação de um jogo de damas.
 * Apresenta mensagens de orientação ao usuário e
 * verifica as entradas informadas pelo usuário.
 * 
 *Autor: Marcelo Saadi Pessini (Marcelo.Pessini@edu.pucrs.br)
 *Versão Alpha 2021-06-22 
 *Trabalho 4 
 *Politécnica PUCRS
 */
//importar sinalizando * é uma forma de selecionar tudo de um pacote, economiza algumas linhas de código
import java.io.*;
public class MainApp {
    public static void main (String []args) throws IOException {
        boolean team;
        int a;
        int b;
        int c;
        int d;
        int x;
        int y;
        String opo;
        String jogador;
        //Estou usando uma classe similar do Scanner, o BufferedReader, por pura curiosidade, segundo minhas pesquisas, eles funcionam de forma bem parecida. 
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        //Insere algumas mensagens de orientacao ao usuário
        System.out.print("Coloque aqui o nome do primeiro jogador: ");
        jogador = input.readLine();
        System.out.print("Coloque aqui o nome do oponente de " + jogador +": ");
        opo = input.readLine();
        System.out.println("Voce sera * " +jogador+".");
        System.out.println("Voce sera o " +opo);
        //A unica forma que eu achei de deixar o tabuleiro aceitavel foi assim, infelizmente no jogo ficamos refens das coordenas, e sem elas ia ficar praticamente impossivel de jogar.
        String[][] tabuleiro = {{"  ","0 ","1 ","2 ","3 ","4 ","5 ","6 ","7 ","  "},
                            {"0 ","  ","o ","  ","o ","  ","o","  "," o ","0"},
                            {"1 ","o ","  ","o ","  ","o ","  ","o ","  ","1"},
                            {"2 ","  ","o ","  ","o ","  ","o ","  ","o ","2"},
                            {"3 ","  ","  ","  ","  ","  ","  ","  ","  ","3"},
                            {"4 ","  ","  ","  ","  ","  ","  ","  ","  ","4"},
                            {"5 ","* ","  ","* ","  ","* ","  ","* ","  ","5"},
                            {"6 ","  ","* ","  ","* ","  ","* ","  ","* ","6"},
                            {"7 ","* ","  ","* ","  ","* ","  ","* ","  ","7"},
                            {"  ","0 ","1 ","2 ","3 ","4 ","5 ","6 ","7 ","  "}};
        //Insere o tabuleiro 
        for(x=0; x<10; x++){
            for(y=0; y<10; y++){
                System.out.print(tabuleiro[x][y]);
            }
            System.out.println();
        }
        //o boolean team existe para diferenciar a jogada de cada um dos jogadores, dava pra fazer com numeros pares e impares tambem, mas quis testar com booleans
        team = true;
        Auxiliar.ComoJogar();
        //Esse for so existe pra fazer o programa rodar em loop
        for(;;){
            //O if maior armazena o boolean, ai dentro dele a jogada é processada para os ifs menores.
            //Como absolutamente tudo no programa gira em torno de inputs do usuário, não consegui colocar na classe auxiliar sem que houvesse algum erro, por esse motivo, só existem textos lá.
            if(team){
                System.out.print(jogador+"'Joga: ");
                //A string 'move' capta a casa em que o jogador está e a casa para qual ele deseja se mover e armazena em uma string, estava quase impossivel fazer com ints
                String move = input.readLine();
                //O método Integer.parseInt foi o método que eu encontrei para a transformação de uma string para um int.
                //O metodo charAt identifica as rows e linhas para serem inserdias no vetor, para fazer assim a movimentacao das peças (muita gambiarra, mas funciona kkkkkk)
                a = Integer.parseInt(""+move.charAt(0))+1;
                b = Integer.parseInt(""+move.charAt(1))+1;
                c = Integer.parseInt(""+move.charAt(3))+1;
                d = Integer.parseInt(""+move.charAt(4))+1;
                //Aqui temos todas as possibilides de jogadas, quando a casa desejada esta vazia, ocupada, alerta se a jogada é invalida etc...
                if(tabuleiro[a][b].equals("* ")&&tabuleiro[c][d].equals("  ")&&((a-c==1)||a-c==-1)&&(b-d==1||b-d==-1)){
                    tabuleiro[a][b] = "  ";
                    tabuleiro[c][d] = "* ";
                }
                else if(tabuleiro[a+1][b+1].equals("o ")&&tabuleiro[a][b].equals("* ")&&tabuleiro[c][d].equals("  ")){
                    tabuleiro[a+1][b+1] = "  ";
                    tabuleiro[a][b] = "  ";
                    tabuleiro[c][d] = "* ";
                }
                else if(tabuleiro[a+1][b-1].equals("o ")&&tabuleiro[a][b].equals("* ")&&tabuleiro[c][d].equals("  ")){
                    tabuleiro[a+1][b-1] = "  ";
                    tabuleiro[a][b] = "  ";
                    tabuleiro[c][d] = "* ";
                }
                else if(tabuleiro[a-1][b+1].equals("o ")&&tabuleiro[a][b].equals("* ")&&tabuleiro[c][d].equals("  ")){
                    tabuleiro[a-1][b+1] = "  ";
                    tabuleiro[a][b] = "  ";
                    tabuleiro[c][d] = "* ";
                }
                else if(tabuleiro[a-1][b-1].equals("o ")&&tabuleiro[a][b].equals("* ")&&tabuleiro[c][d].equals("  ")){
                    tabuleiro[a-1][b-1] = "  ";
                    tabuleiro[a][b] = "  ";
                    tabuleiro[c][d] = "* ";
                }
                else{
                    System.out.println("Entrada Invalida");
                }
                for(x = 0; x< 10; x++){
                    for(y = 0; y < 10; y++){
                        System.out.print(tabuleiro[x][y]);
                    }
                    System.out.println();
                }
                team = false;
                }
            //O mesmo processo que ocorre em cima, ocorre aqui de forma inversa para "o",ja que os jogadores sao definidos pelo boolean 'team', quando falso ele demarca que é o oponente e quando verdadeiro o jogador em si.
            else if(team == false){
                System.out.print(opo+" Joga: ");
                String move = input.readLine();
                a = Integer.parseInt(""+move.charAt(0))+1;
                b = Integer.parseInt(""+move.charAt(1))+1;
                c = Integer.parseInt(""+move.charAt(3))+1;
                d = Integer.parseInt(""+move.charAt(4))+1;
                if(tabuleiro[a][b].equals("o ")&&tabuleiro[c][d].equals("  ")&&((a-c==1)||a-c==-1)&&(b-d==1||b-d==-1)){
                    tabuleiro[a][b] = "  ";
                    tabuleiro[c][d] = "o ";
                }
                else if(tabuleiro[a+1][b+1].equals("* ")&&tabuleiro[a][b].equals("o ")&&tabuleiro[c][d].equals("  ")){
                    tabuleiro[a+1][b+1] = "  ";
                    tabuleiro[a][b] = "  ";
                    tabuleiro[c][d] = "o ";
                }
                else if(tabuleiro[a+1][b-1].equals("* ")&&tabuleiro[a][b].equals("o ")&&tabuleiro[c][d].equals("  ")){
                    tabuleiro[a+1][b-1] = "  ";
                    tabuleiro[a][b] = "  ";
                    tabuleiro[c][d] = "o ";
                }
                else if(tabuleiro[a-1][b+1].equals("* ")&&tabuleiro[a][b].equals("o ")&&tabuleiro[c][d].equals("  ")){
                    tabuleiro[a-1][b+1] = "  ";
                    tabuleiro[a][b] = "  ";
                    tabuleiro[c][d] = "o ";
                }
                else if(tabuleiro[a-1][b-1].equals("* ")&&tabuleiro[a][b].equals("o ")&&tabuleiro[c][d].equals("  ")){
                    tabuleiro[a-1][b-1] = "  ";
                    tabuleiro[a][b] = "  ";
                    tabuleiro[c][d] = "o ";
                }
                else{
                    System.out.println("Entrada Inválida!");
                }
                for(x = 0; x< 10; x++){
                    for( y = 0; y < 10; y++){
                        System.out.print(tabuleiro[x][y]);
                    }
                    System.out.println();
                }
                team = true;
            }
        }
     }
}