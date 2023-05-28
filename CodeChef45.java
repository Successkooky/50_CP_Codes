import java.util.Scanner;

public class CodeChef45 {

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 0; i < T; i++) {
            int L=input.nextInt();
            int R=input.nextInt();
            int no=0;
            for (int j = L; j <=R; j++) {
                if(j%10==2 || j%10==3 || j%10==9){
                    no++;
                }
                
            }
            System.out.println(no);
                
            }

            
        }
    }
    

