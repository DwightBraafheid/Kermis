import java.util.ArrayList;
import java.util.List;


public class Attractie {
    private static Object Attractie;
    public List<Attractie> Attracties = new ArrayList<>();
    public int prijs;
    Attractie Botsauto = new Attractie();
    Attractie TurboPolyp = new Attractie();
    Attractie SpiegelPaleis = new Attractie();
    Attractie Spookhuis = new Attractie();
    Attractie Hawaii = new Attractie();
    Attractie Ladderklimmen = new Attractie();

    public static void draaien() {
        System.out.println("Je zit in de "+ Attractie);
    }
}


class Botsauto extends Attractie {
    public Botsauto() {
        prijs = 250;
    }

}

class Turbopolyp extends Attractie {
    public Turbopolyp() {
        prijs = 250;
    }

}

class Spiegelpaleis extends Attractie {
    public Spiegelpaleis() {
        prijs = 250;
    }

}

class Spookhuis extends Attractie {
    public Spookhuis() {
        prijs = 250;
    }

}

class Hawaii extends Attractie {
    public Hawaii() {
        prijs = 250;
    }

}

class Ladderklimmen extends Attractie {
    public Ladderklimmen() {
        prijs = 250;
    }

}





//    public Attractie{
//        Attractielijst = new Arraylist<>();
//
//    }

//    public void botsAuto;{
//        System.out.println("Botsauto");
//
//
//    }
//
//    class turboPolyp {
//    }
//
//    class spiegelPaleis {
//    }
//
//    class spookhuis {
//    }
//
//    class hawaii {
//    }
//
//    class ladderklimmen {
//    }
//
//
//}

//ToDo Hoe interface integreren,
