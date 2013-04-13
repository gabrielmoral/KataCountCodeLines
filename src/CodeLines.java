
public class CodeLines {

	public int Count(String file) {
		
		if (file.isEmpty())
		{
			return 0;
		}
		
		LineList lineList = new LineList(file);
				
		return lineList.size();
	}

}
