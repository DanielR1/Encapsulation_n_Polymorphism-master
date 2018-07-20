package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedPolymorph extends Polymorph {

	RedPolymorph(int x, int y) {
		super(x, y);
		width=50;
		height=50;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		
	}

}
