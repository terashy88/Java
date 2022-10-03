// If else statement Adult are not
public class IfElse {
    public static void main(String[] args) {
        int age = 22;
        if (age >= 18) { // Boolean expression
            // if (!(age >= 18)) { ! to turn..
            System.out.println("You are a Adult!");
        } else if (age < 18 || age >= 15) {
            System.out.println("You are almost a Adult!");

        } else {
            System.out.println("You are a Kid!");
        }

        int hour = 17;
        if (hour < 12) {
            System.out.println("Guten Morgen");
        } else if (hour <= 16) {
            System.out.println("Guten Nachmittag");
        } else {
            System.out.println("Guten Abend");
        }
    }
}
