import java.util.Scanner;

public class matriz{
  public static void main(String args[]){

   int filas = 0, columnas = 0;
   Scanner entrada = new Scanner(System.in);

   System.out.println("¿Cuantas filas deseas?");
   filas = entrada.nextInt();

   System.out.println("¿Cuantas columnas deseas?");
   columnas = entrada.nextInt();

   int numeros [][] = new int [filas][columnas];

   for(int j = 0; j < filas; j++){
    for(int i = 0; i < columnas; i++){
      numeros[j][i] = 1;
      System.out.print("[" + numeros[j][i] + "]");
    }
     System.out.println("");
   }
 }
}

