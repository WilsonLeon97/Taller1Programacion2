package Visualizacion;

import javax.swing.JOptionPane;

import Datos.*;

public class Runner {

	public static void main(String[] args) {
		
		Funciones funciones = new Funciones();

		int option;
		boolean exit = true;
		while(exit == true) {
			
		option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion de la operación a realizar: " + "\n"+
															"1. Convertir en nombre Propio el\r\n" + 
															"contenido de una cadena "+ "\n" +
															"2. Buscar cadena de caracteres" + "\n" +
															"3. Contar Vocales" + "\n" +
															"4. Año nuevo" + "\n" +
															"5. Llenar caracteres " + "\n" +
															"6. Borrar caracteres" + "\n" +
															"7. Intersección " + "\n" +
															"8. Eliminar repetidos" + "\n" +
															"9. Contar Palabras" + "\n" +
															"10. Validar dirección de correo\r\n" + 
															"electrónico" + "\n" +
															"11. Salir" 
															));
		switch (option) {
		case 1: {
			String cadenaConvertir = JOptionPane.showInputDialog("Ingrese cadena a convertir");
			JOptionPane.showMessageDialog(null, funciones.Convert(cadenaConvertir));
			break;
		}
		case 2: {

			String Buscarrepeticion = JOptionPane.showInputDialog("Ingrese cadena de texto");
			String Buscarrepeticion1 = JOptionPane.showInputDialog("Ingrese cadena a buscar");
			JOptionPane.showMessageDialog(null, funciones.buscarRepeticion(Buscarrepeticion,Buscarrepeticion1) + " veces.");
			break;
		}
		case 3: {

			String contarVocales = JOptionPane.showInputDialog("Ingrese cadena a contar vocales");
			JOptionPane.showMessageDialog(null, funciones.contarVocales(contarVocales));
			break;
		}
		case 4: {
			
			String hora = JOptionPane.showInputDialog("Ingrese la hora (00:00)");
			JOptionPane.showMessageDialog(null, "Faltan  "+funciones.anionuevo(hora) + "  minutos para año nuevo");
			
			break;
		}
		case 5: {
			String frase = JOptionPane.showInputDialog(null, "Ingrese cadena");
			String caracter = JOptionPane.showInputDialog(null, "Ingrese caracter");
			char caracter1 = caracter.charAt(0);
			int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad a agregar"));
			int operacion = Integer.parseInt(JOptionPane.showInputDialog("Donde desea adicionar el caracter? " + "\n"+
																		"1. izquierda"+ "\n" +
																		"2. derecha"));
			JOptionPane.showMessageDialog(null, funciones.llenarCaracteres(frase, caracter1,cantidad,operacion));
			break;
		}
		case 6: {
			String cadena = JOptionPane.showInputDialog(null, "Ingrese cadena");
			String caracter4 = JOptionPane.showInputDialog(null, "Ingrese caracter");
			JOptionPane.showMessageDialog(null, funciones.remover(cadena, caracter4));
		}
		case 7: {

			//duda faltante
			//Interseccion(message);
			break;
		}
		case 8: {
			String cadena1 = JOptionPane.showInputDialog(null, "Ingrese cadena");
			JOptionPane.showMessageDialog(null, funciones.eliminar(cadena1));
			break;
		}
		case 9: {
			String cadena = JOptionPane.showInputDialog(null, "Ingrese cadena");
			JOptionPane.showMessageDialog(null, funciones.contarPalabras(cadena));
			break;
		}
		case 10:{
			
			String correo = JOptionPane.showInputDialog(null, "Ingrese correo electronico");
			if(funciones.compruebaCorreo(correo)==true) {
				JOptionPane.showMessageDialog(null, "El correo electronico ingresado es válido ");
			}else {
				JOptionPane.showMessageDialog(null, "El correo electronico ingresado NO es válido ");
			}
			break;
		}

		case 11: {
			int opc = JOptionPane.showConfirmDialog(null, "confirma salir del programa", "salida", JOptionPane.YES_NO_OPTION);
			if (JOptionPane.YES_OPTION == opc) {
				JOptionPane.showMessageDialog(null, "Fin del Programa");
				exit= false;
			}
			break;
	}
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}

		}
	}

	}

