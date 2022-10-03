/*
Wetterbericht von 3 Ortschaften
Richard Derico
*/

public class Temperatur2 {
    public static void main(String[] args) {

        String Ort = "Zürich";
        String Ort2 = "Bern";
        String Ort3 = "Basel";

        short tempZürich = ((22 + 31 + 15 + 10) / 4);
        short tempBern = (15 / 2 + 6 / 2 + -3 / 2);
        short tempBasel = ((5 + 6 + 7 + 10 + 10) / 5);

        System.out.println("Der durchschnittliche Temperatur in " + Ort + " beträgt " + tempZürich + "°C, " + "in "
                + Ort2 + " " + tempBern + "°C und in " + Ort3 + " " + tempBasel + " Grad.");
        // System.out.println("Der durchschnitt Temperatur in " + Ort2 + " beträgt " +
        // tempBern + "!");
        // System.out.println("Der durchschnitt Temperatur in " + Ort3 + " beträgt " +
        // tempBasel + "!");
    }
}
