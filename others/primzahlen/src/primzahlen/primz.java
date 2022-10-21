package primzahlen;

public class primz {

	public static void main(String[] args) {

		int endZahl = 100 , anzahlPrimzahlen = 0 , zeilenwechselzaehler = 20 , Zeilenwechsel = 0 , zaehler , primzahlzaehler , aktuelleZahl = 1;
		long schleifenzaehler = 0;
		
		System.out.println ("primzahlen bis " + endZahl + " sind: ");
		
		for (zaehler = 0; aktuelleZahl<=endZahl; aktuelleZahl++ )
		{	
			primzahlzaehler=0;
			zaehler=1;
			while (zaehler <= aktuelleZahl)
			{
				if (aktuelleZahl % zaehler == 0)
				{
					primzahlzaehler++;
				}
				zaehler++;
				schleifenzaehler++;
			}
			if (primzahlzaehler == 2)
			{
				System.out.print(aktuelleZahl + "\t");
				Zeilenwechsel++;
				anzahlPrimzahlen++;
			}
			if (Zeilenwechsel == zeilenwechselzaehler)
			{
				System.out.println ();
				Zeilenwechsel = 0;
			}
			schleifenzaehler++;
		}
		System.out.println ("\nanzahl aller schleifenzyklen: " + schleifenzaehler);
		System.out.print ("anzahl der Primzahlen: " + anzahlPrimzahlen);
	}
}
