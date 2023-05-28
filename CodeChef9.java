import java.util.*;
public class CodeChef9 {
    //Missing days of Akash
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int T=input.nextInt();
            for (int i = 0; i <T; i++) {
                int N=input.nextInt();
                int Weekends=(int)(N/7);
                
                if(N%7>=6) {
                    System.out.println(++Weekends);
                }
                else 
                {
                    System.out.println(Weekends);
                }

                
            }
        }
    }

    
}
