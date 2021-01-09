
public class DigitalRoot 
{
	public DigitalRoot()
	{
		DigitalRoot(7);
	}
	
	public static int DigitalRoot(int n) 
	{
		int last = 0;
	    int sum = 0;
	    do 
	    {
	    	if (sum > 9)
	    	{
	    		n = sum;
	    		sum = 0;
	    	}
	  		while (n != 0)
	  		{
	  			// last digit
	  			last = (n % 10);
	            sum = sum + last;
	  			// all the other digits
	  			n = n / 10;
	  		}
	    }
	    while (sum > 9);
	    return sum;
	    
	    
	 }
	
	 public static void main(String[] args) 
		{
			new DigitalRoot();
		}
}
