package control.paraUis.paciente;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import control.Controller;
import control.paraUis.ExceptionDatos;
import control.paraUis.ParaUiVentanaError;
import control.paraUis.TestParaUI;
import control.paraUis.Validator;
import vista.paciente.VentanaPaciente;

public class paraUiVentanaPaciente extends VentanaPaciente {
	private JScrollPane scrollListaPaciente;
	Controller control= new Controller();
	private JList<String> pacientes;

	public paraUiVentanaPaciente() {
		super();
		agregarListener();
		pacientes = new JList<String>(control.obtenerElementosAMostrarPaciente());
		pacientes.getSelectionMode();
		pacientes.setVisible(true);
		scrollListaPaciente = new JScrollPane(pacientes);
		scrollListaPaciente.setBounds(79, 108, 345, 213);
		scrollListaPaciente.setBorder(new LineBorder(new Color(0, 102, 204), 2));
		getPanelBuscarPaciente().add(scrollListaPaciente);

	}

	private String obtenerIdSeleccionado() {
		List<String> lista = pacientes.getSelectedValuesList();
		String retorno = lista.get(0);
		return retorno;

	}

	private String[] filtrar(String filtro, String[] vectorPacientes) {
		String retorno[];
		int j = 0;
		for (int i = 0; i < vectorPacientes.length; i++) {
			if (vectorPacientes[i].contains(filtro)) {
				j++;
			}
		}

		retorno = new String[j];
		j = 0;
		for (int i = 0; i < vectorPacientes.length; i++) {
			if (vectorPacientes[i].contains(filtro)) {
				retorno[j] = vectorPacientes[i];
				j++;
			}
		}
		return retorno;
	}

	private void agregarListener() {
		// TODO Auto-generated method stub
		getBtnConsultarPaciente().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				paraUiVentanaDatosPaciente paraUiVentanaDatosPaciente = new paraUiVentanaDatosPaciente(
						obtenerIdSeleccionado());
				paraUiVentanaDatosPaciente.setVisible(true);

			}
		});
		getBtnBuscar().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				getPanelBuscarPaciente().setVisible(false);
				String filtro = getGetTxtBuscar().getText();
				getPanelBuscarPaciente().remove(scrollListaPaciente);
				pacientes = new JList<String>(filtrar(filtro, control.obtenerElementosAMostrarPaciente()));
				scrollListaPaciente = new JScrollPane(pacientes);
				scrollListaPaciente.setBounds(79, 108, 345, 213);
				scrollListaPaciente.setBorder(new LineBorder(new Color(0, 102, 204), 2));
				getPanelBuscarPaciente().add(scrollListaPaciente);
				getPanelBuscarPaciente().setVisible(true);
			}
		});
		this.getBtnAnadir().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Validator validator = new Validator();
				String nombre = getTxtNombre.getText();
				String apellidos = getTxtApellidos.getText();
				String telefono = getTxtTelefono.getText();
				String direccion = getTxtDireccion.getText();
				String idUnico = "123123123";
				String fechaDeNacimiento = getTxtFechaNacimiento.getText();
				String total = nombre + "-" + apellidos + "-" + telefono + "-" + direccion + "-" + fechaDeNacimiento;
				
				try {
					if ((validator.validarDatosPaciente(total)).isResultado()) {
						control.darAltaPacienteNuevo(nombre, apellidos, telefono, direccion, idUnico, fechaDeNacimiento);
						getTxtNombre.setText("");
						getTxtApellidos.setText("");
						getTxtFechaNacimiento.setText("");
						getTxtTelefono.setText("");
						getTxtDireccion.setText("");
					}
				} catch (ExceptionDatos e) {
					ParaUiVentanaError paraUiVentanaError = new ParaUiVentanaError(e.getMsg());
					paraUiVentanaError.setVisible(true);
				}

			}
		});

	}
}