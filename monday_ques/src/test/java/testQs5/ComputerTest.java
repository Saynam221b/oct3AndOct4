package testQs5;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import subjectQs5.Computer;

public class ComputerTest {
	@Test
	public void sol() {
		Computer c = new Computer();

		int keyPrice = c.keyPrice();
		String keyType = c.keyType();
		String key = c.key();

		String cpu = c.cpu();
		int cpuRam = c.cpuRam();
		String cpuProcessor = c.cpuProcessor();

		String mouse = c.mouse();
		boolean wirelessMouse = c.wirelessMouse();
		String mouseCompany = c.mouseCompany();

		String upsCompany = c.upsCompany();
		String ups = c.ups();
		int batteryDurationInHrs = c.batteryDurationInHrs();
		System.out.println();
		System.out.println("Price of keyboard is "+keyPrice);
		System.out.println("Type of keyboard is "+keyType);
		System.out.println(key);
		System.out.println();
		
		System.out.println(cpu);
		System.out.println("Ram of cpu is "+cpuRam);
		System.out.println("Processor of cpu is "+cpuProcessor);
		System.out.println();
		
		System.out.println(mouse);
		System.out.println("Is mouse wireless? "+wirelessMouse);
		System.out.println("Company of mouse is  "+mouseCompany);
		System.out.println();
		
		System.out.println("Company of ups is"+upsCompany);
		System.out.println(ups);
		System.out.println("Battery duration of ups is"+batteryDurationInHrs);
		
		assertEquals(100, keyPrice);
		assertEquals("QWERTY", keyType);
		assertEquals("this is keyboard", key);
		assertEquals("This is a cpu", cpu);
		assertEquals(8, cpuRam);
		assertEquals("INTEL", cpuProcessor);
		assertEquals("This is a mouse",mouse);
		assertEquals(true, wirelessMouse);
		assertEquals("logitech", mouseCompany);
		assertEquals("Oxide", upsCompany);
		assertEquals("This is a ups", ups);
		assertEquals(5, batteryDurationInHrs);
	}
}
