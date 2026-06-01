
import java.util.Scanner;

public class Main {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    // JAVA BANKING PROGRAM

    double balance= 0;
    int choice;
    boolean isRunning = true;

    while (isRunning) {

      System.out.println("==============");
      System.out.println("SELECT BANKING OPTION (1-4)");
      System.out.println("1.BALANCE");
      System.out.println("2.DEPOSIT");
      System.out.println("3.WITHDRAW");
      System.out.println("4.EXIT");
      System.out.println("===============");
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();
      System.out.println("=================");


     switch (choice) {
        case 1 ->balance(balance);
        case 2 -> balance+=deposit();
        case 3 -> balance-=withdraw(balance);
        case 4 -> isRunning = false;
        default -> System.out.println("Invalid input!!TRY AGAIN");
      }




    }
    System.out.println("Thank you for banking with us!!😁");
    scanner.close();

  }
  static void balance(double balance){
    System.out.println("==============");
    System.out.printf("$%.2f\n",balance);

  }
  static double deposit(){
    double amount;
    System.out.println("Enter amount you wish to deposit :" );
    amount=scanner.nextDouble();

    if(amount<0){
      System.out.println("Amount cannot be less than zero");
      return 0;
    }
    else{
      return amount;
    }

  }
  static double withdraw(double balance){
    double amount;
    System.out.println("Enter amount you wish to withdraw");
    amount=scanner.nextDouble();

    if(amount>balance){
      System.out.println("==============");
      System.out.println("INSUFFICIENT FUNDS");
      return 0;
    }
    else if(amount<0){
      System.out.println("==============");
      System.out.println("Amount cannot be negative.Please try a different amount");
      return 0;

    }
    else {
      System.out.println("==============");
      System.out.println("Withdrawal successful");

      return amount;
    }
  }


}


