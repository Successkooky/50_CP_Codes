import java.util.*;

public class CodeChef49 {
    //Count no of frequencies
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 0; i < T; i++) {
            int N=input.nextInt();
            int arr[]=new int[1001];
            Arrays.fill(arr,0);
            for (int j = 0; j < N; j++) {
                arr[input.nextInt()]++;
                
            }
            Arrays.sort(arr);
            if(arr[1000]!=arr[999]){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            
           
                
                
            }
            
           
           
            
        }
    }
    

