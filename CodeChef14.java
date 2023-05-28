import java.util.*;
public class CodeChef14 {
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int T=input.nextInt();
            for (int i = 0; i < T; i++) {
            int N=input.nextInt();
            int X=input.nextInt();
            int K=input.nextInt();
            int capacity=K/X;
            if(capacity>N){
                System.out.println(N);
            }
            else{
                System.out.println(capacity);
            }

    
}

        }
    }
}
