import java.util.*;
public class CodeChef11 {
    public static void main(String args[]){
        int P1,P2,P3,P4;
        try (Scanner input = new Scanner(System.in)) {
            P1=input.nextInt();
            P2=input.nextInt();
            P3=input.nextInt();
            P4=input.nextInt();
        }
        int weeks[]={P1,P2,P3,P4};
        int ct=0;
        for (int i = 0; i < weeks.length; i++) {
            if(weeks[i]>=10){
               
                ct++;
            }
            
           
        

    }
    System.out.println(ct);

   
        
    }

    
    
}

