package tugas;

public class PenyanyiDemo {
    public static void main(String[] args) {
        Penyanyi.Lagu lagu1 = new Penyanyi.Lagu("Taylor Swift", "Pop", 2006, "Love Story");
        Penyanyi.Lagu lagu2 = new Penyanyi.Lagu();
        lagu2.nama = "Dewa 19";
        lagu2.genre = "Pop Rock";
        lagu2.tahunDebut = 1986;
        lagu2.judulLagu = "Aku Milikmu";
        
        lagu1.info();
        System.out.println();
        lagu2.info();
    }
}

