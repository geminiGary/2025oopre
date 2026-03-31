public class Equipment  {
    private final String name;
    private boolean usable;

    public Equipment(String name) {
        this.name = name;
        this.usable = false;
    }

    public String getName() {
        return name;
    }

    public void setUsable(boolean usable) {
        this.usable = usable;
    }

    public boolean isUsable() {
        return usable;
    }
}