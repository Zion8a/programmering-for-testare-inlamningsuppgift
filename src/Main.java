import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TextAnalyzer analyzer = new TextAnalyzer();

        System.out.println("Skriv text rad för rad. Skriv stop för att avsluta:");

        String line = scanner.nextLine();

        while (!analyzer.isStop(line)) {
            analyzer.addLine(line);
            line = scanner.nextLine();
        }

        System.out.println("Antal rader: " + analyzer.getLineCount());
        System.out.println("Antal tecken: " + analyzer.getCharacterCount());

        scanner.close();
    }
}