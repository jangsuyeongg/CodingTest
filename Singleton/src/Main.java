
public class Main {

	public static void main(String[] args) {
		//SystemSpeaker speaker = new SystemSpeaker(); <- private �̶� new �ȵ�!
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
	
		System.out.println(speaker1.getVolume()); //5
		System.out.println(speaker2.getVolume()); //5
		
		speaker1.setVolume(6);
		System.out.println(speaker1.getVolume()); //6
		speaker2.setVolume(7);
		System.out.println(speaker2.getVolume()); //7

	}

}
