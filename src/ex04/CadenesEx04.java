package ex04;

import java.util.ArrayList;

public class CadenesEx04 {

	public static void main(String[] args) {
		ArrayList<String> cadenes=new ArrayList<String>();
		
		cadenes.add("aaa");		
		cadenes.add("bbbdhh");
		cadenes.add("bbbdhh");
		cadenes.add("Ccccecc");
		cadenes.add("ccceacc");
		cadenes.add("jdhe");
		cadenes.add("1248");
		cadenes.add("25879");
		
		
		
		System.out.println("Ordena per ordre alfabètic");
		cadenes.stream().sorted((a,b)->a.compareToIgnoreCase(b)).forEach(a->System.out.println(a));
		
		System.out.println("Llista primer els strings que contenen la (e)");
		cadenes.stream().sorted((a,b)->{
										if(a.contains("e")) return -1;
										else return a.compareToIgnoreCase(b);
										}).forEach(a->System.out.println(a));
		
		
		System.out.println("Modifica tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’");
		cadenes.stream().map((a)->a.replaceAll("a","4")).forEach(a->System.out.println(a));
		
		System.out.println("Mostra només els elements que són numèrics. (Encara que estiguin guardats com Strings).");   
		cadenes.stream().filter((a)->{
										try {
											Integer.parseInt(a);
											return true;
										}catch(NumberFormatException e) {
											return false;
										}
										
										}).forEach(a->System.out.println(a));
	}
	
}
      