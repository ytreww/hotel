package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.*;
import javax.swing.border.Border;

public class VentanaUsuario extends JPanel {
	
	private JButton btnAlta;
	private JButton btnBaja;
	private JButton btnConsulta;
	private JButton btnModificacion;
	private JLabel lblTitulo;

	public VentanaUsuario(){
		setSize(750,500);
		setBackground(new Color(37, 112, 89));
		setLayout(null);
		setBorder(BorderFactory.createLineBorder(new Color(88, 135, 121), 5));
		inicializarComponentes();
	}
	
	public void inicializarComponentes(){
		btnAlta = new JButton("Alta");
		btnAlta.setBounds(80,70,100,35);
		add(btnAlta);
		btnBaja = new JButton("Baja");
		btnBaja.setBounds(230,70,100,35);
		add(btnBaja);
		btnConsulta = new JButton("Consulta");
		btnConsulta.setBounds(380,70,100,35);
		add(btnConsulta);
		btnModificacion = new JButton("Modificar");
		btnModificacion.setBounds(530,70,100,35);
		add(btnModificacion);
		lblTitulo = new JLabel("Usuarios");
		lblTitulo.setBounds(270,20,200,25);
		lblTitulo.setFont(new Font("Arial", Font.PLAIN, 35));
		lblTitulo.setForeground(Color.white);
		add(lblTitulo);
		
	}
}
