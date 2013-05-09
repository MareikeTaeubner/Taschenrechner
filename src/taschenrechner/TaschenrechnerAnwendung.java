package taschenrechner;

public class TaschenrechnerAnwendung 
{
	public static void main(String[] args) 
	{
		Taschenrechner taschenrechner = new Taschenrechner();
		Eingabedaten eingabe = taschenrechner.eingabe();
		double ergebnis = taschenrechner.berechnung(eingabe);
		
		System.out.println(ergebnis);
	}
}
