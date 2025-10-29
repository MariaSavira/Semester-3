package Praktikum08;

public class AbstractClassDemo {
    public static void main(String[] args) {
        // Hewan hewan1 = new Hewan(10, "Rumput", "Savana");
        // hewan1.cetakInfo();
        // hewan1.bergerak();
        // hewan1.bernapas();

        Lebah lebah1 = new Lebah(0.05, "Nektar", "Hutan", "Ratu");
        lebah1.cetakInfo();
        System.out.println();
        System.out.println("Cara Lebah bergerak : ");
        lebah1.bergerak();
        System.out.println();
        System.out.println("Cara Lebah bernapas : ");
        lebah1.bernapas();
        System.out.println();

        Ular ular1 = new Ular(1, "Daging", "Sawah", true);
        ular1.cetakInfo();
        System.out.println();
        System.out.println("Cara Ular bergerak : ");
        ular1.bergerak();
        System.out.println();
        System.out.println("Cara Lebah bernapas : ");
        ular1.bernapas();
    }
}
