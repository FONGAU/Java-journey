import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void  main(String[] arg){
        Scanner scanner=new Scanner(System.in);
       //COMPOUND INTEREST CALCULATOR

        int years;
        Double principal;
        Double numOfTimesCompounded;
        Double rate;
        Double amount;

        System.out.print("Enter the principal amount :");
        principal=scanner.nextDouble();

        System.out.print("Enter the number of times compounded: ");
        numOfTimesCompounded=scanner.nextDouble();

        System.out.print("Enter the interest rate(in % form):  ");
        rate=scanner.nextDouble()/100;

        System.out.print("Enter the number of years :");
        years=scanner.nextInt();

        amount =principal*Math.pow(1 + rate/numOfTimesCompounded,numOfTimesCompounded*years);
        System.out.println("The total amount is : " +amount );


        scanner.close();
    }



}
