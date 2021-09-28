public class App7 {
    public static void main(String[] args) {
        String a = "dwa";
        int b = 3;

        /*if(a == b) {
            System.out.println("A jest równe B !!!");
        } else if(a > b) {
            System.out.println("A jest większe !!!");
        } else if(a < 1) {
            System.out.println("B jest większe !!!");
        } else {
            System.out.println("Else !!!");
        }*/

        switch(a) {
            case "jeden":
                System.out.println("To jest 1 !!");
                break;
            case "dwa":
                System.out.println("To jest 2 !!");
                break;
            case "trzy":
                System.out.println("To jest 3 !!");
                break;
        }

        /*if(a == "jeden") {
            System.out.println("To jest 1 !!");
        } else if(a == "dwa") {
            System.out.println("To jest 2 !!");
        } else if(a == "trzy") {
            System.out.println("To jest 3 !!");
        }*/

        System.out.println("Jakiś tam kawałek kodu dalej !!");

        int c = 5;

        switch(c) {
            case 1:
            case 2:
            case 3:
                System.out.println("C jest mniejsze od 4");
                break;
            case 4:
                System.out.println("C wynosi 4");
                break;
            default:
                System.out.println("C jest większe od 4");
        }
    }
}
