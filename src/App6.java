public class App6 {
    public static void main(String[] args) {
        String[][] tab = new String[6][10];

        tab[0][0] = "Mateusz";

        tab[2][4] = "Janusz";

        System.out.println(tab[2][4]);

        String i = tab[0][0] + tab[2][4];

        int[] liczby = {1,2,3,4,5,6,7,8,9};

        System.out.println(liczby[3]);

        char[] znaki = {'t','y','u'};

        int[][] liczby2 = {
                {1,2,3},
                {1,2,3},
                {1,2,3},
                {1,2,3}
        };
    }
}
