package ex02;

import java.util.ArrayList;
import java.util.List;

/*Programa un mètode que retorna una cadena separada per comes, basada en una llista d’Integers.
 *  Cada element ha d’anar precedit per lletra “e” si el nombre és parell, o per la lletra “o” 
 *  si el nombre és imparell. 
 *  Per exemple, si la llista d’entrada és (3, 55, 44), la sortida ha de ser “o3, o55, e44”. 
 *  Imprimeix el resultat.
 * 
 */

public class CadenesEx02 {

	public static void main(String[] args) {
		
		List<Integer> llistaNums= List.of(1,34,27,89,3,55,44);
		
		llistaNums.stream().map(CadenesEx02::evenOdd).forEach((n)->System.out.println(n));
	
		
	}
	
	public static String evenOdd(int numero) {
	String sortida;
		if(numero%2==0) sortida="e";
		else sortida="o";
		return sortida+=Integer.toString(numero);
		
		
		
	}
}
