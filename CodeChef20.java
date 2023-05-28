import java.util.*;
public class CodeChef20 {
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int T=input.nextInt();
            
            
            for (int i = 0; i < T; i++) {
                int N=input.nextInt();
            
                 int numbers[]=new int[N];
            
      
                
                int ct=0;
                for (int j = 0; j < N; j++) {
                    numbers[j]=input.nextInt();
                    if(numbers[j]>=1000){
                        ct++;
                        
                        
                    }
                    

                    
                }
                System.out.println(ct);
               

                
            }
        }
       
       
    }
}

    

