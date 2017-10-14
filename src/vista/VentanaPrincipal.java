package vista;

import java.awt.Color;

import javax.swing.*;

public class VentanaPrincipal extends JFrame {
	
	private JMenuBar barraMenu;
	private JMenu menuUsuarios;
	private JMenu menuClientes;
	private JMenu menuReservaciones;
	private JMenu menuCaja;
	private JMenuItem usuariosAlta;
	private JMenuItem usuariosBaja;
	private JMenuItem usuariosConsulta;
	private JMenuItem usuariosModificacion;
	private JMenuItem clientesAlta;
	private JMenuItem clientesBaja;
	private JMenuItem clientesConsulta;
	private JMenuItem clientesModificacion;
	private JMenuItem reservacionRegistrar;
	private JMenuItem cajaReporteDiario;
	private JMenuItem cajaReporteMensual;
	private VentanaUsuario ventanaUsuario;
	
	public VentanaPrincipal(){
		inicializarComponentes();
		setTitle("Hotel Trivago");
		setResizable(false);
		setSize(1280,720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null); 
		setJMenuBar(barraMenu);
		getContentPane().setBackground(Color.white);
	}
	
	public void inicializarComponentes(){
		// -- Barra de menu -- 
		barraMenu = new JMenuBar();
		barraMenu.setOpaque(true);
		barraMenu.setBackground(new Color(37, 112, 89));
		menuUsuarios = new JMenu("Usuarios");
		menuUsuarios.setForeground(Color.white);
		menuClientes = new JMenu("Clientes");
		menuClientes.setForeground(Color.white);
		menuReservaciones = new JMenu("Reservaciones");
		menuReservaciones.setForeground(Color.white);
		menuCaja = new JMenu("Caja");
		menuCaja.setForeground(Color.white);
		usuariosAlta = new JMenuItem("Alta");
		usuariosAlta.setBackground(new Color(37, 112, 89));
		usuariosAlta.setForeground(Color.white);
		usuariosBaja = new JMenuItem("Baja");
		usuariosBaja.setBackground(new Color(37, 112, 89));
		usuariosBaja.setForeground(Color.white);
		usuariosConsulta = new JMenuItem("Consulta");
		usuariosConsulta.setBackground(new Color(37, 112, 89));
		usuariosConsulta.setForeground(Color.white);
		usuariosModificacion = new JMenuItem("Modificacion");
		usuariosModificacion.setBackground(new Color(37, 112, 89));
		usuariosModificacion.setForeground(Color.white);
		clientesAlta = new JMenuItem("Alta");
		clientesAlta.setBackground(new Color(37, 112, 89));
		clientesAlta.setForeground(Color.white);
		clientesBaja = new JMenuItem("Baja");
		clientesBaja.setBackground(new Color(37, 112, 89));
		clientesBaja.setForeground(Color.white);
		clientesConsulta = new JMenuItem("Consulta");
		clientesConsulta.setBackground(new Color(37, 112, 89));
		clientesConsulta.setForeground(Color.white);
		clientesModificacion = new JMenuItem("Modificacion");
		clientesModificacion.setBackground(new Color(37, 112, 89));
		clientesModificacion.setForeground(Color.white);
		reservacionRegistrar = new JMenuItem("Registrar");
		reservacionRegistrar.setBackground(new Color(37, 112, 89));
		reservacionRegistrar.setForeground(Color.white);
		cajaReporteDiario = new JMenuItem("Reporte Diario");
		cajaReporteDiario.setBackground(new Color(37, 112, 89));
		cajaReporteDiario.setForeground(Color.white);
		cajaReporteMensual = new JMenuItem("Reporte Mensual");
		cajaReporteMensual.setBackground(new Color(37, 112, 89));
		cajaReporteMensual.setForeground(Color.white);
		
		menuUsuarios.add(usuariosAlta);
		menuUsuarios.add(usuariosBaja);
		menuUsuarios.add(usuariosConsulta);
		menuUsuarios.add(usuariosModificacion);
		
		menuClientes.add(clientesAlta);
		menuClientes.add(clientesBaja);
		menuClientes.add(clientesConsulta);
		menuClientes.add(clientesModificacion);
		
		menuReservaciones.add(reservacionRegistrar);
		
		menuCaja.add(cajaReporteDiario);
		menuCaja.add(cajaReporteMensual);
		
		barraMenu.add(menuUsuarios);
		barraMenu.add(menuClientes);
		barraMenu.add(menuReservaciones);
		barraMenu.add(menuCaja);
		// -- Barra de menu --
		// -- Ventana Usuario --
		ventanaUsuario = new VentanaUsuario();
		ventanaUsuario.setLocation(200, 50);
		add(ventanaUsuario);
		// -- Ventana usuario --
		
	}
	
}
