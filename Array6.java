import java.io.*;
class CharacterArray{  
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        char arr[] = new char[size];
        for(int i = 0; i<size; i++){
            arr[i] = br.readLine().charAt(0);
            System.out.println("Enter the character: " + arr[i]);

        }
        for(int i = 0; i<size;i++){
            System.out.println(arr[i]);

        }


    }
}