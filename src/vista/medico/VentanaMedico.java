package vista.medico;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import net.miginfocom.swing.MigLayout;
import vista.ventanaPrincipal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JList;
import java.awt.Checkbox;
import java.awt.Label;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JDialog;

public class VentanaMedico extends JDialog {
	protected JPanel contentPane;
	protected JTextField getTxtBuscar;
	private JTextField txtgetNombre;
	private JTextField txtNombreEspecialista;
	private JTextField txtNombreMedicoAP;
	private JTextField getTxtNombreMedico;
	private JTextField getTxtApellidosMedico;
	private JTextField getTxtTelefonoMedico;
	private JTextField getTxtDireccionMedico;
	private JPanel panelBuscarMedico;
	private JButton btnBuscar;
	private JButton btnConsultarMedico;
	private JButton btnBuscarEspecialista;
	private Checkbox checkLMV;
	private Checkbox checkMJ;
	private JComboBox comboBoxTurnoEspecialista;
	private JButton btnAnadirEspecialista;
	private JButton btnBuscarMedicoAP;
	private JComboBox comboBoxTurnoMedicoAP;
	private JButton btnAnadirAtencionPrimaria;
	private JComboBox comboBoxEspecialidad;

		public VentanaMedico() {
			setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaPrincipal.class.getResource("/images/iconsalud.png")));
			getContentPane().setBackground(new Color(255, 255, 255));
			getContentPane().setLayout(null);
			setBounds(100, 100, 750, 500);
			setLocationRelativeTo(null);
			setModal(true);
			
			ImageIcon iconagregar = new ImageIcon(this.getClass().getResource("/images/agregar.png"));
			ImageIcon iconbuscar = new ImageIcon(this.getClass().getResource("/images/buscar.png"));

			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBackground(Color.WHITE);
			tabbedPane.setBounds(0, 0, 734, 461);
			getContentPane().add(tabbedPane);
			
			panelBuscarMedico = new JPanel();
			panelBuscarMedico.setBackground(Color.WHITE);
			tabbedPane.addTab("Buscar Medico", iconbuscar, panelBuscarMedico, null);
			panelBuscarMedico.setLayout(null);
			
			txtgetNombre = new JTextField();
			txtgetNombre.setBounds(80, 50, 345, 27);
			panelBuscarMedico.add(txtgetNombre);
			txtgetNombre.setColumns(10);
			txtgetNombre.setBorder(new LineBorder(new Color(0, 102, 204), 2));
			
			btnBuscar = new JButton("Buscar");
			btnBuscar.setBackground(new Color(0, 102, 204));
			btnBuscar.setFont(new Font("Verdana", Font.BOLD, 11));
			btnBuscar.setForeground(Color.WHITE);
			btnBuscar.setContentAreaFilled(false);
			btnBuscar.setBorderPainted(false);
			btnBuscar.setOpaque(true);
			btnBuscar.setBounds(520, 50, 89, 23);
			panelBuscarMedico.add(btnBuscar);
			
			btnConsultarMedico = new JButton("Consultar");
			btnConsultarMedico.setBackground(new Color(0, 102, 204));
			btnConsultarMedico.setFont(new Font("Verdana", Font.BOLD, 11));
			btnConsultarMedico.setForeground(Color.WHITE);
			btnConsultarMedico.setContentAreaFilled(false);
			btnConsultarMedico.setBorderPainted(false);
			btnConsultarMedico.setOpaque(true);
			btnConsultarMedico.setBounds(520, 130, 125, 25);
			panelBuscarMedico.add(btnConsultarMedico);
			
			JPanel panelAnadirMedico = new JPanel();
			panelAnadirMedico.setBackground(Color.WHITE);
			tabbedPane.addTab("A�adir m�dico", iconagregar, panelAnadirMedico, null);
			panelAnadirMedico.setLayout(null);
			
			JLabel lblNombre = new JLabel("Nombre");
			lblNombre.setForeground(new Color(0, 102, 204));
			lblNombre.setFont(new Font("Verdana", Font.BOLD, 14));
			lblNombre.setBounds(44, 64, 86, 26);
			panelAnadirMedico.add(lblNombre);
			
			JLabel lblApellidos = new JLabel("Apellidos");
			lblApellidos.setForeground(new Color(0, 102, 204));
			lblApellidos.setFont(new Font("Verdana", Font.BOLD, 14));
			lblApellidos.setBounds(44, 112, 86, 26);
			panelAnadirMedico.add(lblApellidos);
			
			JLabel lblTelefono = new JLabel("Tel\u00E9fono");
			lblTelefono.setForeground(new Color(0, 102, 204));
			lblTelefono.setFont(new Font("Verdana", Font.BOLD, 14));
			lblTelefono.setBounds(44, 163, 86, 19);
			panelAnadirMedico.add(lblTelefono);
			
			JLabel lblDireccion = new JLabel("Direcci\u00F3n");
			lblDireccion.setForeground(new Color(0, 102, 204));
			lblDireccion.setFont(new Font("Verdana", Font.BOLD, 14));
			lblDireccion.setBounds(44, 206, 86, 26);
			panelAnadirMedico.add(lblDireccion);
			
			JLabel lblEspecialidad = new JLabel("Especialidad");
			lblEspecialidad.setForeground(new Color(0, 102, 204));
			lblEspecialidad.setFont(new Font("Verdana", Font.BOLD, 14));
			lblEspecialidad.setBounds(44, 265, 115, 26);
			panelAnadirMedico.add(lblEspecialidad);
			
			getTxtNombreMedico = new JTextField();
			getTxtNombreMedico.setColumns(10);
			getTxtNombreMedico.setBorder(new LineBorder(new Color(0, 102, 204), 2));
			getTxtNombreMedico.setBackground(Color.WHITE);
			getTxtNombreMedico.setBounds(233, 69, 169, 20);
			panelAnadirMedico.add(getTxtNombreMedico);
			
			getTxtApellidosMedico = new JTextField();
			getTxtApellidosMedico.setColumns(10);
			getTxtApellidosMedico.setBorder(new LineBorder(new Color(0, 102, 204), 2));
			getTxtApellidosMedico.setBackground(Color.WHITE);
			getTxtApellidosMedico.setBounds(233, 117, 169, 20);
			panelAnadirMedico.add(getTxtApellidosMedico);
			
			getTxtTelefonoMedico = new JTextField();
			getTxtTelefonoMedico.setColumns(10);
			getTxtTelefonoMedico.setBorder(new LineBorder(new Color(0, 102, 204), 2));
			getTxtTelefonoMedico.setBackground(Color.WHITE);
			getTxtTelefonoMedico.setBounds(233, 163, 169, 20);
			panelAnadirMedico.add(getTxtTelefonoMedico);
			
			getTxtDireccionMedico = new JTextField();
			getTxtDireccionMedico.setColumns(10);
			getTxtDireccionMedico.setBorder(new LineBorder(new Color(0, 102, 204), 2));
			getTxtDireccionMedico.setBackground(Color.WHITE);
			getTxtDireccionMedico.setBounds(233, 206, 169, 20);
			panelAnadirMedico.add(getTxtDireccionMedico);
			
			JButton btnAnadirMedico = new JButton("A\u00F1adir");
			btnAnadirMedico.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnAnadirMedico.setBackground(new Color(204, 255, 204));
			btnAnadirMedico.setContentAreaFilled(false);
			btnAnadirMedico.setBorderPainted(false);
			btnAnadirMedico.setOpaque(true);
			btnAnadirMedico.setBounds(600, 361, 89, 23);
			panelAnadirMedico.add(btnAnadirMedico);
			
			comboBoxEspecialidad = new JComboBox();
			comboBoxEspecialidad.setBounds(233, 270, 169, 19);
			panelAnadirMedico.add(comboBoxEspecialidad);
			
			
			JPanel panelA�adirMedicoEspecialista = new JPanel();
			panelA�adirMedicoEspecialista.setBorder(null);
			panelA�adirMedicoEspecialista.setBackground(Color.WHITE);
			tabbedPane.addTab("Alta Medico Especialista", iconagregar, panelA�adirMedicoEspecialista, null);
			panelA�adirMedicoEspecialista.setLayout(null);
			
			txtNombreEspecialista = new JTextField();
			txtNombreEspecialista.setColumns(10);
			txtNombreEspecialista.setBorder(new LineBorder(new Color(102, 153, 255), 2));
			txtNombreEspecialista.setBounds(44, 56, 405, 25);
			panelA�adirMedicoEspecialista.add(txtNombreEspecialista);
			
			btnBuscarEspecialista = new JButton("Buscar");
			btnBuscarEspecialista.setContentAreaFilled(false);
			btnBuscarEspecialista.setBorderPainted(false);
			btnBuscarEspecialista.setOpaque(true);
			btnBuscarEspecialista.setForeground(Color.WHITE);
			btnBuscarEspecialista.setFont(new Font("Verdana", Font.BOLD, 11));
			btnBuscarEspecialista.setBackground(new Color(0, 102, 204));
			btnBuscarEspecialista.setBounds(517, 56, 89, 23);
			panelA�adirMedicoEspecialista.add(btnBuscarEspecialista);
			
			checkLMV = new Checkbox("Lunes Mi\u00E9rcoles Viernes");
			checkLMV.setFont(new Font("Georgia", Font.BOLD, 12));
			checkLMV.setForeground(new Color(0, 51, 102));
			checkLMV.setBackground(new Color(204, 255, 255));
			checkLMV.setBounds(502, 124, 160, 22);
			panelA�adirMedicoEspecialista.add(checkLMV);
			
			checkMJ = new Checkbox("Martes Jueves");
			checkMJ.setForeground(new Color(0, 51, 102));
			checkMJ.setFont(new Font("Georgia", Font.BOLD, 12));
			checkMJ.setBackground(new Color(204, 255, 255));
			checkMJ.setBounds(502, 152, 139, 22);
			panelA�adirMedicoEspecialista.add(checkMJ);
			
			btnAnadirEspecialista = new JButton("A\u00F1adir");
			btnAnadirEspecialista.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnAnadirEspecialista.setBackground(new Color(204, 255, 204));
			btnAnadirEspecialista.setContentAreaFilled(false);
			btnAnadirEspecialista.setBorderPainted(false);
			btnAnadirEspecialista.setOpaque(true);
			btnAnadirEspecialista.setBounds(600, 361, 89, 23);
			panelA�adirMedicoEspecialista.add(btnAnadirEspecialista);
			
			comboBoxTurnoEspecialista = new JComboBox();
			comboBoxTurnoEspecialista.setMaximumRowCount(2);
			comboBoxTurnoEspecialista.setBackground(Color.LIGHT_GRAY);
			comboBoxTurnoEspecialista.setForeground(new Color(0, 0, 0));
			comboBoxTurnoEspecialista.setBounds(575, 200, 114, 20);
			panelA�adirMedicoEspecialista.add(comboBoxTurnoEspecialista);
			
			JLabel lblTurno = new JLabel("Turno");
			lblTurno.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblTurno.setForeground(new Color(0, 51, 153));
			lblTurno.setBounds(485, 203, 61, 14);
			panelA�adirMedicoEspecialista.add(lblTurno);
			
			JPanel panelA�adirMedicoAP = new JPanel();
			panelA�adirMedicoAP.setBackground(Color.WHITE);
			tabbedPane.addTab("Alta M�dico Atenci�n Primaria", iconagregar, panelA�adirMedicoAP, null);
			panelA�adirMedicoAP.setLayout(null);
			
			txtNombreMedicoAP = new JTextField();
			txtNombreMedicoAP.setColumns(10);
			txtNombreMedicoAP.setBorder(new LineBorder(new Color(102, 153, 255), 2));
			txtNombreMedicoAP.setBounds(44, 56, 405, 25);
			panelA�adirMedicoAP.add(txtNombreMedicoAP);
			
			btnBuscarMedicoAP = new JButton("Buscar");
			btnBuscarMedicoAP.setForeground(Color.WHITE);
			btnBuscarMedicoAP.setContentAreaFilled(false);
			btnBuscarMedicoAP.setBorderPainted(false);
			btnBuscarMedicoAP.setOpaque(true);
			btnBuscarMedicoAP.setFont(new Font("Verdana", Font.BOLD, 11));
			btnBuscarMedicoAP.setBackground(new Color(0, 102, 204));
			btnBuscarMedicoAP.setBounds(517, 56, 89, 23);
			panelA�adirMedicoAP.add(btnBuscarMedicoAP);
			
			JLabel labelTurno = new JLabel("Turno");
			labelTurno.setForeground(new Color(0, 51, 153));
			labelTurno.setFont(new Font("Tahoma", Font.BOLD, 11));
			labelTurno.setBounds(513, 191, 61, 14);
			panelA�adirMedicoAP.add(labelTurno);
			
			comboBoxTurnoMedicoAP = new JComboBox();
			comboBoxTurnoMedicoAP.setMaximumRowCount(2);
			comboBoxTurnoMedicoAP.setForeground(Color.BLACK);
			comboBoxTurnoMedicoAP.setBackground(Color.LIGHT_GRAY);
			comboBoxTurnoMedicoAP.setBounds(581, 188, 114, 20);
			panelA�adirMedicoAP.add(comboBoxTurnoMedicoAP);
			
			btnAnadirAtencionPrimaria = new JButton("A\u00F1adir");
			btnAnadirAtencionPrimaria.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnAnadirAtencionPrimaria.setBackground(new Color(204, 255, 204));
			btnAnadirAtencionPrimaria.setContentAreaFilled(false);
			btnAnadirAtencionPrimaria.setBorderPainted(false);
			btnAnadirAtencionPrimaria.setOpaque(true);
			btnAnadirAtencionPrimaria.setBounds(606, 354, 89, 23);
			panelA�adirMedicoAP.add(btnAnadirAtencionPrimaria);
			
			this.setMinimumSize(new Dimension(750, 500));
		}

		public JTextField getGetTxtBuscar() {
			return getTxtBuscar;
		}

		public JTextField getTxtgetNombre() {
			return txtgetNombre;
		}

		public JTextField getTxtNombreEspecialista() {
			return txtNombreEspecialista;
		}

		public JTextField getTxtNombreMedicoAP() {
			return txtNombreMedicoAP;
		}

		public JTextField getGetTxtNombreMedico() {
			return getTxtNombreMedico;
		}

		public JTextField getGetTxtApellidosMedico() {
			return getTxtApellidosMedico;
		}

		public JTextField getGetTxtTelefonoMedico() {
			return getTxtTelefonoMedico;
		}

		public JTextField getGetTxtDireccionMedico() {
			return getTxtDireccionMedico;
		}

		public JPanel getPanelBuscarMedico() {
			return panelBuscarMedico;
		}

		public JButton getBtnBuscar() {
			return btnBuscar;
		}

		public JButton getBtnConsultarMedico() {
			return btnConsultarMedico;
		}

		public JButton getBtnBuscarEspecialista() {
			return btnBuscarEspecialista;
		}

		public Checkbox getCheckLMV() {
			return checkLMV;
		}

		public Checkbox getCheckMJ() {
			return checkMJ;
		}

		public JComboBox getComboBoxTurnoEspecialista() {
			return comboBoxTurnoEspecialista;
		}

		public JButton getBtnAnadirEspecialista() {
			return btnAnadirEspecialista;
		}

		public JButton getBtnBuscarMedicoAP() {
			return btnBuscarMedicoAP;
		}

		public JComboBox getComboBoxTurnoMedicoAP() {
			return comboBoxTurnoMedicoAP;
		}

		public JButton getBtnAnadirAtencionPrimaria() {
			return btnAnadirAtencionPrimaria;
		}

		public JComboBox getComboBoxEspecialidad() {
			return comboBoxEspecialidad;
		}

		
		
}