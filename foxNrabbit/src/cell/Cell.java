package cell;

import java.awt.*;

public class Cell {
	private boolean alive = false;
	
	public boolean isalive() {
		return alive;
	}
	
	public boolean reborn() {
		alive = true;
		return alive;
	}
	
	public boolean die() {
		alive = false;
		return alive;
	}
	
	public void draw(Graphics g, int x,int y,int size) {
		g.drawRect(x, y, size, size);
		if(alive) {
			g.fillRect(x, y, size, size);
		}
	}
}
