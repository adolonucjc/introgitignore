import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class MiTimer extends JPanel implements ActionListener{
	
	private int x = 0;
	private Timer timer;
	
	public MiTimer() {
		timer = new Timer(20, this);
		timer.start();
	}

	

	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.fillOval(x, 50, 30, 30);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		x += 5;
		if(x > getWidth() - 30) {
			x = 0;
		}
		
		repaint();
		
	}





}
