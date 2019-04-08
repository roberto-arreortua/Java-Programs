public class metodos {
    static int metodo_1(int a, int b){
      
        return a+b;
    } 
    
    static String metodo_2(String palabra1, String palabra2){
        
        return palabra1 + palabra2;
    }
            
    public static void main(String args[]){
    
        System.out.println(metodo_1(300,400));
        
        String palabra = metodo_2("hola ","mundo");
        
        System.out.println(palabra);
    }   
}
