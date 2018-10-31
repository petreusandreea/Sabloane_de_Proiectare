

import java.util.concurrent.TimeUnit;

public class Image implements Element{
	private String name;
	public Image (String name) throws InterruptedException {
		this.name = name;
		TimeUnit.SECONDS.sleep(5);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void print(){
		System.out.println("IMAGE");
		System.out.println(name);
	}
	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getChild(int index) {
		// TODO Auto-generated method stub
		
	}
	
}
