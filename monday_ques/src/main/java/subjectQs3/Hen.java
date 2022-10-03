package subjectQs3;

public class Hen extends Animal{ //inheritance

	@Override
	public int legs() {
		// TODO Auto-generated method stub
		return 2;
	}
	//abstraction
	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("I am a Hen");
	}

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean tail() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	//encapsulation
	public String getSpecialFeature() {
		return "I can pak pak pakoooo";
	}

	public void setSpecialFeature(String specialFeature) {
		this.specialFeature = "I can pak pak pakoooo";
	}

	String specialFeature;


	//polymorphism
	static int son(int a) {
		
		return 5;
	}
	static int son(int a, int b) {
		return 6;
	
}
}
