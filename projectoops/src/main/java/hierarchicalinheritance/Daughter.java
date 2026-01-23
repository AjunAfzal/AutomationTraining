package hierarchicalinheritance;

public class Daughter extends Father{
	public void sports()
	{
		System.out.println("Daughter is a Great Runner");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter d=new Daughter();
		d.skills();
		d.sports();

	}

}
