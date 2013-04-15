
public class Line {

	private String line;
	
	public Line(String line)
	{		
		this.line = line;
	}
	
	public Boolean IsCodeLine()
	{
		if(line.startsWith("//") || line.startsWith("/*") || line.startsWith("*") || line.endsWith("*/"))
		{
			return false;	
		}	
		return true;
	}	
}
