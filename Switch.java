public class Switch {
    public static void main(String[] args) {
        // switch Statement
        String gender = "female";
        if (gender.equals("female")) {
        } else if (gender.equals("male")) {
        } else if (gender.equals("prefer not to say!")) {

        } else {
        }

        switch (gender) {
            case "female":
                System.out.println("I'm a female!");
                return;
            case "male":
                System.out.println("I'm a male!");
                break;
            case "":
                System.out.println("I prefer not to say!");
            default:
        }
    }
}
