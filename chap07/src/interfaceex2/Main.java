package interfaceex2;

public class Main {

	public static void main(String[] args) {
		Television tv = new Television();
		
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc.setMute(true);
		
		RemoteControl.changeBattery();
	}

}
