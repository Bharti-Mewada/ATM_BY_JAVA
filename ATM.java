
package bharti_package;
import java.util.Scanner;


 class Atm {
     public static void main(String[] args)
     {
         double balance=5000,withdraw,deposit;
         int pin=8717, ch;
         System.out.println("_____Welcome to The ATM(Automated Teller Machine)_____");
         System.out.println();
         System.out.println("   Insert Card ");
         System.out.print("  Enter Your PIN ");
         Scanner sc=new Scanner(System.in);
         int pass=sc.nextInt();
         while(pass!=pin)
         {
             System.out.println("  Incorrect PIN..........Try Again :");
             System.out.print("  Enter Your PIN ");
             pass=sc.nextInt();
             System.out.println();
         }
         
         do{
             System.out.println("   1.Withdrawal : ");
             System.out.println("   2.Deposit : ");
             System.out.println("   3.Balance status : ");
             System.out.println("   4.Transfer and payments : ");
             System.out.println("   5.Exit  ");
             System.out.print("   Enter your choice : ");
              ch=sc.nextInt();
              System.out.println();
             switch(ch)
             {
                 case 1:
                     System.out.print("   Enter money to Withdraw : ");
                     withdraw=sc.nextDouble();
                     if(balance>=withdraw)
                     {
                         balance=balance-withdraw;
                         System.out.println("   Please collect your money : ");
                         
                      }
                     else{
                         System.out.println("   Insufficient Account balance   ");
                         
                     }
                     System.out.println();
                     break;
                 case 2:
                     System.out.print("   Enter money to be Deposit : ");
                     deposit=sc.nextDouble();
                     balance=balance+deposit;
                     System.out.print(" your money Deposited : ");
                     System.out.println();
                     break;
                 case 3:
                     System.out.println("   your Account Balance = "+balance);
                     System.out.println();
                     break;
                 case 4:
                     System.out.println("   contact to bank for details of Transfer and payments : ");
                     System.out.println();
                     break;
                 case 5:
                     System.exit(0);
                     System.out.println("");
                    
             }
             
         }while(ch!=5);
         
     }
     
    
}
