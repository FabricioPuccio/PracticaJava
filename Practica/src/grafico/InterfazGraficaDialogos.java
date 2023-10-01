package grafico;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class InterfazGraficaDialogos{
	
	public static void ejecutarInterfaz() {
		MarcoDialogos dialogos = new MarcoDialogos();
		dialogos.setVisible(true);
		dialogos.setDefaultCloseOperation(MarcoDialogos.EXIT_ON_CLOSE);
	}
}

class MarcoDialogos extends JFrame{
	
public MarcoDialogos() {
		
		setTitle("Dialogos");
		
		Dimension tamanio = Toolkit.getDefaultToolkit().getScreenSize();
		
		int widthPantalla = tamanio.width;
		int heightPantalla = tamanio.height;
		
		int anchoMarco = widthPantalla/2;
		int altoMarco = heightPantalla/2;
		int x = widthPantalla/4;
		int y = heightPantalla/4;
		
		setBounds(x, y, anchoMarco, altoMarco);
		
		add(new LaminaDialogos());
	}
	
}
