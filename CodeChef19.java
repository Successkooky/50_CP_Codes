import java.util.*;
public class CodeChef19 {
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int T=input.nextInt();
   
            for (int i = 0; i < T; i++) {
                int K=input.nextInt();
                int N=input.nextInt();
                int Q=(K/N);
                int R=(K%N);
                if(R==0) {System.out.println(Q);
                }
                else{
                    System.out.println(Q+1);

                } 
   
}
        }
    }
}
