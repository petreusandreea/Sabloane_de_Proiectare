import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	
	private String title;
	private List<Paragraph> paragraphs = new ArrayList<Paragraph>();
	//List img, text, tabel

	public SubChapter(String title) {
		// TODO Auto-generated constructor stub
		this.title=title;
	}
	
	public void print() {
		System.out.println("SubChapter: " + title);
		for(Paragraph p: paragraphs) {
			System.out.println(p);
		}
	}

	public void createNewParagraph(String p) {
		// TODO Auto-generated method stub
		Paragraph para = new Paragraph(p);
		this.paragraphs.add(para);
		
	}
	

}
