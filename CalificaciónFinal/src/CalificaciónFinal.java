import java.util.Scanner;		//IMPORTAR SCANNER PARA teclado
public class Calificaci�nFinal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO teclado DE TIPO SCANNER
		
		System.out.print("Introduzca la nota de teor�a: ");			//SOLICITA NOTA TEOR�A
		double Teor�a = teclado.nextDouble();			//ALMACENA NOTA TEOR�A EN VARIABLE Teor�a
		System.out.print ("Introduzca la nota de pr�cticas: ");		//SOLICITA NOTA PR�CTICA
		double Pr�cticas = teclado.nextDouble();		//ALMACENA NOTA PR�CTICA EN VARIABLE Pr�cticas
		
		/*Las condiciones de evaluaci�n que se proponen en el ejercicio son:
		 * 	Sobresaliente, si t y p son mayores o iguales que 9
		 * 	Notable, si t y p son mayores o iguales que 7.5 y, al menos una de las dos notas es menor que 9
		 * 	Suficiente, si t y p son mayores o iguales que 5 y, al menos una de las dos notas es menor que 7.5
		 * 	Insuficiente, al menos una de las dos notas no alcanza el 5
		 * 
		 * Estas condiciones no cubren todos los valores posibles.
		 * Si al programa se le presentan los valores 5 y 7.5, no hay ninguna condici�n v�lida.
		 */
		
				//CONDICI�N: SI TEOR�A Y PR�CTICAS SON MAYORES QUE 9
		if (Teor�a>=9 && Pr�cticas>=9)
			System.out.print("La nota es sobreasaliente!");
		
				//CONDICI�N: SI TEOR�A Y PR�CTICAS SON MAYORES QUE 7.5 Y AL MENOS UNA MENOR A 9
		if (Teor�a>=7.5 && Pr�cticas>=7.5 && (Teor�a<9 || Pr�cticas<9))		
			System.out.print("La nota es notable!");
		
				//CONDICI�N: SI TEOR�A Y PR�CTICAS SON MAYORES O IGUALES A 5 Y AL MENOS UNA MENOR A 7.5
		if (Teor�a>=5 && Pr�cticas>=5 && (Teor�a<7.5 || Pr�cticas<7.5))		
			System.out.print("La nota es suficiente!");
		
				//CONDICI�N: SI UNA DE LAS DOS ES MENOR A 5
		if (Teor�a<5 || Pr�cticas<5)		
			System.out.print("La nota es insuficiente");
	}

}
