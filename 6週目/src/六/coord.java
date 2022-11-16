package 六;

import java.awt.Graphics;
public class coord {
	int x,y;
	coord(){
		System.out.println("Coord");
		x = y = 0;
	}
	public void move(int dx,int dy) {
		x += dx;
		y += dy;
	}
	public void moveto(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void paint(Graphics g) {}

}
