import java.util.*;
public class CodeChef2 {
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int T=input.nextInt();
            for (int i = 0; i < T; i++) {
                int N=input.nextInt();
                if(N%3==0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
    
}
