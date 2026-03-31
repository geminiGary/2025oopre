public class Bottle {
    private final String name;
    private final int effect;
    private final String type;
    private boolean usable;

    public Bottle(String name, String type, int effect) {
        this.name = name;
        this.type = type;
        this.effect = effect;
        this.usable = false;
    }

    public String getName() {
        return name;
    }

    public int getEffect() {
        return effect;
    }

    public String getType() {
        return type;
    }

    public boolean isUsable() {
        return usable;
    }

    public void setUsable(boolean usable) {
        this.usable = usable;
    }

    public void use(Adventurer user, Adventurer target) {
    }
}