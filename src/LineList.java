import java.util.ArrayList;

public class LineList extends ArrayList<Line> {

	public LineList(String file) 
	{		
		String lines[] = file.split("\n");
		
		for (int i = 0; i < lines.length; i++) 
		{	
			Line line = new Line(lines[i]);
			
			if(!line.IsSimpleComment() && !line.IsMultipleComment())
			{
				this.add(line);
			}
		}
	}
}
