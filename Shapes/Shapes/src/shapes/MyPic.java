package shapes;

public class MyPic {
	public static void main(String[] args) 
	{
		Picture pic = new Picture(420,300); //创建420*300的窗口；new用于创建对象
		Circle c1 = new Circle(320,40,40);//x=320,y=40,D=40直径
		Rectangle r1 = new Rectangle(100, 100, 100, 100);
		Triangle t1 = new Triangle(100, 100, 200, 100, 150, 50);
		Line l1 = new Line(0,205,400,205);
		Circle c2 = new Circle(200,200,50);
		pic.add(c1);
		pic.add(r1);
		pic.add(t1);
		pic.add(l1);
		pic.add(c2);
		pic.draw();	
		//每一个图形都是一个对象，由对应的类创建
		//对象是实体，需要被创建；类是一种规范，根据类来创建对象
		//封装：把数据和对数据的操作放在一起
	}
}
