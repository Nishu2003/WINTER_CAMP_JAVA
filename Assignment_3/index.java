class CheckNumber
 
{
	public static void main(String arg[])	
	{
	    int n,c;
            Scanner sc=new Scanner(System.in);
		
	    System.out.println("Enter number of elements ");
	    n=sc.nextInt();
	    
	    int a[]=new int[n]; 
	    System.out.println("Enter " +n+" elements");
	    for(int i=0;i<n;i++)
	    {
          
	      a[i]=sc.nextInt(); 
            }  
	    System.out.println("Enter the number to check ");
	    c=sc.nextInt();
	    
	    System.out.print("Check the number "+n+" from the array(");
            
	    for(int i=0;i<n;i++)
	    {
           	
	    System.out.print(a[i]+",");
            }  
	    System.out.println(")----->"+check(a,c));	  
	}
	static boolean check(int a[],int check)
	{
	 
	    for(int i=0;i<a.length;i++)
	    { 
		if(a[i]==check)
		return true;
		 
	    }
	return false;
        }     
}
