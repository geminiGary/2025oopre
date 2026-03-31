import java.util.ArrayList;

public class Adventurer {
    private final String name;
    private final ArrayList<Bottle> bottles = new ArrayList<>();
    private final ArrayList<Equipment> equipments = new ArrayList<>();

    public Adventurer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addBottle(Bottle bottle) {
        this.bottles.add(bottle);
    }

    public void addEquipment(Equipment equipment) {
        this.equipments.add(equipment);
    }

    public Bottle removeBottle(String name) {
        for (int i = 0; i < bottles.size(); i++) {
            if (bottles.get(i).getName().equals(name)) {
                int effect = bottles.get(i).getEffect();
                bottles.remove(i);
                return new Bottle(name, effect);
            }
        }
        return null;
    }

    public int getBottleCount() {
        return bottles.size();
    }

    public Equipment removeEquipment(String name) {
        for (int i = 0; i < equipments.size(); i++) {
            if (equipments.get(i).getName().equals(name)) {
                equipments.remove(i);
                return new Equipment(name);
            }
        }
        return null;
    }

    public int getEquipmentCount() {
        return equipments.size();
    }
}