package testQs3;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import subjectQs3.Hen;


public class HenTest {
	@Test
	public void ans() {
		Hen a = new Hen();
		int legs = a.legs();
		boolean fly = a.fly();
		boolean tail = a.tail();
		String spf = a.getSpecialFeature();
		
		System.out.println("This is a"+a);
		System.out.println("It has "+legs+" legs");
		System.out.println("Can it fly? "+fly);
		System.out.println("DOes it has a tail? "+ tail);
		System.out.println("My special feature is " +spf);
		
		assertEquals(2, legs);
		assertEquals(true, fly);
		assertEquals(false, tail);
		assertEquals("I can pak pak pakoooo", spf);
}
}