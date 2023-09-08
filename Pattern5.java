import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m= sc.nextInt();

        for(int i=0; i<m; i++){
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
