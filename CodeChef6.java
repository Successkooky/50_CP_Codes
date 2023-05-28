import java.util.*;
public class CodeChef6 {
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int T=input.nextInt();
            for (int i = 0; i < T; i++) {
                int X=input.nextInt();
                if(X>=1 && X<=4){
                    System.out.println("Yes");

                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
    
}
