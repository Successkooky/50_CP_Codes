import java.util.*;
public class CodeChef16 {
    public static void main(String args[]){
    try (Scanner input = new Scanner(System.in)) {
        int T=input.nextInt();

        for (int i = 0; i < T; i++) {
            int X=input.nextInt();
            int Y=input.nextInt();
            int dish=X/2;
            if(dish<Y){
                System.out.println(dish);
            }
            else{
                System.out.println(Y);
            }
        
}
    }
}
}