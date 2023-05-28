import java.util.*;
public class CodeChef17 {
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int T=input.nextInt();
   
            for (int i = 0; i < T; i++) {
                int Z=input.nextInt();
                int Y=input.nextInt();
                int remain=Z-Y;
                int A=input.nextInt();
                int B=input.nextInt();
                int C=input.nextInt();
                if(remain-(A+B+C)<0){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
}
        }
}
}
