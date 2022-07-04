package ex03;
/*Crea una Functional Interface que contingui un mètode anomenat operacio(). 
 * Aquest mètode ha de retornar un float. Injecta a la interfície creada mitjançant una lambda, 
 * el cos del mètode, de manera que es pugui transformar l’operació amb una suma,
 *  una resta, una multiplicació i una divisió.
 */
public class Operacions {

	public static void main(String[] args) {
		float op1=2;
		float op2=3;
		
		Operacio suma= (a,b)->a+b;
		System.out.println(op1+"+"+op2+"="+suma.operacio(op1, op2));
		Operacio resta= (a,b)->a-b;
		System.out.println(op1+"-"+op2+"="+resta.operacio(op1, op2));
		Operacio div= (a,b)->a/b;
		System.out.println(op1+"/"+op2+"="+div.operacio(op1, op2));
		Operacio mult= (a,b)->a*b;
		System.out.println(op1+"*"+op2+"="+mult.operacio(op1, op2));
		
	}
	
}
