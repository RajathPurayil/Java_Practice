import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the rows ");

        int Rows =sc.nextInt();
        System.out.println("Enter the number of column");
        int column=sc.nextInt();

        for (int i=1;i<Rows;i++){
            for(int j=1;j<=column;j++)
            {

            System.out.print("*  ");
        }

            System.out.println("");

    }
}
}