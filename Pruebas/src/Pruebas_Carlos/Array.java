package Pruebas_Carlos;

import java.util.ArrayList;
import java.util.List;

public class Array {
	
	public static void main (String [] args){
		
		List<String> myList = new ArrayList<String>();
		myList.add("Gibbon");
		
		System.out.println("I smell a " + myList.get(0));
		myList.add("Carlos");
		System.out.println("I smell a " + myList.get(1));
		System.out.println(myList);
		
		Monkey pruebaConcepto = new Monkey();
		System.out.println("que es esto? " + pruebaConcepto.chango);
		
	}
	
}


class Monkey
{
	String chango = "esto es un chango";
}