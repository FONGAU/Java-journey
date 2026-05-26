import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void  main(String[] arg){
        Scanner scanner=new Scanner(System.in);
       /* String name="Bro code";
        int gta=6;
        double pi=3.142617;
        char gender='M';
        boolean isAdmin=true;


        System.out.println(name +" is playing gta "+gta);
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name=scanner.nextLine();

        System.out.println("Enter you age: ");
        int age=scanner.nextInt();

       System.out.println("What is your gpa:");
        double gpa=scanner.nextDouble();

        System.out.println("Are you a student?(true/false): ");
        boolean isStudent=scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are "+ age +" years old");
        System.out.println("Your gpa is: "+ gpa);

        if(isStudent){
            System.out.println("You are enrolled in classes!");

        }else{
            System.out.println("You are not enrolled in classes!");
        }*/
        String noun1;
        String adjective1;
        String verb1;
        String noun2;
        String adjective2;
        String verb2;

        System.out.print("Enter a noun:");
        noun1=scanner.nextLine();
        System.out.print("Enter a verb(ending with -ing):");
        verb1=scanner.nextLine();
        System.out.print("Enter an adjective(noun descriptors):");
        adjective1=scanner.nextLine();
        System.out.print("Enter an adjective(noun descriptors):");
        adjective2=scanner.nextLine();
        System.out.print("Enter a verb(ending with -ing):");
        verb2=scanner.nextLine();
        System.out.print("Enter a noun:");
        noun2=scanner.nextLine();




        System.out.println("If your "+ noun1 + " can spend three hours"+ verb1 +" how everything falls apart,it can spend three hours imagining how everything comes together.");
        System.out.println("But we're " + adjective1 +" to worst case scenarios because they feel more real,more "+ adjective2 +",when really they are just mental abuse.");
        System.out.println("Your "+verb2 +"muscle is actually your manifestation muscle running in"+noun2+",same engineering,wrong direction.");
        System.out.println("As a man thnketh in his heart, so is he... ");


        scanner.close();
    }



}
