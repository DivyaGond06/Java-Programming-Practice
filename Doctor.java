import java.util.*;

  class Doctor {
          int doctorId;
          String Name;
          String Specilization;
           Doctor(int doctorId, String Name,String Specilization){
                   this.doctorId=doctorId;
                   this.Name=Name;
                   this.Specilization=Specilization;}
           void cunsaltainFees(){
                   if(Specilization.equalsIgnoreCase("Cardiologist")){
             System.out.println("Cardiologist Fees is 1000");
           }
           else if(Specilization.equalsIgnoreCase("Dentist")){
             System.out.println("Densist Fees is 760");
         }
            else if (Specilization.equalsIgnoreCase("Homopyty")){
                         System.out.println("Homopyty fees is 500");
                         }

           else{
                     System.out.println("Normal check up fees is 340");
            }
        }

          void display(){
                  System.out.println("Doctor ID : " + doctorId);
                  System.out.println("Name: " + Name);
                  System.out.println("Specilization: " + Specilization);
          }
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Docort Id");
        int doctorId=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Name");
        String Name= sc.nextLine();
        System.out.println("Doctor Specilization");
        String Specilization=sc.nextLine();
         Doctor d= new Doctor(doctorId,Name,Specilization);
        d.display();
        d.cunsaltainFees();

}
  }