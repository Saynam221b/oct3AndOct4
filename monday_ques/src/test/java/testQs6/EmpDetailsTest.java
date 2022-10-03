package testQs6;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import subjectQs6.EmpDetails;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmpDetailsTest {

	@Test
	public void checkEmployeeData() {

		Map<Integer, String> ans = new HashMap<Integer, String>();

		ans.put(111, "Saynam");
		ans.put(222, "Ruder");
		ans.put(333, "Arghya");
		ans.put(444, "Tejas");
		ans.put(555, "Sumedh");

		assertTrue(EmpDetails.mapFn().containsKey(111) && ans.get(111) != null);
		assertEquals(EmpDetails.mapFn().containsValue("Saynam"), ans.containsValue("Saynam"));

		assertTrue(EmpDetails.mapFn().containsKey(222) && ans.get(222) != null);
		assertEquals(EmpDetails.mapFn().containsValue("Ruder"), ans.containsValue("Ruder"));

		assertTrue(EmpDetails.mapFn().containsKey(333) && ans.get(333) != null);
		assertEquals(EmpDetails.mapFn().containsValue("Arghya"), ans.containsValue("Arghya"));

		assertTrue(EmpDetails.mapFn().containsKey(444) && ans.get(444) != null);
		assertEquals(EmpDetails.mapFn().containsValue("Tejas"), ans.containsValue("Tejas"));

		assertTrue(EmpDetails.mapFn().containsKey(555) && ans.get(555) != null);
		assertEquals(EmpDetails.mapFn().containsValue("Sumedh"), ans.containsValue("Sumedh"));

		System.out.println("All employee details verified");

	}

}