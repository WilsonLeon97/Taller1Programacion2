package Datos;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

/**
 * Date: Nov 16-2021
 * This is a simple application for...
 * @author WilsonLeon97
 * @version 1.0
 *
 */

public class Funciones {
	
	final String message = "Sogamoso ciudad del sol y del acero";
	
	/**
	 * This method Convert the content of the string to its own name
	 * @return
	 */
	public String Convert() {
		String menssaje = message;
	      StringBuffer strbf = new StringBuffer();
	      Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(menssaje);
	      while(match.find()) 
	      {
	         match.appendReplacement(strbf, match.group(1).toUpperCase() + match.group(2).toLowerCase());
	      }
	      return match.appendTail(strbf).toString();

	}
	
	/**
	 * method that looks for Character string
	 * @param buscarrepeticion
	 * @return
	 */
	public int buscarRepeticion(String buscarrepeticion) {
		int contador=0;
		String[] palabras = message.split(" ");
		for (int s = 0; s < palabras.length; s++) {
			if (palabras[s].equalsIgnoreCase(buscarrepeticion)) {
				 contador += 1;
			}

		}
		return contador;
	}
	
	/**
	 * Method that encrypts the string
	 * @param encriptar
	 * @return
	 */
	public String encriptar(String encriptar) {

		char array[] = encriptar.toCharArray();

		for (int i = 0; i < array.length; i++) {
			array[i] = (char) (array[i] + (char)5);
		}
		String encriptado = String.valueOf(array);
		String mensaje = "Mensaje encriptado: " + encriptado;
		return mensaje;

	}


	/**
	 * Method that decrypts the string
	 * @param mms
	 * @return
	 */
	public String desencriptar(String mms) {
		char arrayD[] = mms.toCharArray();

		for (int i = 0; i < arrayD.length; i++) {
			arrayD[i] = (char) (arrayD[i] - (char)5);
		}
		String desencriptado = String.valueOf(arrayD);
		String mensaje = "Mensaje desencriptado: " + desencriptado;
		return mensaje; 
	}
	
	/**
	 * Method that adds characters to the left or right
	 * @param caracter1
	 * @param cantidad
	 * @param operacion
	 * @return
	 */
	public String llenarCaracteres(char caracter1, int cantidad, int operacion) {
		String cadena =message;
		if (operacion==1) {
			for (int i = 0; i < cantidad; i++) {
				cadena = caracter1 + cadena;
			}

		}else if (operacion==2) {
			for (int i = 0; i < cantidad; i++) {
				cadena = cadena + caracter1;

			}
		}

		return cadena;
	}
	
	/**
	 * Method that deletes characters entered by keyboard
	 * @param caracter1
	 * @return
	 */
	public String borrarCaracteres(char caracter1) {

		String mensajen = message;
		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i)==caracter1) {
				mensajen = message.replace(caracter1, ' ');
			}
		}
		return mensajen;
	}


	

	/**
	 * @param message
	 */
	private static void Interseccion(String message) {
		String palabra = "colombia";
		String palabraNueva = "" ;
		for (int i = 0; i < message.length(); i++) {
			for (int j = 0; j < palabra.length(); j++) { 
				char mensaje1 = message.charAt(i);
				char palabra1 = palabra.charAt(j); 
				if (mensaje1==palabra1) {
					palabraNueva += palabra.charAt(j);
				}
			}
		}
		System.out.println(palabraNueva);

	}
	
	/**
	 * @param cadena 
	 * @return
	 */
	public String diferencia(String cadena) {
		String mensaje = message;
		for(int i = 0 ; i<cadena.length() ;i++) {
			for(int j = 0 ; j<message.length() ; j++) {
			if(cadena.charAt(i) == message.charAt(j)) {
				mensaje = mensaje.replace(message.charAt(j), ' ');
		}
		}
		}
		return mensaje;
	}
	
	/**
	 * 
	 * @param cadena
	 * @return
	 */
	public String borrarCaracteresCadena(String cadena) {

		String mensaje = message;
		int i = 0;
		for(int j = 0 ; j==i ; j++) {
			if(cadena.charAt(j) == message.charAt(i)) {
				mensaje = mensaje.replace(message.charAt(i), ' ');
				i++;
				continue;
			}else if (cadena.charAt(j) != mensaje.charAt(i)){
				break;
			}
		}
		
		return mensaje;
	}
	}
