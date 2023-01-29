package selfy;
import java.util.Scanner;

public class Pgm1 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int n = 0,m = 0;
      System.out.println("Enter the size of array one:");
      n=sc.nextInt();
      String array_one[] = new String[n];
      System.out.println("Enter the elemnets of array one:");
      for(int i=0;i<n;i++)
      {
    	  array_one[i]=sc.next();
      }
      System.out.println("Enter the size of array two:");
      m=sc.nextInt();
      String array_two[] = new String[m];
      System.out.println("Enter the elements of array two:");
      for(int j=0;j<m;j++)
      {
    	  array_two[j]=sc.next();
      }
      System.out.println("The Array one");
      for(String s:array_one)
      {
    	  System.out.println(s);
      }
      System.out.println("The Array Two");
      for(String p:array_two)
      {
    	  System.out.println(p);
      }
      System.out.println("Common Elements");
      for(String ele_one:array_one)
      {
    	  for(String ele_two:array_two)
    	  {
    		  if(ele_one.equals(ele_two))
    		  {
    			  System.out.println(ele_one);
    		  }
    	  }
      }
	}

}
