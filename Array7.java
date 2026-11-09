import java.io.*;
class Divison{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array");
        int size = Integer.parseInt(br.readLine());
        int arr[] =new int[size];
        System.out.println("Enter the array Element: ");
        for (int i= 0;i<size; i++){
            arr[i] = Integer.parseInt(br.readLine());

        }
        for(int i =0; i<size; i++){
            if(arr[i]% 4==0){
                System.out.println(arr[i] + "is Divisible by 4");

            }
           
        }

    }
}