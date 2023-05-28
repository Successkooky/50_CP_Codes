import java.util.*;
public class CodeChef4 {

    public static void main(String args[]){

        try (Scanner input = new Scanner(System.in)) {
            int T=input.nextInt();
            for (int i = 0; i<T; i++) {
                int N=input.nextInt();
                int M=input.nextInt();
                if(M>=N){
                    System.out.println(0);
                }
                else{
                    int remain=N-M;
                    System.out.println(remain);
                }
                
            }
        }


    }
    
}
