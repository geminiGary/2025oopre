public class Factory {
    public static Bottle createBottle(String type, String id, int effect) {
        switch (type) {
            case "HpBottle":
                return new HpBottle(id, "HpBottle", effect);
            case "AtkBottle":
                return new AtkBottle(id, "AtkBottle", effect);
            case "DefBottle":
                return new DefBottle(id, "DefBottle", effect);
            case "ManaBottle":
                return new ManaBottle(id, "ManaBottle", effect);
            default:
                return null;
        }
    }

    public static Equipment createEquipment(String type, String name, int ce) {
        switch (type) {
            case "Armour":
                return new Armour(name, "Armour", ce);
            case "Sword":
                return new Weapon(name, "Sword", ce);
            case "Magicbook":
                return new Weapon(name, "Magicbook", ce);
            default:
                return null;
        }
    }
}
