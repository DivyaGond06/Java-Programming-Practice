import java.io.*;
class Element {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enetr the  size  ");
        int size = Integer.parseInt(br.readLine());
        int odd[] = new int[size];

        System.out.println("Enetr the  Element ");
        for (int i = 0; i < size; i++) {
            odd[i] = Integer.parseInt(br.readLine());
        } int sum=0;
        for (int i = 0;  i< size ; i++) {
          
            if(i%2 == 1){
                sum = sum + odd[i]; 
        }}
        System.out.println( " Sum of odd index element :" + sum);
    }
}