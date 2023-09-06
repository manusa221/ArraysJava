import java.util.ArrayList;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int numEmpleados=0;
		float media=0.0f;
		System.out.println("Introduce el numero de empleados:");//le pregunto al usuario el numero de empleados
		numEmpleados = sc.nextInt(); // Guardamos el tamaño de la array en la variable numEmpleados
		
		
		ArrayList <String> empleados = new ArrayList <String>();//creo un arraylist serian arrays dinamicos que se le pueden cambiar el valor siempre que queramos
		ArrayList <Float> sueldo = new ArrayList <Float>();
		int i=0;
		
		for(i=0;i<numEmpleados;i++) {//creo un bucle for y recorro la informacion que me ha pasado el usuario 
			System.out.println("Introduzca en nombre del empleado " + (i+1) + ":");
			empleados.add(sc.next());//en el arraylist añado la información que nos ha pasado el usuario, nos pedira los nombres
			System.out.println("Introduzca el sueldo del empleado " + (i+1) + ":");
			sueldo.add(sc.nextFloat());//en el arraylist añado la información que nos ha pasado el usuario, no pedira los suedos
			
		}
		
			for(i=0;i<empleados.size();i++) {//creo otro bucle para recorrer el tamaño del array de empleados
				//System.out.println("Nombre" + (1+i) + ":" + empleados.get(i));
			}
		
		for(i=0;i<sueldo.size();i++) {//recorro el tamaño de sueldo
			media= media + sueldo.get(i);//le digo que media es el sueldo de los empleados
			System.out.println("Nombre: " + empleados.get(i) + "-----" + "Sueldo :" + sueldo.get(i));//muestro la informacion, llamando con el get a empleados y sueldo
		
	}
		media= media/ empleados.size();//hago el clculo de la media dividido por nº de empleados
		System.out.println("La media de los empleados es: " + media);//muestra la media de los empleados
		
	}
}
