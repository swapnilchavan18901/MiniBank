
import java.util.Scanner;

public class Mini_bank {
            static int currentBalance;
              public static void main(String[] args) {


                  System.out.println("*******Create a New Account*******");
                  System.out.println("Account Name:");
                  Scanner scanner=new Scanner(System.in);
                  String account_Name= scanner.nextLine();
                  System.out.println("Permanent Address:");
                  String permanentAddress= scanner.nextLine();
                  System.out.println("Phone No.:");
                  String phNo= scanner.nextLine();
                  System.out.println("Gender:");
                  String gender= scanner.nextLine();
                  System.out.println("Date:");
                  String date= scanner.nextLine();
                  System.out.println("Email:");
                  String email= scanner.nextLine();
                  System.out.println("Initial Balance :");
                   currentBalance=scanner.nextInt();
                   //add clear screen here
                  clrscr();

                  System.out.println("----------------------------------------------------------------------------");
                  System.out.println("****************Your Account has been created*******************************");
                  System.out.println("----------------------------------------------------------------------------");
                  System.out.println("Press any 1 to key To go to main menu");
                  int key=scanner.nextInt();
                  if (key==1) {
                      for (; ; ) {
                          mainmenu(account_Name);
                      }
                  }
                  else {
                      System.exit(0);
                  }
               }

        //functions for withdrawal deposit and loan system
    static void withdrawal(String account_Name){
       // add clear screen function here
        clrscr();

        System.out.println("*********************Welcome Mr. "+account_Name+"******************");
        System.out.println("**********************Withdrawal Section**************************");
        System.out.println("Your Current Balance is"+currentBalance);
        System.out.println("WithDrawal Ammount :");
        Scanner withd=new Scanner(System.in);
        int withdrawalAmount= withd.nextInt();
        if(currentBalance>=withdrawalAmount){
       currentBalance =currentBalance-withdrawalAmount;
            //add clear screen here
            clrscr();
            System.out.println("Transaction Successfull Your current Balance is "+currentBalance);
            System.out.println("Press any 1 to key To go to main menu");
            Scanner mnu=new Scanner(System.in);
            int menu=mnu.nextInt();
            if (menu==1){
                mainmenu(account_Name);
            }
            else {
                System.exit(0);
            }
        }
        else {
            // add clear screen function here
            clrscr();

            System.out.println("Insufficient Balance");
            System.out.println("There is Insufficiant balance to proceed further transaction");
            System.out.println("Press any 1 to key To go to main menu");
            Scanner mnu=new Scanner(System.in);
            int menu=mnu.nextInt();
            if (menu==1){
                mainmenu(account_Name);
            }
            else {
                System.exit(0);
            }

        }
    }
   static void deposit(String account_Name){
        // add clear screen function here
       clrscr();

       System.out.println("Enter the amount you want to deposite Account");
       Scanner dep=new Scanner(System.in);
       int depositAmount= dep.nextInt();
       currentBalance=currentBalance+depositAmount;
       System.out.println("Your Curent Balance is "+currentBalance);
       System.out.println("Press any 1 to key To go to main menu");
       Scanner mnu=new Scanner(System.in);
       int menu=mnu.nextInt();
       if (menu==1){
           mainmenu(account_Name);
       }
       else {
           System.exit(0);
       }

    }
   static void loanSystem(String account_Name){
       // add clear screen function here
       clrscr();

       System.out.println("Enter the Loan Amount :");
       Scanner loan=new Scanner(System.in);
       int loanAmount= loan.nextInt();
       System.out.println("Enter the Duration (Months) :");
       int months=loan.nextInt();
       float simpleInterest= (float) (loanAmount * 9.5 * (months/12)/100);
       float finalAmount=simpleInterest+loanAmount;
       System.out.println("The Final Amount you have to pay after "+months+" Months is "+finalAmount);
       System.out.println("Press any 1 to key To go to main menu");
       Scanner mnu=new Scanner(System.in);
       int menu=mnu.nextInt();
       if (menu==1){
           mainmenu(account_Name);
       }
       else {
           System.exit(0);
       }
    }
    public static void clrscr(){
        System.out.println("\u000C");
    }

        static void mainmenu(String account_Name){

                //add clear screen here
                clrscr();
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("*********************************Mainmenu********************************");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("*******************************Welcome "+account_Name+"*******************************");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("1.Withdraw Money");
                System.out.println("2.Deposit Money");
                System.out.println("3.Loan System");
                System.out.println("4.Exit");
                System.out.println("Enter the Number your Want to Proceed In:");
                Scanner scanner=new Scanner(System.in);
                int srNo=scanner.nextInt();
                if(srNo==1){
                    withdrawal(account_Name);
                }
                else if(srNo==2){
                    deposit(account_Name);  //deposit function
                }
                else if (srNo==3){
                    loanSystem(account_Name);   //loan function
                }
                else if (srNo==4){
                    System.exit(0);  //Exit Function
                }
    }
   }





