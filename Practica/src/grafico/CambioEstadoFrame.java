package grafico;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
/**
 * 
 * @author fabri
 * Imprime un mensaje en consola cuando el Frame es maximizado a pantalla completa
 */
public class CambioEstadoFrame implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent e) {
		
		if(e.getNewState()== Frame.MAXIMIZED_BOTH) {
			System.out.println("La ventana ha sido maximizada a pantalla completa");
		}
		
	}
	
	

}
