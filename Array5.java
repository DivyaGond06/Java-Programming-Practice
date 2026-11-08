  import java.io.*;
  class Array5{
           public static void main(String[] args) throws IOException{
                   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                   System.out.println("Enter array size");
                   int arrSize= Integer.parseInt(br.readLine());
                   int arr[] = new int[arrSize];
                   System.out.println("Enter data");
                   for (int i=0;i<arr.length;i++){
                   arr[i]=Integer.parseInt(br.readLine());
                   }
           
           System.out.println("Array : ");
           for(int i=0;i<arr.length;i++)
            {
           System.out.println(arr[i]);
            }
        }
   }

