package nanashume;

public class Coord {
	int x,y;
	Coord(){
		x = y = 0;
	}
	public void move(int dx,int dy) {
		x += dx;
		y += dy;
		System.out.println("move1");
	}
	public void moveto(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
}
