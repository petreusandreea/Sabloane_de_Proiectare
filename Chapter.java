import java.util.*;

public class Chapter {
	
	public String title;
	public List<SubChapter> subChapters;
	
	public Chapter(String ch) {
		
		this.title = ch;
	}

	public void print() {
		for(SubChapter sbChp:subChapters) {
			System.out.println(sbChp);
		}
	}

	public int createSubChapter(String sbCh) {
		// TODO Auto-generated method stub
		SubChapter ch = new SubChapter(sbCh);
		this.subChapters.add(ch);
		return this.subChapters.indexOf(ch);
	}
	public SubChapter getSubChapter(int index) {
		return this.subChapters.get(index);
	}


}
