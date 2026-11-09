import java.io.*;
class Division3{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array");
        int size = Integer.parseInt(br.readLine());
        int arr[] =new int[size];
        System.out.println("Enter the array Element: ");
        for (int i= 0;i<size; i++){
            arr[i] = Integer.parseInt(br.readLine());

        }System.out.print("is Divisible by 3 :");
        int sum =0;
        for(int i =0; i<size; i++){
            if(arr[i]% 3==0){
                sum = sum+arr[i];
              System.out.print( arr[i] + " "); 
            }
           
        }
        System.out.println();
        
                System.out.println(  " sum of numbers divisible by 3: " + sum );

    }
}