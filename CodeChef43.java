import java.util.*;
public class CodeChef43 {

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        for (int i = 0; i < t; i++) {
            int X=0;
            int ct=0;
            int Y=input.nextInt();
            while (Y>0) {
               int  X1=X+2;
               int  X2=X-1;
                while (X1!=X2) {
                    ct++;
                }
                
                
                
            }
            Y--;
           
            System.out.println(ct);
                
            }

            
        }
    }
    

