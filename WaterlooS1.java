import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class
class Main {
public static void main(String[] args) {
  Scanner numberof = new Scanner(System.in); 
    Integer number = numberof.nextInt();
    int area = 0;
  

  Scanner height = new Scanner(System.in);  
      int[] array = new int[number+1];  
      for(int i=0; i<number+1; i++)  
    {   
      array[i]=height.nextInt();  
    }  
      for (int i=0; i<number+1; i++)   
    {  
      System.out.println(array[i]);  
    } 
  Scanner width = new Scanner(System.in);  
      int[] array1 = new int[number];  
      for(int i=0; i<number; i++)  
    {   
      array1[i]=width.nextInt();  
    }  
      for (int i=0; i<number; i++)   
    {  
      System.out.println(array1[i]);  
    } 


for (int i = 0; i<number; i++){
  if(array[i]<array[i+1]){
    area += (array[i]*array1[i])+(((array[i+1]-array[i])*array1[i])/2);
  }
  else{
    area += (array[i+1]*array1[i])+(((array[i]-array[i+1])*array1[i])/2);
  }
  System.out.println(area);


}


}
}