package taschenrechner;

public class Eingabedaten 
{
	private double zahl1, zahl2;
	private char operator;
	
	public Eingabedaten() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public double getZahl1()
	{
		return zahl1;
	}
	
	public double getZahl2()
	{
		return zahl2;
	}
	
	public char getOperator() 
	{
		return operator;
	}

	public void setZahl1(double zahl1)
	{
		this.zahl1 = zahl1;
	}

	public void setZahl2(double zahl2) 
	{
		this.zahl2 = zahl2;
	}

	public void setOperator(char operator) 
	{
		this.operator = operator;
	}
}
