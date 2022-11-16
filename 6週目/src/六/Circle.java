package 六;

import java.awt.Graphics;
public class Circle extends coord{
	int color,size;
	Circle(){
		System.out.println("Circle");
		color = 0;
		size = 1;
	}
	@Override public void paint(Graphics g) {
		g.drawOval(x -size/2, y-size/2,size,size);
	}

}
