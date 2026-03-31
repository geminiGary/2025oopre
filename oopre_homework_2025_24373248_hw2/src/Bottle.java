public class Bottle {
    private final String name;
    private final int effect;

    public Bottle(String name, int effect) {
        this.name = name;
        this.effect = effect;
    }

    public String getName() {
        return name;
    }

    public int getEffect() {
        return effect;
    }
}