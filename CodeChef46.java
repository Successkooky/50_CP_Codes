import java.util.*;
public class CodeChef46 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 0; i < T; i++) {
            int start=0;
            int end=input.nextInt();
            int steps=1;
            while(start<=end){
                if(start%2!=0){
                    steps+=3;
                }
                else{
                    steps-=1;
                }
                start++;
            }
            
            System.out.println(steps);
            
        }

    }
    
}
