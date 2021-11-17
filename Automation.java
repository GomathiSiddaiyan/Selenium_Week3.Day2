package week3.day2;

public class Automation extends MultipleLanguage implements Language, TestTool {

	public static void main(String[] args) {
		
		// extends, implements 
		Automation au= new Automation();
		au.java();
		au.Selenium();
		au.python();
		au.ruby();
		
	}

	@Override
	public void Selenium() {
		// Selenium method from TestTool Interface
		System.out.println("Selenium method from TestTool Interface - implementing in Automation class");
	}

	@Override
	public void java() {
		// java method from Language Interface
		System.out.println("Java method from Language Interface - implementing in Automation class");
	}

	@Override
	public void ruby() {
		// ruby method from Multiple language Abstract class
		System.out.println("Ruby method from Multiple language Abstract class - implementing in Automation class");
	}

}
