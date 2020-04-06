package primaLezione;

import net.finmath.*;
import net.finmath.functions.AnalyticFormulas;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.Math.PI;
import java.lang.String;
import java.lang.Math.*;



public class ilMainDelProgetto {

	public static void main(String[] args) {
		//VARIABILI
		/*String stringa1;
		stringa1 = "Ciao!";
		System.out.println(stringa1);   //syso e ctrl+space
		
		//se fosse stato print -> non vado a capo
		double a = 3.5;  //variabili
		int b = 2;
		double c = b;
		System.out.println(c);
		double d, e=4, f;
		
		char carattere = '+';
		//a = a +1; //a++
		
		System.out.println(++a + b);  //a++
		System.out.println(a);
		
		String laMiaStringa ="stringa1";
		System.out.println(laMiaStringa + " " + a);*/
		
		
		//STRINGHE
		/*String a = "cccc".concat("wwwwww");
		System.out.println(a);
		
	    String c ="do";
	    String b ="do  ";
	    //b = b.trim();
	    
	    //
	    System.out.println(c.equals(b.trim()));
	    System.out.println(b + ",");*/
		/*String aa = "stastaststst";
		aa = aa.replaceAll("ta","s");
		System.out.println(aa);
		int bb;
		bb = aa.length();
		System.out.println(bb);*/
		
		
		//MATH
		/*double a = Math.exp(3);  //vedi suggerimenti
		System.out.println(a);
		
		double b = Math.abs(-5.67);
		System.out.println(b);
		
		double c = Math.ceil(5.01);
		System.out.println(c);
		
		double d = Math.pow(2, Math.abs(-3));
		System.out.println(d);*/
		
		
		
		//PROGRAMMA INTERATTIVO
		/*Scanner tastiera = new Scanner(System.in);  //dopo vi spiego cos'è un oggetto 
		System.out.println("Inserisci un numero intero");
		int n = tastiera.nextInt();
		System.out.println("L'intero scelto è " + n);*/
		
		
		//ARRAY E CICLO FOR
		/*String[] arrayDiStringhe = new String[4];
		
		String[] arrayDiStringhe2 = {"Mario", "Luigi"};
		//System.out.println(arrayDiStringhe); //non fatelo ma fate invece
		System.out.println(Arrays.toString(arrayDiStringhe2));
		int [] arrayDiInt = {3,3,3};*/
		
		/*int[] a = new int[10];  //riempimento dinamico, OCCHIO si parte da 0
		//System.out.print("[");
		for(int i=0 ;i<10;i++) {
			a[i]=(i+1)*3 ;
			//System.out.print(a[i] + ", ");  
		}
		//System.out.println("]");
		System.out.println(Arrays.toString(a));*/
		
		
		//ARRAY MULTIDIMENSIONALI
		/*int[][] arrayMultidim = new int[3][4];
		for(int i=0 ;i<3;i++) {
			
			for(int j=0; j<4; j++) {
				arrayMultidim[i][j] = i*j;
			} 
			
		}*/
		
		
		//CICLO WHILE (se non so già in partenza quante volte ripetere le istruzioni)
		//esempio: tra quanti mesi posso comprare casa da 200mila euro guadagnando 1500 euro al mese?
		/*Scanner tastiera = new Scanner(System.in);  
		System.out.println("Inserisci quanti soldi possiedi già in euro");
		int soldi = tastiera.nextInt();
		
		int mesiNecessari = 0;
		while(soldi < 200000) {
			soldi = soldi + 1500;
			
			mesiNecessari++;
		}
		
		System.out.println(mesiNecessari);*/
		//do{
		//    istruzioni;
		//}while(espressione booleana);
		
		
		//IF-ELSE
		/*Scanner tastiera = new Scanner(System.in);  
		System.out.println("Inserisci un numero intero");
		int n = tastiera.nextInt();
		if (n<0) {
			System.out.println("Hai inserito un numero negativo");
		}else if (n==0) {
			System.out.println("Hai inserito zero");
		}else {
			System.out.println("Hai inserito un numero positivo");
		}
		
		Scanner tastiera = new Scanner(System.in);  
		System.out.println("Inserisci un numero intero");
		int nn = tastiera.nextInt();
		if ((nn>=0) && (nn<=10)) {
			System.out.println("Hai inserito un numero appartenente all'intervallo [0,10]");
		}else {
			System.out.println("Hai inserito un numero appartenente all'intervallo (10,inf)u(-inf,0)");
		}*/
		
		
		//SWITCH CASE
		/*char lettera = 't';
		switch(lettera) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("vocale");
				break;
				
			case 'y':
			case 'w':
				System.out.println("talvolta vocale");
				break;
				
			default: 
				System.out.println("consonante");
		}*/
		
		
	    //TESTARE UNA CLASSE
		/*ComplexNumber a = new ComplexNumber(3.4, 2);
		ComplexNumber b = new ComplexNumber(8, 12);
		System.out.println(a.toString());
		int i = 345;
		a.setReal(i);
		System.out.println(a.getReal());
		
		ComplexNumber c = a.sumComplexNumber(b);
		System.out.println(c);
		
		ComplexNumber d = a.divisionComplexNumber(b);
		System.out.println(d);/*
		
		
		//TESTARE UN'ALTRA CLASSE
		/*Color bluIntenso = new Color("blu", 10);
		System.out.println(bluIntenso.getColore());
		bluIntenso.setIntensità(4);
		System.out.println(bluIntenso.getIntensità());
		System.out.println(bluIntenso.toString());*/
		
		/*Color blu = new Color("blu");
		Scimmia scimmietta = new Scimmia(15,blu,"Alfonso");
		System.out.println(scimmietta.verso());
		System.out.println(scimmietta.lancio());
		
		Animale animal = new Animale();
		animal.setPeso(3);
		System.out.println(animal.getPeso());*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//ANCORA SU ARRAY
		/*int[] a1= {1,2};
		
		int[] a2;  //definire e basta serve a poco infatti
		a2=a1;   //qui copio solo referenza ma l'array è lo stesso
		a2[0]= 3;
		a2[1]= 8;
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));*/

		
		
	}

}
