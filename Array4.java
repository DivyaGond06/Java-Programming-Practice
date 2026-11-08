import java.io.*;
class SumOdd{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enetr ther Array Size");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];
                System.out.println("Enter the Array Elements");

                for(int i=0; i<size; i++){
                    arr[i] = Integer.parseInt(br.readLine());
                         
                }
                int sum =0;
                for (int i = 0; i<size ; i++){
                    
                    if(arr[i]%2 ==1){
                        sum=sum+arr[i];
                    }
                        


                    }
                    System.out.println(sum + "sum of odd number");
                }

    }
