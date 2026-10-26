package musik;
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
}
