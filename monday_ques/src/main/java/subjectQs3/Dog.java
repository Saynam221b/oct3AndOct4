package subjectQs3;

public class Dog extends Animal{ //inheritance
	
	
	//abstraction
	@Override
	public int legs() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("I am a Dog");
		
	}

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean tail() {
		// TODO Auto-generated method stub
		return true;
	}
	
	//encapsulation
	public String getSpecialFeature() {
		return "I can Bark";
	}

	public void setSpecialFeature(String specialFeature) {
		this.specialFeature = "I can Bark";
	}

	String specialFeature;

	
	//polymorphism
	static int childrens(int a) {
		
		return 5;
	}
	static int childrens(int a, int b) {
		return 6;
	}
}
