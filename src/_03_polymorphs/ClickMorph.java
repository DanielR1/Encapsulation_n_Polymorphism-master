package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class ClickMorph extends Polymorph implements MouseListener {

	ClickMorph(int x, int y) {
		super(x, y);
		width = 50;
		height = 50;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.GREEN);
		g.fillRect(getX(), getY(), getWidth(), getHeight());

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if ((getX() - 25) <= e.getX()-20 && e.getX()-20 <= (getX() + 25) && (getY() - 25) <= e.getY()-45 && e.getY()-45 <= (getY() + 25)) {
			JOptionPane.showMessageDialog(null, "urmom");
			System.out.println("ll");
		}
		System.out.println("c");
		System.out.println(e.getX());
		System.out.println(e.getY());
		System.out.println(getX());
		System.out.println(getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
