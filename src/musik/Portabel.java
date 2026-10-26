package musik;
/**
 * INTERFACE: Portabel (alat musik yang mudah dibawa-bawa).
 * Tidak semua alat musik portabel (drum set besar tidak), jadi ini kemampuan
 * OPSIONAL -> cocok sebagai interface, bukan dimasukkan ke abstract class.
 */
public interface Portabel {

    String bawa();

    // DEFAULT METHOD: isi bawaan, boleh di-override.
    default String tempatPenyimpanan() {
        return "tas biasa";
    }
}
