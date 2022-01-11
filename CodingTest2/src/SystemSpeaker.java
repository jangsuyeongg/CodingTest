
public class SystemSpeaker {
	static private SystemSpeaker instance;
	private int volume;
	
	private SystemSpeaker() {
		
	}
	
	public static SystemSpeaker getInstance() {
		if(instance == null) {
			instance = new SystemSpeaker();
			//인스턴스가 없으면 한개 생성 (new)
		}
		return instance;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
