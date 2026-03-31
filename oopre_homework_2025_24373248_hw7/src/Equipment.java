public class Equipment  {
    private final String name;
    private final String type;
    private final int ce;
    private boolean usable;

    public Equipment(String name, String type, int ce) {
        this.name = name;
        this.type = type;
        this.ce = ce;
        this.usable = false;
    }

    public String getName() {
        return name;
    }

    public void setUsable(boolean usable) {
        this.usable = usable;
    }

    public String getType() {
        return type;
    }

    public int getCE() {
        return ce;
    }
}