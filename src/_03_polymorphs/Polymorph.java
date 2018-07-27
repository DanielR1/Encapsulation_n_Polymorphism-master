package _03_polymorphs;

import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public abstract class Polymorph implements MouseMotionListener, MouseListener {
	int x;
	int y;
	int width;
	int height;

	Polymorph(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public void update() {

	}

	public abstract void draw(Graphics g);

	int getWidth() {
		return width;
	}

	void setWidth(int width) {
		this.width = width;
	}

	int getHeight() {
		return height;
	}

	void setHeight(int height) {
		this.height = height;
	}

	int getY() {
		return y;
	}

	void setY(int y) {
		this.y = y;
	}

	int getX() {
		return x;
	}

	void setX(int x) {
		this.x = x;
	}
}
