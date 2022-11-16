package nanashume;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Paint2 extends Frame implements MouseListener,MouseMotionListener{
	int x,y;
	int count = 0;
	int clll = 0;
	static int countx = 0;
	int hai[]=new int [9999999];
	Circle c;
	ArrayList<Figure> objList;
	ArrayList<Figure> objList1;
	Figure obj;
	public static void main(String[] args) {
		Paint2 f = new Paint2();
		f.setSize(640,480);
		f.setTitle("Paint Sample");
		f.addWindowListener(new WindowAdapter() {
			@Override public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
	Paint2(){
		objList = new ArrayList<Figure>();
		objList1 = new ArrayList<Figure>();
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	@Override public void paint(Graphics g) {
		Figure f;
		for(int i = 0; i < objList.size();i++) {
			f = objList.get(i);
			f.paint(g);	
		}
		for(int i = 0; i < objList1.size();i++) {
			f = objList1.get(i);
			f.paint(g);
		}
		if(obj != null) {
			obj.paint(g);
		}	
	}
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	
		obj = new Rect(clll);
		obj.moveto(x,y);
	
			objList.add(obj);
	
		repaint();
		obj = null;
	
		count++;
		clll++;
		System.out.println(count);
	}
	@Override public void mouseReleased(MouseEvent e) {
		x = e.getX();
		y = e.getY();

		obj.moveto(x,y);

		repaint();
		countx++;

		System.out.println(count);
		System.out.println(countx);
	}
	@Override public void mouseClicked(MouseEvent e) {}
	@Override public void mouseEntered(MouseEvent e) {}
	@Override public void mouseExited(MouseEvent e) {}
	@Override public void mouseDragged(MouseEvent e) {
		x = e.getX();
		y = e.getY();

		obj = new Rect(clll);
		obj.moveto(x,y);
		objList.add(obj);

		repaint();
		obj = null;
		count++;
		System.out.println(count);
	}
	@Override public void mouseMoved(MouseEvent e) {}

}
