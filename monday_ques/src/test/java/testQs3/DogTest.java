package testQs3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import subjectQs3.Dog;

public class DogTest {
	@Test
	public void ans() {
		Dog a = new Dog();
		int legs = a.legs();
		boolean fly = a.fly();
		boolean tail = a.tail();
		String spf = a.getSpecialFeature();
		
		System.out.println("This is a"+a);
		System.out.println("It has "+legs+" legs");
		System.out.println("Can it fly? "+fly);
		System.out.println("DOes it has a tail? "+ tail);
		System.out.println("My special feature is " +spf);
		
		assertEquals(4, legs);
		assertEquals(false, fly);
		assertEquals(true, tail);
		assertEquals("I can Bark", spf);

	}

}
