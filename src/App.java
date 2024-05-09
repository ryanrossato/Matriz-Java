import java.util.Scanner;

public class App {
    

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas linhas na matriz?");
        int linhas = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Quantas colunas na matriz?");
        int colunas = entrada.nextInt();
        entrada.nextLine();


        final String[][] matriz = new String[linhas][colunas];


        //colocar conteúdo na matriz
        System.out.println("Conteúdo da Matriz:");
        for(int l = 0 ; l<linhas ; l++){
            for(int c = 0 ; c<colunas ; c++){
                System.out.println("Posição: "+l+" "+c);
                matriz[l][c] = entrada.nextLine();
            }
        }
        //chamando a função exibir matriz
        exibirMatriz(matriz, linhas, colunas);

        //encerrando o scanner
        entrada.close();
    }

    //função exibir matriz
        public static void exibirMatriz(String[][] matriz, int linhas, int colunas) {
        System.out.println("Exibição da Matriz:");
        for(int l = 0 ; l<linhas;l++){
            for(int c = 0 ; c<colunas;c++){
                System.out.printf(matriz[l][c] + " | ");
                
            }
            System.out.printf("%n");
        }
    }
      
        
    }
    


