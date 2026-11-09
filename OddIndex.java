import java.io.*;
  class Odd {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int odd[]= new int[size];
        System.out.println("Enter the size if the array");
        for(int i = 0; i<size; i++){
            odd[i]= Integer.parseInt(br.readLine());
            
        }
         for(int i=0;i<size;i++){
            if((i & 1) > 0){
                System.out.println("is an Odd Index element" + odd[i]);
         }
         }
                
    }
  }
