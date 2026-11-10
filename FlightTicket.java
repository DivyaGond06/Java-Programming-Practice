package  Inheritance;

 import java.util.*;
   
 class FlightTicket{
           int ticketNo;
           String passengerName;
           String seatClass;

           FlightTicket(int ticketNo, String passengerName,String  seatClass){
                   this.ticketNo = ticketNo;
                   this.passengerName = passengerName;
                   this.seatClass = seatClass;
           }
           double calculateAdditionalCharge(){
                   if (seatClass.equalsIgnoreCase("First"))
                   {    return 50000;
                   }
                            else if(seatClass.equalsIgnoreCase("Business")){
                            return 3000;
                            }
                           else if (seatClass.equalsIgnoreCase("Economy")){
                            return 1000;
                           }
                           else{
                                   return 0;
                           }
                   }



             void display() {
                     System.out.println("Ticket Number:" + ticketNo);
                     System.out.println("Passenger Name: " + passengerName);
                     System.out.println("Seat Class: " + seatClass);
                     System.out.println("Additional Charge:" + calculateAdditionalCharge());

   }

                     public static void main(String[] args){
                              Scanner sc=new Scanner(System.in);
        System.out.println("Enter Ticket No");
        int ticketNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Name of Passenger");
        String passengerName= sc.nextLine();
         System.out.println("Seat Class");
        String seatClass=sc.nextLine();
       
       

        

                             FlightTicket ticket = new FlightTicket(ticketNo,passengerName,seatClass);
                             double charge = ticket.calculateAdditionalCharge();
                             ticket.display();
                            
                     }
             }