package dome;

public class VideoGame extends Item {
	private int numOfPlayers;
	private String title;
	public VideoGame(String title, int time, String comment, int number) {
		super(title, time, comment);
		numOfPlayers = number;
		this.title = title;
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideoGame vg1 = new VideoGame("BlackMyth", 100, "Kongfu", 200);
		System.out.println(vg1.value());
	}


	@Override
	public String value() {
		// TODO Auto-generated method stub
		return title+numOfPlayers;
	}
	
}
