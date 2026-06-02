
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void  main(String[] arg){

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        int total=0;
        int numOfRoll;
       // int roll;

        System.out.print("Enter the number of dice you would like to roll: ");
        numOfRoll=scanner.nextInt();

        if(numOfRoll>0){
            for(int i=0;i<numOfRoll;i++){
             int roll=random.nextInt(1,7);
                printDie(roll);
                System.out.println("You have rolled :"+ roll);

                total+=numOfRoll;


            }
        }else{
            System.out.println("Number of rolls must be greater than zero!!");
        }
        System.out.print("Your total number of rolls is: " +total);





        scanner.close();
    }
    static void printDie(int roll){
        String die1= """
                      ---------
                     |          |
                     |    ֍     |
                     |          |
                     |          |
                      ---------
                     """;
        String die2= """
                      ---------
                     | ֍        |
                     |          |
                     |          |
                     |        ֍ |
                      ---------
                     """;
        String die3= """
                      ---------
                     | ֍        |
                     |    ֍     |
                     |          |
                     |       ֍  |
                      ---------
                     """;
        String die4= """
                       ---------
                     |  ֍     ֍  |
                     |           |
                     |           |
                     | ֍       ֍ |
                       ---------
                     """;
        String die5= """
                       ---------
                     |  ֍     ֍  |
                     |           |
                     |     ֍     |
                     | ֍       ֍ |
                       ---------
                     """;
        String die6= """
                       ---------
                     |֍        ֍ |
                     |֍        ֍ |
                     |֍        ֍ |
                     |           |
                       ---------
                     """;
        switch(roll){
            case 1-> System.out.print(die1);
            case 2-> System.out.print(die2);
            case 3-> System.out.print(die3);
            case 4-> System.out.print(die4);
            case 5-> System.out.print(die5);
            case 6-> System.out.print(die6);
        }
    }



}
