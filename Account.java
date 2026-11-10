 package Inheritance;
 import java.util.*;
 class Account{
        double accountNo;
        String holderName;
        Account(double accountNo,String holderName){
                this.accountNo= accountNo;
                this.holderName = holderName;
        }

                void AccountDisplay(){
                        System.out.println("Account Number: " + accountNo);
                        System.out.println("Holder Name: " + holderName);
                }
 }
  class SavingAccount extends Account{
          double interestRate;
          SavingAccount(double accountNo,String holderName,double interestRate){
                super(accountNo,holderName);
                  this.interestRate = interestRate;
          }
          void calculateInterest(double balance){
                  double interest = (balance*interestRate)/100;
                  System.out.println("Account Number: " + accountNo);
                        System.out.println("Holder Name: " + holderName);
                  System.out.println("Interest Rate : " + interestRate + "%");
                  System.out.println("Interest Amount : " + interest);
          }
}
            class Main{
                    public static void main(String[] args){
                         Scanner sc = new Scanner(System.in);
                         System.out.println("Enter Account  Number: ");
                         double accountNo = sc.nextDouble();
                         sc.nextLine();
                         System.out.println("Enter Holder Name :");
                         String holderName = sc.nextLine();
                         System.out.println("Interest Rate: ");
                         double interestRate = sc.nextDouble();
                         System.out.println("Enter Account Balnace :");
                         double balance = sc.nextDouble();


                            SavingAccount s = new SavingAccount(accountNo,holderName,interestRate);

                            s.calculateInterest(balance);
                    }
                }