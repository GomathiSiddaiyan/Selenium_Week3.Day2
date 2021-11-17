package week3.day2;

public class College extends University {

	public void ug()
	{
		System.out.println("Unimplemented methos- UG");
	}
	public static void main(String[] args) {
		College clg= new College();
		clg.pg();
		clg.ug();
	}
}
