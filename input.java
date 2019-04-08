import java.util.Scanner;
// importamos la libreria para poder utilizar Scanner
public class input {
  public static void main(String args[]){
      String nombre = "";  //En esta variable guardaremos el dato de entrada
      
      Scanner in  = new Scanner(System.in); 
      System.out.print("¿Cual es tu nombre? ");
      nombre = in.nextLine();
      
      System.out.println("Hola "+nombre);
  }    
}
