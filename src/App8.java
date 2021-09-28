public class App8 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        /*for(int i = 0; i < 10; i++) {
            tab[i] = i;
            System.out.println(tab[i]);
        }*/

        /*int i = 0;
        for(int element : tab) {
            element = i;
            i++;
        }

        for(int element2 : tab) {
            System.out.println(element2);
        }*/

        int i = 0;
        while(i > 0) {
            System.out.println("coś się dzieje !!");
            i--;
        }

        int j = 0;
        do {
            System.out.println("Pętla do-while !!");
            j--;
        } while(j > 0);

        System.out.println("Coś tam po pętli !!");
    }
}
