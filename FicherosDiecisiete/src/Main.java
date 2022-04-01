import vista.Ventana;

public class Main {

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				Ventana.frame = new Ventana();
				Ventana.frame.setSize(800, 600);// asignas el tamaño con el que aparecera la ventana
				Ventana.frame.setResizable(true);// con esto en false no puedes cambiar el tamaño de la ventana
				Ventana.frame.setVisible(true);
				Ventana.frame.cambioPanel(1);
			}
		});
	}

}
