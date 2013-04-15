import java.util.ArrayList;

public class LineList  {

	private ArrayList<Line> lineList = new ArrayList<Line>();
	
	public LineList(String file) 
	{		
		String lines[] = file.split("\n");	
		
		for (int i = 0; i < lines.length; i++) 
		{	
			Line line = new Line(lines[i]);
			lineList.add(line);			
		}
	}
	
	public int CountCodeLines()
	{
		int codeLines = 0;
		
		for (Line line : lineList) 
		{
			if(line.IsCodeLine())
			{
				codeLines += 1;
			}
		}
		return codeLines;
	}
}
