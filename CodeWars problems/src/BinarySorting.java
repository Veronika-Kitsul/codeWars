
public class BinarySorting {

	public BinarySorting() 
	{
		removeParentheses("example(unwanted thing)example (blah(boom)oops) world (i)(want) (i ( like (to (be)))) u");
	}
	
	public static String removeParentheses(final String str) 
	{
		String k = str;
        while(k.indexOf('(') != -1)
	    {
        	k = k.replaceAll("\\([^\\(\\)]*\\)", "");
	    }
        return k; 
    }

	 public static void main(String[] args) 
	{
		new BinarySorting();
	}
}
