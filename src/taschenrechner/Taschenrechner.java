package taschenrechner;

import java.util.Scanner;

public class Taschenrechner 
{
	public Eingabedaten eingabe()
	{
		Eingabedaten eingabedaten = new Eingabedaten();
		Scanner sc = new Scanner(System.in);
		
		eingabedaten.setZahl1(sc.nextDouble());
		eingabedaten.setOperator(sc.next().charAt(0));
		eingabedaten.setZahl2(sc.nextDouble());
		
		sc.close();
		
		return eingabedaten;
	}
	
	/**
	 * 
	 * @param eingabedaten die Daten, mit denen die Berechnung durchgeführt werden soll
	 * @return das Ergebnis der Berechnung
	 */
	public double berechnung(Eingabedaten eingabedaten)
	{
		double ergebnis;
		
		switch (eingabedaten.getOperator())
		{
		case '+': ergebnis = eingabedaten.getZahl1() + eingabedaten.getZahl2();
					break;
		case '-': ergebnis = eingabedaten.getZahl1() - eingabedaten.getZahl2();
					break;
		case '*':
		case 'x':
		case 'X': ergebnis = eingabedaten.getZahl1() * eingabedaten.getZahl2();
					break;
		case '/':
		case ':': ergebnis = eingabedaten.getZahl1() / eingabedaten.getZahl2();
					break;
		default: throw new IllegalArgumentException("Der Operator wird nicht unterstützt: " + eingabedaten.getOperator());
		}
		
		return ergebnis;
	}
	
	
}
