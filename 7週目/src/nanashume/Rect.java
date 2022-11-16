package nanashume;

import java.awt.Color;
import java.awt.Graphics;

public class Rect extends Figure{
	int size;
	int countx;
	Rect(int count){
		countx = count;
		size= 100;
		//if(countx % 2 ==0) {

		//}
	}
	//public void setSize(int s) {
		//size = s;
	//}
	@Override public void paint(Graphics g) {
		if(countx % 2 == 0) g.setColor(new Color(1,0,0));
		else g.setColor(new Color(255,0,0));
		g.drawRect(x - size/2, y-size/2, size, size);
		g.drawOval(x - size/10, y-size/10, size/5, size/5);
	}
	//@Override public void paintr(Graphics g,int countx) {
		//if(countx % 2 == 0) {
			
		//}

	//}
}
