import java.util.Scanner;

public class Kvitto {
    static final String BUTIK = "Hörnbutiken";
    static final int MOMS_PROCENT = 25;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean medlem = true;

        System.out.print("Vara: ");
        String vara = scanner.nextLine();
        System.out.print("Antal: ");
        int antal = scanner.nextInt();
        System.out.print("Styckpris (kr): ");
        int styckpris = scanner.nextInt();

        int total = antal * styckpris;

        // Priset är inklusive moms, därför delar vi med 125 och inte med 100
        int moms = total * MOMS_PROCENT / (100 + MOMS_PROCENT);

        System.out.print("Betalar (kr): ");
        int betalt = scanner.nextInt();
        int vaxel = betalt - total;

        // Största valören först, resten går vidare till nästa valör
        int rest = vaxel;
        int hundra = rest / 100;
        rest = rest % 100;
        int femtio = rest / 50;
        rest = rest % 50;
        int tjugo = rest / 20;
        rest = rest % 20;
        int tio = rest / 10;
        rest = rest % 10;
        int fem = rest / 5;
        rest = rest % 5;
        int en = rest;

        System.out.println();
        System.out.println("----- " + BUTIK + " -----");
        System.out.println("Vara:      " + vara);
        System.out.println("Antal:     " + antal);
        System.out.println("Styckpris: " + styckpris + " kr");
        System.out.println("Totalt:    " + total + " kr");
        System.out.println("Varav moms: " + moms + " kr");
        System.out.println("Medlem:    " + medlem);
        System.out.println("Betalt:    " + betalt + " kr");
        System.out.println("Växel:     " + vaxel + " kr");
        System.out.println("100-lappar: " + hundra);
        System.out.println("50-lappar:  " + femtio);
        System.out.println("20-lappar:  " + tjugo);
        System.out.println("10-kronor:  " + tio);
        System.out.println("5-kronor:   " + fem);
        System.out.println("1-kronor:   " + en);
    }
}
