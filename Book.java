import java.util.ArrayList;
import java.util.List;
public class Book {

	private String title;
	public Author name;
	//public List<Chapter> chapters;
	public List<SubChapter> subChapters;
	public List<Author> authors = new ArrayList<Author>();
	public List<Chapter> chapters = new ArrayList<Chapter>();


	public Book(String title) {
		// TODO Auto-generated constructor stub
		this.title=title;

	}

	public void print() {
		System.out.println(title);
		System.out.println("Authors: ");
		for(Author auth:authors) {
			System.out.println(auth);
		}

		for(Chapter chp:chapters) {
			chp.print();
		}
	}

	public void addAuthor(Author a) {
		//this.name=name;
		authors.add(a);
	}

	public Integer createChapter(String ch) {
		Chapter chapter = new Chapter(ch);
		this.chapters.add(chapter);
		return this.chapters.indexOf(chapter);
	}

	public Integer createSubChapter(Integer index, String subCh) {
		SubChapter subChapter = new SubChapter(subCh);
		this.subChapters.add(subChapter);
		return this.subChapters.indexOf(subChapter);
	}
	public Chapter getChapter(int index) {
		return chapters.get(index);
	}

}
