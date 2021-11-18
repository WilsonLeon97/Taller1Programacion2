package Datos;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

/**
 * Date: Nov 18-2021
 * This is a simple application for...
 * @author WilsonLeon97
 * @version 1.0
 *
 */

public class Funciones {
	
	//String message= "gshjdgsjhdgbdshfj";
	
	/**
	 * This method Convert the content of the string to its own name
	 * @return
	 */
	public String Convert(String entrada) {
		//String menssaje = message;
	      StringBuffer strbf = new StringBuffer();
	      Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(entrada);
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
	public int buscarRepeticion(String buscarrepeticion, String buscarrepeticion1) {
		int contador=0;
		String[] palabras = buscarrepeticion.split(" ");
		for (int s = 0; s < palabras.length; s++) {
			if (palabras[s].equalsIgnoreCase(buscarrepeticion1)) {
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
	public String contarVocales(String cadena) {

		char array[] = cadena.toCharArray();

		 int count = 0;
		  
	        for (int i = 0; i < cadena.length(); i++){
	            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e'
	                || cadena.charAt(i) == 'i'
	                || cadena.charAt(i) == 'o'
	                || cadena.charAt(i) == 'u')
	            {
	                count++;
	            }
	        }
	 
	        String mensaje = "Total de vocales en String: " + count;
	        return mensaje;

	}

	
	/**
	 * Method that adds characters to the left or right
	 * @param caracter1
	 * @param cantidad
	 * @param operacion
	 * @return
	 */
	public String llenarCaracteres(String frase, char caracter1, int cantidad, int operacion) {
		//String cadena =message;
		if (operacion==1) {
			for (int i = 0; i < cantidad; i++) {
				frase = caracter1 + frase;
			}

		}else if (operacion==2) {
			for (int i = 0; i < cantidad; i++) {
				frase = frase + caracter1;

			}
		}

		return frase;
	}
	
	/**
	 * Method that deletes characters entered by keyboard
	 * @param caracter1
	 * @return
	 */
	public String borrarCaracteres(String cadena, char caracter1) {

		String mensajen = cadena;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)==caracter1) {
				mensajen = cadena.replace(caracter1, ' ');
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
	 * 
	 * @param cadena
	 * @return
	 */
	
	//corregir
	public String borrarCaracteresCadena(String cadena, String cadenaBorrar) {

		String mensaje = cadena;
		int i = 0;
		for(int j = 0 ; j==i ; j++) {
			if(cadena.charAt(j) == cadena.charAt(i)) {
				mensaje = mensaje.replace(cadena.charAt(i), ' ');
				i++;
				continue;
			}else if (cadena.charAt(j) != mensaje.charAt(i)){
				break;
			}
		}
		
		return mensaje;
	}
	}
