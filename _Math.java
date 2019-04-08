
public class _Math {
    public static void main(String args[]){
    
       double cos, sin, angle;
       cos = Math.cos(0);
       
       sin = Math.sin(Math.PI/2);  //La clase Math tiene definido el atributo PI
       
       angle = Math.toDegrees(Math.PI/2);
               
       System.out.println("coseno de 0    = "+cos); 
       System.out.println("seno   de pi/2 = "+sin);
       System.out.println("pi/2 en grados = "+angle +"°"); 
      
    }
}
