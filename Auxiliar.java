
import java.io.*;
class Auxiliar{
    public static void ComoJogar() {
        System.out.println("\nInstruções: Coloque a coordenada que você está, depois, as coordenadas que voce quer ir, separados por espaço, primeiro a coluna, depois a linha.\n(e.g 34 45)\nLembrando que jogo de damas é na diagonal");
        }
    //Tentei colocara a seguite parte aqui:
        //BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        //System.out.print("Coloque aqui o nome do primeiro jogador: ");
        //String jogador = input.readLine();
        //System.out.print("Coloque aqui o nome do oponente de " + jogador +": ");
        //String opo = input.readLine();
        //System.out.println("Voce sera * " +jogador+".");
        //System.out.println("Voce sera o " +opo);
        
        //Por algum motivo não funciona!
    
    
    //Tambem tentei colocar a seguinte parte:
    
    //public static String[][] tabuleiro(){
    //String[][] tabuleiro = {{"  ","0 ","1 ","2 ","3 ","4 ","5 ","6 ","7 ","  "},
                            //{"0 ","  ","o ","  ","o ","  ","o","  "," o ","0"},
                           //{"1 ","o ","  ","o ","  ","o ","  ","o ","  ","1"},
                            //{"2 ","  ","o ","  ","o ","  ","o ","  ","o ","2"},
                            //{"3 ","  ","  ","  ","  ","  ","  ","  ","  ","3"},
                            //{"4 ","  ","  ","  ","  ","  ","  ","  ","  ","4"},
                            //{"5 ","* ","  ","* ","  ","* ","  ","* ","  ","5"},
                            //{"6 ","  ","* ","  ","* ","  ","* ","  ","* ","6"},
                            //{"7 ","* ","  ","* ","  ","* ","  ","* ","  ","7"},
                            //{"  ","0 ","1 ","2 ","3 ","4 ","5 ","6 ","7 ","  "}};
                            
    //return tabuleiro;
    //nao consegui fazer funcionar
    
    //tentei fazer com a seguinte parte tambem, nao obtive sucesso.
    //
        //if(tabuleiro[a][b].equals("* ")&&tabuleiro[c][d].equals("  ")&&((a-c==1)||a-c==-1)&&(b-d==1||b-d==-1)){
                    //tabuleiro[a][b] = "  ";
                    //tabuleiro[c][d] = "* ";
                //}
               //else if(tabuleiro[a+1][b+1].equals("o ")&&tabuleiro[a][b].equals("* ")&&tabuleiro[c][d].equals("  ")){
                    //tabuleiro[a+1][b+1] = "  ";
                    //tabuleiro[a][b] = "  ";
                    //tabuleiro[c][d] = "* ";
                //}
                //else if(tabuleiro[a+1][b-1].equals("o ")&&tabuleiro[a][b].equals("* ")&&tabuleiro[c][d].equals("  ")){
                    //tabuleiro[a+1][b-1] = "  ";
                    //tabuleiro[a][b] = "  ";
                    //tabuleiro[c][d] = "* ";
                //}
                //else if(tabuleiro[a-1][b+1].equals("o ")&&tabuleiro[a][b].equals("* ")&&tabuleiro[c][d].equals("  ")){
                   //tabuleiro[a-1][b+1] = "  ";
                    //tabuleiro[a][b] = "  ";
                    //tabuleiro[c][d] = "* ";
                //}
                //else if(tabuleiro[a-1][b-1].equals("o ")&&tabuleiro[a][b].equals("* ")&&tabuleiro[c][d].equals("  ")){
                    //tabuleiro[a-1][b-1] = "  ";
                    //tabuleiro[a][b] = "  ";
                    //tabuleiro[c][d] = "* ";
    
    //}
}

    


    
