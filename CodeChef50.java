import java.util.*;

public class CodeChef50 {
    public static void main(String args[]){
        int res=0;
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N=sc.nextInt();
            int arr[]=new int[N];
            for (int j = 0; j < N; j++) {
                arr[j]=sc.nextInt();
                
            }
            Arrays.sort(arr);
            for (int j2 = 0; j2 <N; j2++) {
                if(arr[j2]==arr[j2+1]){
                    res++;
                    System.out.println(res);
                }
                
            }
            
        }
    }
    
}
