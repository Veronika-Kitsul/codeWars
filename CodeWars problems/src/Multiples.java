
public class Multiples {

	public Multiples() 
	{
		solution(10);
	}
	
	public int solution(int n)
	{
		int sum = 0;
		if (n < 1)
		{
			return 0;
		}
		
		for (int i = 1; i < n; i++)
		{
			if (i % 3 == 0 || i % 5 == 0)
			{
				sum+= i;
			}
		}
		System.out.println(sum);
		return n;
	}
	
	 public static void main(String[] args) 
		{
			new Multiples();
		}

}
