import java.util.Scanner;

public class Pattern9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m =sc.nextInt();

        for(int i=1; i<=m; i++){
            for(int j=1; j<=m-i; j++){
                System.out.print("   ");
            }
            int j =m-i+1;
            while(j<=m){
                System.out.print("*  ");
                j++;
            }
            for(int k=1;k<i;k++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        
    }
}