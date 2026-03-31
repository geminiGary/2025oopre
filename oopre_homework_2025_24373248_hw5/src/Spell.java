public class Spell {
    private final String id;
    private final String type;
    private final int manaCost;
    private final int power;

    public Spell(String id, String type, int manaCost, int power) {
        this.id = id;
        this.type = type;
        this.manaCost = manaCost;
        this.power = power;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void use(Adventurer target) {
        switch (type) {
            case "HealSpell":
                target.setHitPoint(target.getHitPoint() + power);
                break;
            case "AttackSpell":
                target.setHitPoint(Math.max(0,target.getHitPoint() - power));
                break;
            default:
                break;
        }

    }
}
