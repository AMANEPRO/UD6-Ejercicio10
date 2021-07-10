package UD6;

import java.util.Random;

import javax.swing.JOptionPane;

public class ejercicio10 {

	public static void main(String[] args) {
		
		String largobeta = JOptionPane.showInputDialog("Introduce el largo del vector");
		
		int largo = Integer.parseInt(largobeta);
		
		String rangominimobeta = JOptionPane.showInputDialog("Introduce el rango minimo");
		
		int rangominimo = Integer.parseInt (rangominimobeta);
		
		String rangomaximobeta  = JOptionPane.showInputDialog("Introduce el rango maximo");
		
		int rangomaximo = Integer.parseInt(rangomaximobeta);
		
		int array[] = crearArray(largo, rangominimo, rangomaximo);
		
		leerArray(array);
		
	}
	
		
	public static int[] crearArray(int largo, int rangominimo, int rangomaximo) {
		
		int array[] = new int[largo];
		
		Random numerorandom = new Random();
		
		for (int i = 0; i < array.length; i++) {
			
			int auxiliar = rangominimo + numerorandom.nextInt(rangomaximo);
			
			if (casoprimo(auxiliar)) {
		
				array[i] = auxiliar;
			
			} else {
			
				i--;
			
			}
			
		}
		
		return array;
		
	}
	
		
	public static void leerArray(int array[]) {
		
		int suma = 0;
		
		int mayor = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Numero guardado " + (i+1) + ": " + array[i]);
			
			suma += array[i];
				
			if (array[i] > mayor) {		
			
				mayor = array[i];		
			}
		}
		
		System.out.println("El numero guardado mas grande es " + mayor);
		
		
	}
	
	public static boolean casoprimo(int numero) {
		
		int contador = 2;
		
		boolean primo=true;

		while ((primo) && (contador != numero)){ 
		
			if (numero % contador == 0) {	
		 
				primo = false;
		  }
		 
			contador++;
	
		}
		
		
		return primo;
	
	}

}
