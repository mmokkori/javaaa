package nanashume;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Figure{
	int size;
	Circle(){
		size = 100;
		
	}
	public void setSize(int s) {
		size = s;
	}
	@Override public void paint(Graphics g) {
		g.setColor(new Color(255,0,0));
		g.drawOval(x-size/10, y-size/10, size/5, size/5);
	}


}
