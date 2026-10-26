package musik;

/** extends AlatMusik + implements Portabel (memakai default method apa adanya). */
public class Seruling extends AlatMusik implements Portabel {

    public Seruling() {
        super("Seruling");
    }

    @Override
    public String mainkan() {
        return "Ditiup sambil menutup lubang nada";
    }

    @Override
    public String caraBunyi() {
        return "getaran kolom udara di dalam tabung";
    }

    @Override
    public String bawa() {
        return "Dimasukkan ke saku";
    }
    // tempatPenyimpanan() tidak di-override -> memakai default "tas biasa"
}
