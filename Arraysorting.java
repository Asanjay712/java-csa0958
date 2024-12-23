import java.util.Scanner;
import java.util.Arrays;
class Arraysorting{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
     int n=scanner.nextInt();
    int[] array=new int[n];
    
  String[] array1={
    "c","python","java","Ai","c++"
  };
    
   // int n=scanner.nextInt();
    for(int i=0;i<n;i++){
      array[i]=scanner.nextInt();
    }
    
   System.out.println("Original numeric array : " + Arrays.toString(array));
   Arrays.sort(array);
   System.out.println("sorted array"+Arrays.toString(array));
   
   
   System.out.println("Original string array : " + Arrays.toString(array1));
   Arrays.sort(array1);
   System.out.println("sorted array"+Arrays.toString(array1));
    
    for(int i=0;i<n;i++ ){//this loop just prints the array values
      System.out.println(array[i]);
    }
  }
}