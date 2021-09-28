public class App3 {
    public static void main(String[] args) {
        int a, b, c, d;
        int wynik = 5 + 6;

        a = 5;
        b = 7;
        c = a * b;
        d = c / a;

        System.out.println(wynik);

        System.out.println(c);
        System.out.println(d);

        int e = 9;
        double f = 5;

        double wynikDzielenia = e%7;

        System.out.println(wynikDzielenia);

        String imie = "Mateusz";
        String nazwisko = "Bereda";

        String calosc = imie + " " + nazwisko + " " + e;

        System.out.println(calosc + " !!!");

        boolean wartoscLogiczna;

        wartoscLogiczna = e >= f;

        System.out.println(wartoscLogiczna);
    }
}
