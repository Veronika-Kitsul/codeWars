
public class BinarySorting {

	public BinarySorting() 
	{
		removeParentheses("example(unwanted thing)example");
	}
	
	public static String removeParentheses(final String str) 
	{
		String cutdown = "\\";
		int numberOpen = 0;
		for (int i = 0; i < str.length(); i++)
		{	
			if (str.charAt(i) == '(')
			{
				numberOpen++;
			}
			
			if (numberOpen > 0)
			{
				cutdown+= str.charAt(i);
			}
			
			if (str.charAt(i) == ')')
			{
				str.replaceAll(cutdown, "\\");
				numberOpen--;
			}
		}
		System.out.println(str);
        return str; 
    }

	 public static void main(String[] args) 
		{
			new BinarySorting();
		}

}
