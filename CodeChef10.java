import java.util.*;
public class CodeChef10 {
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int T=input.nextInt();
            for (int i = 0; i < T; i++) {
                int X=input.nextInt();
                int Y=input.nextInt();
                int remainder=X%Y;
                int Quotient=(int)(X/Y);
                int steps=remainder+Quotient;
                System.out.println(steps);

                
            }
        }
    }
    
    
}
