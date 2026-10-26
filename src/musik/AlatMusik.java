package musik;

public abstract class AlatMusik {

    protected String nama; // protected: bisa diakses subclass

    public AlatMusik(String nama) {
        this.nama = nama;
    }

    // ABSTRACT METHOD: tiap alat musik dimainkan dengan cara berbeda.
    public abstract String mainkan();

    // ABSTRACT METHOD: tiap alat musik punya cara menghasilkan bunyi berbeda.
    public abstract String caraBunyi();


    public String mainkan(String lagu) {
        return mainkan() + " untuk lagu \"" + lagu + "\"";
    }

    public String mainkan(String lagu, int durasiMenit) {
        return mainkan(lagu) + ", selama " + durasiMenit + " menit";
    }

    // CONCRETE METHOD: sama untuk semua alat musik, tidak perlu ditulis ulang di subclass.
    public String perkenalan() {
        return "Saya " + nama + ", bunyi dihasilkan dengan cara: " + caraBunyi();
    }

    public String getNama() {
        return nama;
    }
}