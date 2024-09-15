import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj podaj imię:");
        Scanner klawiaturaImie = new Scanner(System.in);
        String imie = klawiaturaImie.nextLine();
        System.out.println("Witaj " + imie + "!");
        System.out.println("Ile masz lat?");
        int wiek;
        Scanner klawiaturaWiek = new Scanner(System.in);
        wiek = klawiaturaWiek.nextInt();
        wiek = wiek + 10;
        System.out.println("Twój wiek za 10 lat będzie wynosił: " + wiek + " lat");
        System.out.println("Czy chciałbyś kontynować? Jeśli tak wpisz 1, jeżeli nie wpisz 0");
        int dzialanie;
        Scanner klawiaturaDzialanie = new Scanner(System.in);
        dzialanie = klawiaturaDzialanie.nextInt();
        if(dzialanie==0){
            return;
        }else{
            System.out.println("Z jakiego miasta pochodzisz?");
            String miasto;
            Scanner klawiaturaMiasto = new Scanner(System.in);
            miasto = klawiaturaMiasto.nextLine();
            System.out.println("Twoje dane to: " + imie + ", " + wiek + " lat " + miasto);
            System.out.println("Program zakończony dzikuję za użcyię ;)");
            return;

        }

    }
}