import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma frase: ");

        String s = in.nextLine();

        System.out.println("voce digitou " + s);
        
        in.close();

    }
}
