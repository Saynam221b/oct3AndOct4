package testQs4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import subjectQs4.BMW;
import subjectQs4.Ferrari;
import subjectQs4.Mustang;
import subjectQs4.Tesla;

public class CarsTest {
	@Test
	public void testCars() {
		// For BMW
		BMW b = new BMW();

		String bmwName = b.name();
		Boolean bmwAuto = b.automatic();
		String bmwClr = b.color();
		int bmwGears = b.noOfGears();

		System.out.println("Name of car is "+b.name());
		System.out.println("Color of car is "+b.color());
		System.out.println("Is car automatic? "+b.automatic());
		System.out.println("No of gears in car are "+b.noOfGears());
		System.out.println();
		assertEquals("This is bmw", bmwName);
		assertEquals(true, bmwAuto);
		assertEquals("black", bmwClr);
		assertEquals(6, bmwGears);

		// For Ferrari
		Ferrari f = new Ferrari();
		String ferName = f.name();
		Boolean ferAuto = f.automatic();
		String ferClr = f.color();
		int ferGears = f.noOfGears();

		System.out.println("Name of car is "+f.name());
		System.out.println("Color of car is "+f.color());
		System.out.println("Is car automatic? "+f.automatic());
		System.out.println("No of gears in car are "+f.noOfGears());
		System.out.println();
		assertEquals("this is ferrari", ferName);
		assertEquals(false, ferAuto);
		assertEquals("red", ferClr);
		assertEquals(6, ferGears);

		// For Mustang
		Mustang m = new Mustang();
		String musName = m.name();
		Boolean musAuto = m.automatic();
		String musClr = m.color();
		int musGears = m.noOfGears();

		System.out.println("Name of car is "+m.name());
		System.out.println("Color of car is "+m.color());
		System.out.println("Is car automatic? "+m.automatic());
		System.out.println("No of gears in car are "+m.noOfGears());
		System.out.println();
		
		assertEquals("This is mustang", musName);
		assertEquals(false, musAuto);
		assertEquals("yellow", musClr);
		assertEquals(6, musGears);

		// For Tesla
		Tesla t = new Tesla();
		String tesName = t.name();
		Boolean tesAuto = t.automatic();
		String tesClr = t.color();
		int tesGears = t.noOfGears();

		System.out.println("Name of car is "+t.name());
		System.out.println("Color of car is "+t.color());
		System.out.println("Is car automatic? "+t.automatic());
		System.out.println("No of gears in car are "+t.noOfGears());

		assertEquals("this is tesla", tesName);
		assertEquals(true, tesAuto);
		assertEquals("pink", tesClr);
		assertEquals(6, tesGears);

	}

}
