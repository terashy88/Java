/*
Wetterbericht von 3 Ortschaften
Richard Derico
*/

public class Temperatur {
    public static void main(String[] args) {

        String Ort, Ort2, Ort3;
        Ort = "Zürich";
        Ort2 = "Bern";
        Ort3 = "Basel";

        var tempZürich = ((22.0 + 31.0 + 15.0 + 10.0) / 4);
        var tempBern = (15.0 / 2.0 + 6.0 / 2.0 + -3.0 / 2);
        var tempBasel = ((5.0 + 6.0 + 7.0 + 10.0 + 10.0) / 5);

        System.out.println("\nDer durchschnittliche Temperatur in " + Ort + " beträgt " + tempZürich + "°C, "
                + Ort2 + " " + tempBern + "°C und in " + Ort3 + " " + tempBasel + " Grad.\n");
        // System.out.println("Der durchschnitt Temperatur in " + Ort2 + " beträgt " +
        // tempBern + "!");
        // System.out.println("Der durchschnitt Temperatur in " + Ort3 + " beträgt " +
        // tempBasel + "!");
    }
}
