
public class Main {
	public static void main (String []args){
		/*Book noapteBuna = new Book("Noapte buna, copii!");
		Author gheo = new Author ("Radu Pavel Gheo");
		noapteBuna.addAuthor(gheo);
		noapteBuna.add(new Paragraph("Multumesc, ... "));
		Element cap1 = new Section("Capitolul 1");
		cap1.add(new Paragraph("Aici..."));
		Element cap11 = new Section("Subcapitol 1.1");
		cap11.add(new Section("Sub subcapitol 1.1.1"));
		cap11.add(new Paragraph("Primul sub subcapitol"));
		cap11.add(new Section("Sub subcaptiol 1.1.2"));
		cap11.add(new Paragraph("Al doilea sub subcapitol"));
		Element cap12 = new Section("Subcapitol 1.2");
		cap1.add(cap11);
		cap1.add(cap12);
		noapteBuna.add(cap1);
		
		noapteBuna.print();*/
		
		// lab 5
		/*
		long startTime = System.currentTimeMillis();
		Section cap1 = new Section("masini");
		cap1.add(new ImageProxy("pamela"));
		
		
		Section cap2 = new Section("Auto show");
		cap2.add(new ImageProxy("myBMW"));
		
		cap2.add(new ImageProxy("my car is trabi"));
		
		cap1.print();
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		*/
		//lab6
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
			
		System.out.println("Printing without Alignment");
		System.out.println();
		cap1.print();
			
		p1.setAlignStrategy(new Align_Center());
		p2.setAlignStrategy(new Align_Right());
		p3.setAlignStrategy(new Align_Left());
			
		System.out.println();
		System.out.println("Printing with Alignment");
		System.out.println();
		cap1.print();


		
		
	}
}
