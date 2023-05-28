import java.util.*;
public class CodeChef8 {
    //Level-702
    public static void main(String args[]) {
        
            try (Scanner input = new Scanner(System.in)) {
                int T=input.nextInt();
                for (int i = 0; i < T; i++) {
                    int S=input.nextInt();
                    int X=input.nextInt();
                    int Y=input.nextInt();
                    int Z=input.nextInt();
                    if((X+Y+Z)<=S){
                        System.out.println(0);
                    }
                    else if((X+Z)<=S || (Y+Z)<=S){
                        System.out.println(1);
                    } 
                    else{
                        System.out.println(2);
                    }
                   
                
         
                
                
                

                
                
                
      }
            }
    }   
}

