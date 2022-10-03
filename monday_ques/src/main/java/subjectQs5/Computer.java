package subjectQs5;

public class Computer implements Keyboard, Mouse,Cpu,Ups {

	@Override
	public String mouse() {
		// TODO Auto-generated method stub
		return "This is a mouse";
	}

	@Override
	public String upsCompany() {
		// TODO Auto-generated method stub
		return "Oxide";
	}

	@Override
	public String cpu() {
		// TODO Auto-generated method stub
		return "This is a cpu";
	}

	@Override
	public int batteryDurationInHrs() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String cpuProcessor() {
		// TODO Auto-generated method stub
		return "INTEL";
	}

	@Override
	public boolean wirelessMouse() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String keyType() {
		// TODO Auto-generated method stub
		return "QWERTY";
	}

	@Override
	public int keyPrice() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public String ups() {
		// TODO Auto-generated method stub
		return "This is a ups";
	}

	@Override
	public int cpuRam() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public String mouseCompany() {
		// TODO Auto-generated method stub
		return "logitech";
	}

	@Override
	public String key() {
		// TODO Auto-generated method stub
		return "this is keyboard";
	}


}