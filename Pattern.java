import java.util.Scanner;
public class Pattern {
    public static void main(String[] args){
        int r,i,j,space=1;
        System.out.println("Enter the no.of rows you need to print:");
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        space=r-1;
        for(j=1;j<=r;j++){
            for(i=1;i<=space;i++){
                System.out.print(" ");
            }
            space--;
            for(i=1;i<=2*j-1;i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        space=1;
        for(j=1;j<=r-1;j++){
            for(i=1;i<=space;i++){
                System.out.print(" ");
            }
            space++;
            for(i=1;i<=2*(r-j)-1;i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
