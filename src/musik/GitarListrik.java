package musik;

/**
 * INHERITANCE BERLAPIS: GitarListrik extends Gitar, dan Gitar extends
 * AlatMusik.
 * Juga implements Elektrik. Method yang sama di-override lagi => perilaku
 * berbeda.
 */
public class GitarListrik extends Gitar implements Elektrik {

    public GitarListrik() {
        super();
        this.nama = "Gitar Listrik"; // atribut protected diwarisi dari AlatMusik
    }

    @Override
    public String caraBunyi() {
        return "getaran senar ditangkap pickup, lalu diperkeras amplifier";
    }

    @Override
    public String sambungkanKeAmplifier() {
        return "Kabel jack terhubung ke amplifier";
    }
}