public class TwoThread {

    public static void main(String[] args) {
       
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        
        
        try{
            for (int x = 1; x < 11; x++) {
                System.out.print(x + " "); 
                 if (x==5){
                    for(int i=0; i<10; i++)
                    System.out.print("A"+""); 
                 }     
            }
    }
      catch(Exception e){
       e.printStackTrace();
        }
   }}
        
    


   