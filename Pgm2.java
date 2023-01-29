package selfy;

import java.util.Scanner;

public class Pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int n;
	 int n1=0,n2=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of Array:");
     n=sc.nextInt();
     int array[]=new int[n];
     System.out.println("Enter the elements:");
     for(int i=0;i<n;i++)
     {
    	array[i]=sc.nextInt(); 
     }
     for(int s=0;s<n;s++)
     {
     for(int j=array[s];j<n;j++)
     {
    	  if(j>n1)
    	  {
    		 n1=j;
    		 n2=n1;
    	  }
    	  else
    	  {
    		  if((j>n2) && (j<n1))
    		  {
    			  n2=j;
    		  }
    	  }
     }
     
     
	}
    System.out.println(n2);
 }

}
