public class try_catch {
    public static void main(String args[]){
        int x = 100, y;
        while(true){
            try {
                y = 1000/x;
                x -= 10;
                System.out.println(y);
            }
            catch(Exception e){
                System.out.println("ha ocurrido un error");
                break;
            }       
        }
    }   
}


