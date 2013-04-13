
public class Line {

	private String line;
	
	public Line(String line)
	{		
		this.line = line;
	}
	
	public Boolean IsSimpleComment()
	{
		return line.startsWith("//");	
	}
	
	public Boolean IsMultipleComment()
	{
		if(line.startsWith("/*") || line.startsWith("*") || line.endsWith("*/"))
		{
			return true;	
		}
		return false;
	}
	/*
	 *
	 */
}
