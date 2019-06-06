package vista;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import net.miginfocom.swing.MigLayout;
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

public class VentanaMedico extends JFrame {
	protected JPanel contentPane;
	protected JTextField getTxtBuscar;
	private JTextField txtgetNombre;
	private JTextField txtNombreEspecialista;
	private JTextField txtNombreMedicoAP;

		public VentanaMedico() {
			setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaPrincipal.class.getResource("/images/iconsalud.png")));
			getContentPane().setBackground(new Color(255, 255, 255));
			getContentPane().setLayout(null);
			
			ImageIcon iconagregar = new ImageIcon(this.getClass().getResource("/images/agregar.png"));
			ImageIcon iconbuscar = new ImageIcon(this.getClass().getResource("/images/buscar.png"));

			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBackground(Color.WHITE);
			tabbedPane.setBounds(0, 0, 734, 461);
			getContentPane().add(tabbedPane);
			
			JPanel panelBuscarMedico = new JPanel();
			panelBuscarMedico.setBackground(Color.WHITE);
			tabbedPane.addTab("Buscar Medico", iconbuscar, panelBuscarMedico, null);
			panelBuscarMedico.setLayout(null);
			
			txtgetNombre = new JTextField();
			txtgetNombre.setBounds(56, 47, 405, 25);
			panelBuscarMedico.add(txtgetNombre);
			txtgetNombre.setColumns(10);
			txtgetNombre.setBorder(new LineBorder(new Color(102, 153, 255), 2));
			
			JButton btnBuscar = new JButton("Buscar");
			btnBuscar.setBackground(new Color(0, 102, 204));
			btnBuscar.setFont(new Font("Verdana", Font.BOLD, 11));
			btnBuscar.setForeground(Color.WHITE);
			btnBuscar.setContentAreaFilled(false);
			btnBuscar.setBorderPainted(false);
			btnBuscar.setOpaque(true);
			btnBuscar.setBounds(520, 47, 89, 23);
			panelBuscarMedico.add(btnBuscar);
			
			JList listMedicos = new JList();
			listMedicos.setBackground(Color.LIGHT_GRAY);
			listMedicos.setBounds(56, 103, 405, 160);
			panelBuscarMedico.add(listMedicos);
			
			JPanel panelAnadirMedico = new JPanel();
			panelAnadirMedico.setBackground(Color.WHITE);
			tabbedPane.addTab("A�adir m�dico", iconagregar, panelAnadirMedico, null);
			panelAnadirMedico.setLayout(null);
			
			
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
			
			JButton btnBuscarEspecialista = new JButton("Buscar");
			btnBuscarEspecialista.setContentAreaFilled(false);
			btnBuscarEspecialista.setBorderPainted(false);
			btnBuscarEspecialista.setOpaque(true);
			btnBuscarEspecialista.setForeground(Color.WHITE);
			btnBuscarEspecialista.setFont(new Font("Verdana", Font.BOLD, 11));
			btnBuscarEspecialista.setBackground(new Color(0, 102, 204));
			btnBuscarEspecialista.setBounds(517, 56, 89, 23);
			panelA�adirMedicoEspecialista.add(btnBuscarEspecialista);
			
			JList listMedicoEspecialista = new JList();
			listMedicoEspecialista.setBackground(Color.LIGHT_GRAY);
			listMedicoEspecialista.setBounds(44, 108, 405, 160);
			panelA�adirMedicoEspecialista.add(listMedicoEspecialista);
			
			Checkbox checkLMV = new Checkbox("Lunes Mi\u00E9rcoles Viernes");
			checkLMV.setFont(new Font("Georgia", Font.BOLD, 12));
			checkLMV.setForeground(new Color(0, 51, 102));
			checkLMV.setBackground(new Color(204, 255, 255));
			checkLMV.setBounds(502, 124, 160, 22);
			panelA�adirMedicoEspecialista.add(checkLMV);
			
			Checkbox checkMJ = new Checkbox("Martes Jueves");
			checkMJ.setForeground(new Color(0, 51, 102));
			checkMJ.setFont(new Font("Georgia", Font.BOLD, 12));
			checkMJ.setBackground(new Color(204, 255, 255));
			checkMJ.setBounds(502, 152, 139, 22);
			panelA�adirMedicoEspecialista.add(checkMJ);
			
			JButton btnAnadir = new JButton("A\u00F1adir");
			btnAnadir.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnAnadir.setBackground(new Color(204, 255, 204));
			btnAnadir.setContentAreaFilled(false);
			btnAnadir.setBorderPainted(false);
			btnAnadir.setOpaque(true);
			btnAnadir.setBounds(600, 361, 89, 23);
			panelA�adirMedicoEspecialista.add(btnAnadir);
			
			JComboBox comboBoxTurnoEspecialista = new JComboBox();
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
			txtNombreMedicoAP.setBounds(59, 60, 405, 25);
			panelA�adirMedicoAP.add(txtNombreMedicoAP);
			
			JButton btnBuscarMedicoAP = new JButton("Buscar");
			btnBuscarMedicoAP.setForeground(Color.WHITE);
			btnBuscarMedicoAP.setContentAreaFilled(false);
			btnBuscarMedicoAP.setBorderPainted(false);
			btnBuscarMedicoAP.setOpaque(true);
			btnBuscarMedicoAP.setFont(new Font("Verdana", Font.BOLD, 11));
			btnBuscarMedicoAP.setBackground(new Color(0, 102, 204));
			btnBuscarMedicoAP.setBounds(547, 61, 89, 23);
			panelA�adirMedicoAP.add(btnBuscarMedicoAP);
			
			JLabel labelTurno = new JLabel("Turno");
			labelTurno.setForeground(new Color(0, 51, 153));
			labelTurno.setFont(new Font("Tahoma", Font.BOLD, 11));
			labelTurno.setBounds(513, 191, 61, 14);
			panelA�adirMedicoAP.add(labelTurno);
			
			JList listMedicoAP = new JList();
			listMedicoAP.setBackground(Color.LIGHT_GRAY);
			listMedicoAP.setBounds(59, 112, 405, 160);
			panelA�adirMedicoAP.add(listMedicoAP);
			
			JComboBox comboBoxTurnoMedicoAP = new JComboBox();
			comboBoxTurnoMedicoAP.setMaximumRowCount(2);
			comboBoxTurnoMedicoAP.setForeground(Color.BLACK);
			comboBoxTurnoMedicoAP.setBackground(Color.LIGHT_GRAY);
			comboBoxTurnoMedicoAP.setBounds(581, 188, 114, 20);
			panelA�adirMedicoAP.add(comboBoxTurnoMedicoAP);
			
			this.setMinimumSize(new Dimension(750, 500));
			
			
		}
}
