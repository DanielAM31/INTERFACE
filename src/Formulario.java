import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener{
	JButton boton1;
	public Formulario() {
		setLayout(null);
		boton1 = new JButton("Acepter");
		boton1.setBounds (300,250,100,30);
		add(boton1);
		boton1.addActionListener((ActionListener) this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			System.exit(0);
		}
	}

}
