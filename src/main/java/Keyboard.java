public class Keyboard implements Tradable {
    private String name;

    public Keyboard() {this.name = "Keyboard";}

    public Keyboard(String name) {this.name = name;}

    @Override
    public int getPrice() {
        return 20;
    }
}
