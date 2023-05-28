import java.util.*;
public class CodeChef13 {
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int T=input.nextInt();
            for (int i = 0; i < T; i++) {
                int X=input.nextInt();
                int A=input.nextInt();
                int B=input.nextInt();
                int result=(A*1)+(B*2);
                if(result>=X){
                    System.out.println("QUALIFY");
                }
                else{
                    System.out.println("NotQualify");
                }
                
            }
        }


    }
    
}
