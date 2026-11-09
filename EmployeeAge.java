import java.io.*;
class Employee{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Count of Employee in Company");
        int size = Integer.parseInt(br.readLine());
        int emp[] = new int [size];
     System.out.println(" Employee Working in Company");

        for(int i= 0; i<size; i++){
            emp[i] = Integer.parseInt(br.readLine());

            
        }
     
         for(int i=0;i<size;i++){
            System.out.println(emp[i] + " Years");
         }
    }
}