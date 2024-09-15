import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj podaj imię:");
        Scanner klawiatura = new Scanner(System.in);
        String imie = klawiatura.nextLine();
        System.out.println("Witaj " + imie + "!");
    }
}