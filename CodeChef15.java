import java.util.*;
public class CodeChef15 {
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int T=input.nextInt();
            for (int i = 0; i < T; i++) {
                int A=input.nextInt();
                int B=input.nextInt();
                int chance=21-(A+B);
                if(chance>=1 && chance<=10){
                    System.out.println(chance);
                }
                else{
                    System.out.println(-1);
                }

                
            }
        }
    }
    
    
}
