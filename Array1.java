import java.util.*;
  class Array1
   {
          public static void main(String[] args) {
                  Scanner sc= new Scanner(System.in);
                  System.out.println("enter array");
                  int arrSize= sc.nextInt();
                  int arr[]=new int[arrSize];
                  System.out.println("Enter array data: ");
                  for(int i=0;i<arrSize;i++) {
                          arr[i]=sc.nextInt();
                  }
                  System.out.println("Array:" );
                  for(int i=0;i<arrSize;i++)
                  {
                          System.out.println(arr[i]);
                  }
          }
  }
