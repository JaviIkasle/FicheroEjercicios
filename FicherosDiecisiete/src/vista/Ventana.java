package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	public static final long serialVersionUID = 1L;
	public static Ventana frame;// sirve para que asigne la clase a la ventana, seria como un punto de enlace entre ventanas
	private static int ANCHO_LABEL = 130;// tamaño de ancho del JLabel
	private static int ALTO_LABEL = 20;// tamaño de alto del JLabel
	
	public JPanel ventanaPrincipal() {
		
		JPanel insertarAlumno = new JPanel();
		insertarAlumno.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		insertarAlumno.setLayout(null);
		
		JLabel fich = new JLabel("ComprobarFichero: ");
		
		JLabel nombre = new JLabel("Nombre: ");
		JLabel apellido = new JLabel("Apellido: ");
		JLabel apellidoDos = new JLabel("2º Apellido: ");
		JLabel fecha = new JLabel("Fecha (yyyy/mm/dd): ");
		JLabel dni = new JLabel("DNI alumno: ");
		JLabel clase = new JLabel("Clase (COMBOBOX): ");//COMBOBOX
		nombre.setBounds(60, 100, ANCHO_LABEL, ALTO_LABEL);//
		apellido.setBounds(60, 150, ANCHO_LABEL, ALTO_LABEL);//
		apellidoDos.setBounds(60, 200, ANCHO_LABEL, ALTO_LABEL);//
		fecha.setBounds(60, 250, ANCHO_LABEL, ALTO_LABEL);//
		dni.setBounds(60, 300, ANCHO_LABEL, ALTO_LABEL);//
		clase.setBounds(60, 350, ANCHO_LABEL, ALTO_LABEL);//
		insertarAlumno.add(nombre);
		insertarAlumno.add(apellido);
		insertarAlumno.add(apellidoDos);
		insertarAlumno.add(fecha);
		insertarAlumno.add(dni);
		insertarAlumno.add(clase);
		
		JTextField tNombre = new JTextField();
		JTextField tApellido = new JTextField();
		JTextField tApellidoDos = new JTextField();
		JTextField tFecha = new JTextField();
		JTextField tDni = new JTextField();
		JTextField tClase = new JTextField();
		tNombre.setBounds(200, 100, ANCHO_LABEL, ALTO_LABEL);
		tApellido.setBounds(200, 150, ANCHO_LABEL, ALTO_LABEL);
		tApellidoDos.setBounds(200, 200, ANCHO_LABEL, ALTO_LABEL);
		tFecha.setBounds(200, 250, ANCHO_LABEL, ALTO_LABEL);
		tDni.setBounds(200, 300, ANCHO_LABEL, ALTO_LABEL);
		tClase.setBounds(200, 350, ANCHO_LABEL, ALTO_LABEL);
		insertarAlumno.add(tNombre);
		insertarAlumno.add(tApellido);
		insertarAlumno.add(tApellidoDos);
		insertarAlumno.add(tFecha);
		insertarAlumno.add(tDni);
		insertarAlumno.add(tClase);
		
		JLabel error = new JLabel();
		error.setBounds(70, 450, 400, ALTO_LABEL);// asignar en la ventana el lugar donde aparecera
		error.setForeground(Color.RED);// color del mensaje error error
		insertarAlumno.add(error);
		
		JButton boton = new JButton("Insertar Alumno");
		boton.setBounds(150, 400, ANCHO_LABEL, ALTO_LABEL);
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(tNombre.getText().equalsIgnoreCase("admin") && tApellido.getText().equals("ADMIN")) {
					frame.cambioPanel(2);
				}else {
					error.setText("Nombre de usuario o contraseña Incorrectos.");//setText es el nuevo SYSO
				}
			}
		});
		insertarAlumno.add(boton);
		
		return insertarAlumno;
	}
	
	
	
	
public void cambioPanel(int opcion) {
		
		switch (opcion) {
		case 1:
			frame.setContentPane(ventanaPrincipal());
			//break;
		//case 2: frame.setContentPane(panelRegistrar());
		}
	}

}
