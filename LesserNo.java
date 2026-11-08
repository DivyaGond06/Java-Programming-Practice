import java.io.*;
class LesserNum {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array :-> ");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];
       System.out.println("Enter the Element of array");
        for(int i =0;i<size; i++){
         arr[i] = Integer.parseInt(br.readLine());
           
       }
       for(int i= 0; i<size;i++){
        if (arr[i]==10){
            System.out.println(arr[i] + " is equal to 10" );

        }
        if(arr[i]<10){
        System.out.println(arr[i] + " : is less than 10");
        }
       }
    } 
}