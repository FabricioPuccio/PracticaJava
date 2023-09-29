package accesoficheros;

import java.io.File;

public class AccesoDirectoriosFicheros {

	public void acceso() {
		File ruta = getRuta();
		System.out.println(ruta.getAbsolutePath());

		String[] listaArchivos = ruta.list();

		for (int i = 0; i < listaArchivos.length; i++) {

			System.out.println(listaArchivos[i]);

			File subCarpeta = new File(ruta.getAbsoluteFile(), listaArchivos[i]);

			if (subCarpeta.isDirectory()) {
				String[] archivosSubcarpeta = subCarpeta.list();

				for (String aux : archivosSubcarpeta) {
					System.out.println(aux);
				}
				System.out.println();
			}
		}
	}

	public void pruebasRutas() {
		File archivoNoExiste = new File("ejemplo");

		System.out.println(archivoNoExiste.getAbsolutePath());

		System.out.println(archivoNoExiste.exists());
//---------------------------------------------------------------------------------
		File archivoExiste = new File("bin");

		System.out.println(archivoExiste.getAbsolutePath());

		System.out.println(archivoExiste.exists());
	}

	private File getRuta() {
		/*
		 * Java, para asegurarse la compatibilidad en diferentes sistemas operativos nos
		 * permite utilizar una variable estática de la clase File
		 */
		return new File("D:" + File.separator + "programacion" + File.separator + "personal-workspace" + File.separator
				+ "serializacion-java");
	}

}
