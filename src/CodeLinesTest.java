import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class CodeLinesTest {

	private CodeLines codeLines;
	
	@Before
	public void SetUp()
	{
		codeLines = new CodeLines();			
	}
	
	@Test
	public void TestWithoutLines() {
		
		String file = "";		
		
		int lines = codeLines.Count(file);
						
		assertEquals(lines, 0);
	}
	
	@Test
	public void TestWithOneLine() {
		
		String file = "Line of code";	
		
		int lines = codeLines.Count(file);
						
		assertEquals(lines, 1);
	}
	
	@Test
	public void TestWithTwoLine() {
		
		String file = "Line of code\nLine of code";	
		
		int lines = codeLines.Count(file);
						
		assertEquals(lines, 2);
	}
	
	@Test
	public void TestWithTwoLineAndOneSimpleComment() {
		
		String file = "Line of code\nLine of code\n//This is a comment\n//This is other comment";	
		
		int lines = codeLines.Count(file);
						
		assertEquals(lines, 2);
	}
	
	@Test
	public void TestWithTwoLineAndTwoSimpleComment() {
		
		String file = "Line of code\nLine of code //This is a comment";	
		
		int lines = codeLines.Count(file);
						
		assertEquals(lines, 2);
	}
	
	@Test
	public void TestWithTwoLineAndOneMultipleComment() {
		
		String file = "Line of code\nLine of code\n/**\n* This is a multiple comment\n*/";	
		
		int lines = codeLines.Count(file);
						
		assertEquals(lines, 2);
	}
	
	@Test
	public void TestWithTwoLineAndTwoMultipleComment() {
		
		String file = "Line of code\nLine of code\n/**\n* This is a multiple comment\n*/\n/**\n* This is a multiple comment\n*/";	
		
		int lines = codeLines.Count(file);
						
		assertEquals(lines, 2);
	}
	@Test
	public void TestWithTwoLineAndOneSimpleAndTwoMultipleComment() {
		
		String file = "Line of code\nLine of code\n/**\n* This is a multiple comment\n*/\n/**\n* This is a multiple comment\n*/\n//This is a comment";	
		
		int lines = codeLines.Count(file);
						
		assertEquals(lines, 2);
	}
}
