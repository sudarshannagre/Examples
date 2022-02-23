public class PrintTree {
	
	 public static void printTree(int n)
	    {
	        int i, j;
	 
	        // outer loop to handle number of rows
	        //  n in this case
	        for(i=1; i<=n; i++)
	        {
	            //  inner loop to handle number of columns
	            for(j=1; j<=i; j++)
	            {
	            	//print the value of j here
	                System.out.print(j+" ");
	            }
	            System.out.println();
	        }
	   }
	
	public static void main(String[] args) {
		 int n = 5;
		 printTree(n);
	}
}

//Output
/*

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

 */