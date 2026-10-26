package musik;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // AlatMusik a = new AlatMusik("X");   // ERROR: abstract class tidak bisa di-instansiasi

        // POLYMORPHISM: variabel bertipe parent (AlatMusik) menampung berbagai objek subclass.
        List<AlatMusik> orkes = new ArrayList<>();
        orkes.add(new Gitar());
        orkes.add(new GitarListrik());
        orkes.add(new Drum());
        orkes.add(new Seruling());

        System.out.println("=== PERTUNJUKAN (Polymorphism) ===");
        for (AlatMusik a : orkes) {
            System.out.println(a.getNama());
            System.out.println("  Perkenalan : " + a.perkenalan());   
            System.out.println("  Dimainkan  : " + a.mainkan());      
        }

        // OVERLOADING: method mainkan() yang sama dipanggil dengan parameter berbeda.
        System.out.println();
        System.out.println("=== OVERLOADING mainkan() ===");
        AlatMusik gitar = orkes.get(0);
        System.out.println("mainkan()                  : " + gitar.mainkan());
        System.out.println("mainkan(lagu)              : " + gitar.mainkan("Laskar Pelangi"));
        System.out.println("mainkan(lagu, durasiMenit) : " + gitar.mainkan("Laskar Pelangi", 5));
        // Gabungan: overloading + overriding (versi mainkan() yang dipakai tergantung objeknya)
        System.out.println("Drum  mainkan(lagu)        : " + orkes.get(2).mainkan("Laskar Pelangi"));

        // POLYMORPHISM via INTERFACE: pisahkan berdasarkan kemampuan.
        System.out.println();
        System.out.println("=== YANG BISA DIBAWA (Portabel) ===");
        for (AlatMusik a : orkes) {
            if (a instanceof Portabel p) {
                System.out.println(a.getNama() + " -> " + p.bawa() + " (simpan di: " + p.tempatPenyimpanan() + ")");
            }
        }

        System.out.println();
        System.out.println("=== YANG BUTUH LISTRIK (Elektrik) ===");
        for (AlatMusik a : orkes) {
            if (a instanceof Elektrik e) {
                System.out.println(a.getNama() + " -> " + e.sambungkanKeAmplifier());
            }
        }
    }
}
