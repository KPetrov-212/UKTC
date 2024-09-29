import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] masiv = new String[3];

        System.out.print("Вашите имена: ");
        String name = sc.nextLine();

        System.out.print("Търсите или предлагате? : ");
        String answer = sc.nextLine();

        if (answer.equals("Търся")){
            System.out.print("Какво търсите? : ");
            String search = sc.nextLine();
            masiv[0] = ", търся " + search;
        }else if (answer.equals("Предлагам")){
            System.out.print("Какво предлагате? : ");
            String offer = sc.nextLine();
            masiv[0] = ", предлагам " + offer;
        }
        String message = "Аз съм " + name + masiv[0];
        System.out.print(message);
    }
}