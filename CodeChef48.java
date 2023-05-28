import java.util.Scanner;

public class CodeChef48 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int R=input.nextInt();
        if(R>0 && R<=50){
            System.out.println(100);
        }
        else if(R>50 && R<=100){
            System.out.println(50);
        }
        else{
            System.out.println(0);
        }
    }
    
}
