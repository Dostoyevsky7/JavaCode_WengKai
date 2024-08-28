package dome;

//改建之前的CD类
//public class CD{
//	private String title;
//	private String artist;
//	private int tracks;
//	private int time;
//	private boolean gotit = false;
//	private String comment;
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public void setArtist(String artist) {
//		this.artist = artist;
//	}
//	public void numberOfTracks(int time) {
//		this.time = time;
//	}
//	public void playTime(int time) {
//		this.time = time;
//	}
//	public void setComment(String comment) {
//		this.comment = comment;
//	}

//改进后的
public class CD extends Item{
//	private String title;
	private String artist;
	private int tracks;
//	private int time;
	private boolean gotit = false;
//	private String comment;
	public CD(String title, String artist, int tracks, int time, String comment) {
		super(title,time,comment);
		/*
		 * 这一行super(title);的意思是到父类那里去，
		 * 调用一个父类的，参数是title的，构造器
		 * 即去父类那里把title这个参数传过来
		 * 所以类推，super()的意思是访问一个不要求输入的对象
		 * 当Item中只有一个规定的对象String title的时候，就会找不到
		 * 所以DVD对super();这一行报错
		 * 
		 * 另外，在给对象初始化的时候，初始化的顺序：
		 * 父类的定义初始化&构造器，然后是子类里面的定义初始化(像private boolean gotit = false;这样的)
		 * 然后再是子类剩下的构造器(比如这里的public CD(String title, String artist, int tracks, int time, String comment) {这个构造器)
		 * 这个顺序一定会被执行，不管有无super()
		 * 没有super()，也会自动去找父类里面没有参数的构造器的
		 */
		//this.title = title;
		this.artist = artist;
		this.tracks = tracks;
//		this.time = time;
//		this.comment = comment;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD cd = new CD("dfntly maybe","Oasis",2,2,"great");
		System.out.println(cd.toString());
		System.out.println("aa"+cd);
		CD cd1 = new CD("dfntly maybe","Oasis",2,2,"great");
		System.out.println(cd.equals(cd1));
	}
//	public String value() {
//		// TODO Auto-generated method stub
//		return title+":"+artist;
//	}
	@Override
	public String toString() {
		return "CD [artist=" + artist + ", tracks=" + tracks + ", gotit=" + gotit + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		CD cc = (CD)obj;
		return artist.equals(cc.artist)&&tracks==cc.tracks;
	}
	

}
