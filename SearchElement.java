import java.util.*;
class Search {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the element");
        for (int i= 0; i < size; i++) {

           arr[i] = sc.nextInt(); 
        }
    System.out.println("enter the no to search");
    int cnt = sc.nextInt();
    for (int i = 0; i <size; i++) {
      if(arr[i] == cnt){
      System.out.println(cnt +" " + " found at Index " + "" + i);
      break;
        
     }
    }
    sc.close();
  }
 }
