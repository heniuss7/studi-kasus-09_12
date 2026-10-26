package musik;
public interface Portabel {

    String bawa();

    default String tempatPenyimpanan() {
        return "tas biasa";
    }
}
