import java.util.*;
public class CodeChef12 {
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int A=input.nextInt();
            int B=input.nextInt();
            int C=input.nextInt();
            int X=input.nextInt();
            if(X==A || X==B || X==C ){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
   
}
