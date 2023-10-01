package grafico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LaminaDialogos extends JPanel {

	private JPanel panelCenter, panelBottom;
	private CajaBotonesDeRadio cajaUno, cajaDos, cajaTres, cajaCuatro, cajaCinco, cajaSeis;
	private JButton mostrar;
	private String cadena = "Mensaje";
	private Icon iconoMensaje = new ImageIcon("imagenes" + File.separator + "h_azul.png");
	private Object fecha = new Date();
	private Component componente = new PanelMensaje();

	public LaminaDialogos() {

		setLayout(new BorderLayout());

		panelCenter = new JPanel();
		panelCenter.setLayout(new GridLayout(2, 3));

		cajaUno = new CajaBotonesDeRadio("Tipo", new String[] { "Mensaje", "Confimar", "Opción", "Entrada" });
		cajaDos = new CajaBotonesDeRadio("Tipo de Mensaje", new String[] { "ERROR_MESSAGE", "INFORMATION_MESSAGE",
				"WARNING_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE" });
		cajaTres = new CajaBotonesDeRadio("Mensaje",
				new String[] { "Cadena", "Icono", "Componente", "Otros", "Object[]" });
		cajaCuatro = new CajaBotonesDeRadio("Confirmar",
				new String[] { "DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION" });
		cajaCinco = new CajaBotonesDeRadio("Opción", new String[] { "String[]", "Icon[]", "Object" });

		cajaSeis = new CajaBotonesDeRadio("Entrada", new String[] { "Campo de texto", "Combo" });

		panelCenter.add(cajaUno);
		panelCenter.add(cajaDos);
		panelCenter.add(cajaTres);
		panelCenter.add(cajaCuatro);
		panelCenter.add(cajaCinco);
		panelCenter.add(cajaSeis);

		add(panelCenter, BorderLayout.CENTER);

		panelBottom = new JPanel();

		mostrar = new JButton("Mostrar");

		mostrar.addActionListener(new AccionMostrar());

		panelBottom.add(mostrar);

		add(panelBottom, BorderLayout.SOUTH);

	}

	private class CajaBotonesDeRadio extends JPanel {

		private ButtonGroup grupo;

		public CajaBotonesDeRadio(String titulo, String[] opciones) {

			setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

			grupo = new ButtonGroup();

			for (int i = 0; i < opciones.length; i++) {

				JRadioButton boton = new JRadioButton(opciones[i]);
				boton.setSelected(i == 0);
				boton.setActionCommand(opciones[i]);
				add(boton);
				grupo.add(boton);

			}
		}

		public String seleccionado() {

			/*
			 * ButtonModel selec = grupo.getSelection(); String s =
			 * selec.getActionCommand(); return s;
			 */

			return grupo.getSelection().getActionCommand();
		}

	}

	public Object mensaje() {
		if (cajaTres.seleccionado().equals("Cadena")) {
			return cadena;
		} else if (cajaTres.seleccionado().equals("Icono")) {
			return iconoMensaje;
		} else if (cajaTres.seleccionado().equals("Componente")) {
			return componente;
		} else if (cajaTres.seleccionado().equals("Otros")) {
			return fecha;
		} else {
			return new Object[] { cadena, iconoMensaje, componente, fecha };
		}
	}

	public int mensajeTipo() {
		if (cajaDos.seleccionado().equals("ERROR_MESSAGE")) {
			return JOptionPane.ERROR_MESSAGE; // (=0)
		} else if (cajaDos.seleccionado().equals("INFORMATION_MESSAGE")) {
			return JOptionPane.INFORMATION_MESSAGE; // (=1)
		} else if (cajaDos.seleccionado().equals("WARNING_MESSAGE")) {
			return JOptionPane.WARNING_MESSAGE; // (=2)
		} else if (cajaDos.seleccionado().equals("QUESTION_MESSAGE")) {
			return JOptionPane.QUESTION_MESSAGE; // (=3)
		} else {
			return -1; // (JOptionPane.PLAIN-MESSAGE)
		}
	}

	public int confirmacion() {
		if (cajaCuatro.seleccionado().equals("DEFAULT_OPTION")) {
			return JOptionPane.DEFAULT_OPTION; // (= -1)
		} else if (cajaCuatro.seleccionado().equals("YES_NO_OPTION")) {
			return JOptionPane.YES_NO_OPTION; // (= 0)
		} else if (cajaCuatro.seleccionado().equals("YES_NO_CANCEL_OPTION")) {
			return JOptionPane.YES_NO_CANCEL_OPTION; // (= 1)
		} else {
			return JOptionPane.OK_CANCEL_OPTION; // (= 2)
		}
	}

	public Object[] opciones() {
		if (cajaCinco.seleccionado().equals("String[]")) {
			return new String[] { "Amarillo", "Azul", "Rojo" };
		} else if (cajaCinco.seleccionado().equals("Icon[]")) {
			return new Icon[] { new ImageIcon("imagenes" + File.separator + "h_azul.png"),
					new ImageIcon("imagenes" + File.separator + "h_azul.png"),
					new ImageIcon("imagenes" + File.separator + "h_azul.png"), };
		} else {
			return new Object[] { cadena, iconoMensaje, componente, fecha };
		}
	}

	private class AccionMostrar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (cajaUno.seleccionado().equals("Mensaje")) {
				JOptionPane.showMessageDialog(LaminaDialogos.this, mensaje(), "Título", mensajeTipo());
			} else if (cajaUno.seleccionado().equals("Confirmar")) {

				JOptionPane.showConfirmDialog(LaminaDialogos.this, mensaje(), "Título", confirmacion(), mensajeTipo());
			} else if (cajaUno.seleccionado().equals("Opción")) {

				JOptionPane.showOptionDialog(LaminaDialogos.this, mensaje(), "Título", 0, mensajeTipo(), null,
						opciones(), null);
			} else if (cajaUno.seleccionado().equals("Entrada")) {
				if (cajaSeis.seleccionado().equals("Entrada")) {
					JOptionPane.showInputDialog(LaminaDialogos.this, mensaje(), "Título", mensajeTipo());
				} else {
					JOptionPane.showInputDialog(LaminaDialogos.this, mensaje(), "Título", 0, null,
							new String[] { "Azul", "Amarillo", "Rojo" }, "Azul");
				}
			}

		}

	}
}

class PanelMensaje extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
		g2D.setPaint(Color.YELLOW);
		g2D.fill(rectangulo);
	}
}
