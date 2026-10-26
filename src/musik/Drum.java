package musik;
/** extends AlatMusik saja. TIDAK Portabel dan TIDAK Elektrik. */
public class Drum extends AlatMusik {

    public Drum() {
        super("Drum");
    }

    @Override
    public String mainkan() {
        return "Dipukul dengan stik";
    }

    @Override
    public String caraBunyi() {
        return "getaran membran kulit yang dipukul";
    }
}