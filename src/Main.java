
import java.util.Scanner;
public class Main {
    public static void  main(String[] arg){
        Scanner scanner=new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;


        System.out.println("1.Convert lbs to kgs");
        System.out.println("2.Convert lbs to kgs");
        System.out.print(" SELECT AN OPTION! ");
        choice=scanner.nextInt();


        if(choice==1){
            System.out.println("Convert lbs to kgs: ");
            weight=scanner.nextDouble();
            newWeight=weight*0.45;
            System.out.printf("Your weight is %.2f kgs",newWeight);
        }else if(choice==2){
            System.out.print("Convert kgs to lbs : ");
            weight=scanner.nextDouble();
            newWeight=weight/0.45;
            System.out.printf("Your weight is %.2f lbs",newWeight);
        }
        System.out.println("code completed successfully!!");
        System.out.println("see you again");



        scanner.close();
    }



}
