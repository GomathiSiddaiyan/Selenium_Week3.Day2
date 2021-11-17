package week3.day2;

public class Desktop implements Hardware, Software{
	public void desktopModel()
	{
		System.out.println("Desktop model");
	}
	
	public static void main(String[] args) {
		// create 2 Interface and achieve  multiple inheritance.
		System.out.println("Achieving Multiple inheritance");
		Desktop desk= new Desktop();
		desk.HardwareResource();
		desk.SoftwareResource();
		desk.desktopModel();
	}

	@Override
	public void SoftwareResource() {
		System.out.println("Interface-Software ");
		
	}

	@Override
	public void HardwareResource() {
		System.out.println("Interface- Hardware ");
		
	}

}
