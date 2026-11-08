import java.util.Locale;
import java.util.Scanner;

public class KvittoDecimaler {
    static final String BUTIK = "Hörnbutiken";
    static final int RABATT_PROCENT = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean medlem = true;

        System.out.print("Vara: ");
        String vara = scanner.nextLine();
        System.out.print("Antal: ");
        int antal = scanner.nextInt();
        System.out.print("Styckpris (kr): ");

        // Byter komma mot punkt så att både 19,90 och 19.90 fungerar
        double styckpris = Double.parseDouble(scanner.next().replace(',', '.'));

        double total = antal * styckpris;
        double rabatt = total * RABATT_PROCENT / 100;
        double attBetala = total - rabatt;

        // Två decimaler: printf med %.2f avrundar och visar alltid två siffror.
        // Locale.US gör att det blir punkt, till exempel 39.80.
        System.out.println();
        System.out.println("----- " + BUTIK + " -----");
        System.out.println("Vara:      " + vara);
        System.out.println("Antal:     " + antal);
        System.out.printf(Locale.US, "Styckpris: %.2f kr%n", styckpris);
        System.out.printf(Locale.US, "Totalt:    %.2f kr%n", total);
        System.out.printf(Locale.US, "Rabatt:    %.2f kr%n", rabatt);
        System.out.printf(Locale.US, "Att betala: %.2f kr%n", attBetala);
        System.out.println("Medlem:    " + medlem);
    }
}
