import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		MiTimer miTimer = new MiTimer();
		
		JFrame ventana = new JFrame("Ejemplo Timer");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(400,400);
		
		ventana.add(miTimer);
		ventana.setVisible(true);
	}
}
