package subjectQs6;

import java.util.HashMap;
import java.util.Map;

public class EmpDetails {

	public static Map<Integer, String> mapFn() {

		Map<Integer, String> mp = new HashMap<Integer, String>(); // Integer for id, String for name.

		mp.put(111, "Saynam");
		mp.put(222, "Ruder");
		mp.put(333, "Arghya");
		mp.put(444, "Tejas");
		mp.put(555, "Sumedh");

		return mp;

	}

	public static void main(String[] args) {

		mapFn().entrySet().stream().forEach(System.out::println);

	}

}