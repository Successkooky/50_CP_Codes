import java.util.*;
public class CodeChef7 {

    public static void main(String args[]){

        try (Scanner input = new Scanner(System.in)) {
            int T=input.nextInt();
            for (int i = 0; i < T; i++) {
                int X=input.nextInt();
                int Travel=X*5;
                int Y=input.nextInt();
                if(Y<=Travel){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                
            }
        }
    }

    
}
