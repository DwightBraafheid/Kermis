import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int AttractieKeuze = in.nextInt();
        do {
            System.out.println("Welkom bij de kerrmis ");
            System.out.println("Welke attractie wil je vandaag allemaal in? (alleen cijfer invoer mogelik) ");
            System.out.println("1 = Botsauto");
            System.out.println("2 = Turbopolyp");
            System.out.println("3 = Spiegelpaleis");
            System.out.println("4 = Spookhuis");
            System.out.println("5 = Hawaii");
            System.out.println("6 = Ladderklimmen");


        }
        while (AttractieKeuze <= 6);


        {
            switch (AttractieKeuze) {
                case 1:
                    Botsauto.draaien();
                    break;
                case 2:
                    Turbopolyp.draaien();
                    break;
                case 3:
                    Spiegelpaleis.draaien();
                    break;
                case 4:
                    Spookhuis.draaien();
                    break;
                case 5:
                    Hawaii.draaien();
                    break;
                case 6:
                    Ladderklimmen.draaien();
                    break;
                case 0:
                    System.out.println("Graag een cijfer kiezen tussen de 1 t/m 6");
                    break;
                default:
                    System.out.println("Graag een cijfer kiezen tussen de 1 t/m 6");


            }
        }

    }


}


//        if (in.hasNextInt()) {
//            // get the update value
//            omzetAttractie = in.nextInt();
//
//            // check to see if it was within range
//            if (omzetAttractie >= 0 && omzetAttractie <= 5) {
//                invalidInput = false;
//            } else {
//                System.out.println("Verkeerde input, aub selecteer een getal tussen de 1 en 6 ");
//            }
//        } else {
//            System.out.println("Verkeerde input, aub selecteer een getal tussen de 1 en 6 ");
//            in.next();
//        }
//        if (AttractieKeuze <= 3) {
//            System.out.println("Keuze is " + AttractieKeuze);
//
//        } else {
//            System.out.println("Graag kiezen tussen 1 t/m 6");
//            in.nextInt();
//        }