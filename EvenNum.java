import java.io.*;
class EvenNo{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Size");
        int size = Integer.parseInt(br.readLine());
        int even[]= new int[size];
     
        for(int i = 0; i<size; i++){
            even[i]= Integer.parseInt(br.readLine());
        }
           
           System.out.print("Even Number:");
        int sum =0;

        for(int i=0;i<size;i++){
            if(even[i]%2==0){
             System.out.print(even[i] + " ");
                    sum ++;
            }
        
        }
           System.out.println();

                System.out.println("Count of Even Elements:" + sum);
            
        }
    }
