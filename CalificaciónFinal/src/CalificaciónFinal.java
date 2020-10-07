import java.util.Scanner;		//IMPORTAR SCANNER PARA teclado
public class CalificaciónFinal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO teclado DE TIPO SCANNER
		
		System.out.print("Introduzca la nota de teoría: ");			//SOLICITA NOTA TEORÍA
		double Teoría = teclado.nextDouble();			//ALMACENA NOTA TEORÍA EN VARIABLE Teoría
		System.out.print ("Introduzca la nota de prácticas: ");		//SOLICITA NOTA PRÁCTICA
		double Prácticas = teclado.nextDouble();		//ALMACENA NOTA PRÁCTICA EN VARIABLE Prácticas
		
		/*Las condiciones de evaluación que se proponen en el ejercicio son:
		 * 	Sobresaliente, si t y p son mayores o iguales que 9
		 * 	Notable, si t y p son mayores o iguales que 7.5 y, al menos una de las dos notas es menor que 9
		 * 	Suficiente, si t y p son mayores o iguales que 5 y, al menos una de las dos notas es menor que 7.5
		 * 	Insuficiente, al menos una de las dos notas no alcanza el 5
		 * 
		 * Estas condiciones no cubren todos los valores posibles.
		 * Si al programa se le presentan los valores 5 y 7.5, no hay ninguna condición válida.
		 */
		
				//CONDICIÓN: SI TEORÍA Y PRÁCTICAS SON MAYORES QUE 9
		if (Teoría>=9 && Prácticas>=9)
			System.out.print("La nota es sobreasaliente!");
		
				//CONDICIÓN: SI TEORÍA Y PRÁCTICAS SON MAYORES QUE 7.5 Y AL MENOS UNA MENOR A 9
		if (Teoría>=7.5 && Prácticas>=7.5 && (Teoría<9 || Prácticas<9))		
			System.out.print("La nota es notable!");
		
				//CONDICIÓN: SI TEORÍA Y PRÁCTICAS SON MAYORES O IGUALES A 5 Y AL MENOS UNA MENOR A 7.5
		if (Teoría>=5 && Prácticas>=5 && (Teoría<7.5 || Prácticas<7.5))		
			System.out.print("La nota es suficiente!");
		
				//CONDICIÓN: SI UNA DE LAS DOS ES MENOR A 5
		if (Teoría<5 || Prácticas<5)		
			System.out.print("La nota es insuficiente");
	}

}
