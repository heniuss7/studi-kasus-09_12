package musik;

/**
 * INHERITANCE: Gitar "is-a" AlatMusik. Juga implements Portabel (kemampuan
 * tambahan).
 */
public class Gitar extends AlatMusik implements Portabel {

    public Gitar() {
        super("Gitar Akustik"); // memanggil constructor parent
    }

    @Override // OVERRIDING abstract method
    public String mainkan() {
        return "Dipetik pada senar";
    }

    @Override
    public String caraBunyi() {
        return "getaran senar + badan gitar berongga";
    }

    @Override
    public String bawa() {
        return "Disandang di punggung";
    }

    @Override // override default method dari interface
    public String tempatPenyimpanan() {
        return "gig bag";
    }
}