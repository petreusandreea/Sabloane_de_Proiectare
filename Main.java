
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book myBook = new Book("Disco titanic");
		Author myAuthor = new Author("Radu Pavel Gheo");
		
		myBook.addAuthor(myAuthor);
		int indexChapterOne = myBook.createChapter("Capitolul 1");
		Chapter chp1 = myBook.getChapter(indexChapterOne);
		int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
		SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
		
		scOneOne.createNewParagraph("Paragraph 1");
		/*scOneOne.createNewParagraph("Paragraph 2");
		scOneOne.createNewParagraph("Paragraph 3");
		scOneOne.createNewImage("Image 1");
		scOneOne.createNewParagraph("Paragraph 4");
		scOneOne.createNewTable("Table 1");
		scOneOne.createNewParagraph("Paragraph 5");*/
		
		// interfata Element cu fct print() si apoi clasele image, paragraph,table mostenesc
		//Element
		
		scOneOne.print();
		
	}

}
