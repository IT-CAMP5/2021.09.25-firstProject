public class App4 {
    public static void main(String[] args) {
        boolean a;
        boolean b;
        boolean c;
        boolean d;

        boolean wynik;

        a = true;
        b = false;
        c = true;
        d = true;

        wynik = (a && b) || (c && d);

        System.out.println(wynik);
    }
}
