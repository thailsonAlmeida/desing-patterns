package Bridge.exemplo;

public class Client {
	public static void main(String[] args) {
		testDevice(new Tv());
		//testDevice(new Radio());
	}
	
	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		basicRemote.channelDown();
		basicRemote.volumeUp();
		basicRemote.channelUp();
		device.printStatus();
		
		System.out.println("Tests with advanced remote.");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.power();
        advancedRemote.mute();
        advancedRemote.power();
        device.printStatus();
	}
}
