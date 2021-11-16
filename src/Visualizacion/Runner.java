package Visualizacion;

import javax.swing.JOptionPane;

import Datos.*;

public class Runner {

	public static void main(String[] args) {
		
		Funciones funciones = new Funciones();

		int option;
		boolean exit = true;
		while(exit == true) {
			
		option = Integer.parseInt(JOptionPane.showInputDialog("Enter operation to perform" + "\n"+
															"1. Convert string to proper name "+ "\n" +
															"2. search character string" + "\n" +
															"3. encrypt" + "\n" +
															"4. decrypt" + "\n" +
															"5. fill characters" + "\n" +
															"6. delete character" + "\n" +
															"7. intersection" + "\n" +
															"8. difference" + "\n" +
															"9. delete characters" + "\n" +
															"10. Verifify email" + "\n" +
															"11. exit" 
															));
		switch (option) {
		case 1: {

			JOptionPane.showMessageDialog(null, funciones.Convert());
			break;
		}
		case 2: {

			String Buscarrepeticion = JOptionPane.showInputDialog("ingrese cadena a buscar");
			JOptionPane.showMessageDialog(null,"(" + Buscarrepeticion + ")  " + funciones.buscarRepeticion(Buscarrepeticion) + " veces.");
			break;
		}
		case 3: {

			String encriptar = JOptionPane.showInputDialog("ingrese cadena  a encriptar");
			JOptionPane.showMessageDialog(null, funciones.encriptar(encriptar));
			break;
		}
		case 4: {
			
			String desencriptar = JOptionPane.showInputDialog("ingrese cadena a desencriptar");
			JOptionPane.showMessageDialog(null, funciones.desencriptar(desencriptar));
			break;
		}
		case 5: {

			String caracter = JOptionPane.showInputDialog(null, "ingrese caracter");
			char caracter1 = caracter.charAt(0);
			int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese cantidad a agregar"));
			int operacion = Integer.parseInt(JOptionPane.showInputDialog("donde desea adicionar el caracter " + "\n"+
																		"1. izquierda"+ "\n" +
																		"2. derecha"));
			JOptionPane.showMessageDialog(null, funciones.llenarCaracteres(caracter1,cantidad,operacion));
			break;
		}
		case 6: {

			String caracter3 = JOptionPane.showInputDialog(null, "ingrese caracter");
			JOptionPane.showMessageDialog(null, funciones.borrarCaracteresCadena(caracter3));
			break;
		}
		case 7: {

			//duda faltante
			//Interseccion(message);
			break;
		}
		case 8: {

			String caract = JOptionPane.showInputDialog(null, "ingrese cadena de caracteres");
			JOptionPane.showMessageDialog(null, funciones.diferencia(caract));
			break;
		}
		case 9: {

			String caracter = JOptionPane.showInputDialog(null, "ingrese cadena de caracteres");
			JOptionPane.showMessageDialog(null, funciones.borrarCaracteresCadena(caracter));
			
			
			break;
		}
		case 10:{
			
			
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

