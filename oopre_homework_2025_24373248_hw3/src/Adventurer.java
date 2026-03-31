import java.util.ArrayList;

public class Adventurer {
    private final String name;
    private int hitPoint;
    private int atk;
    private int def;
    private int mana;
    private final ArrayList<Bottle> bottles = new ArrayList<>();
    private final ArrayList<Equipment> equipments = new ArrayList<>();
    private final ArrayList<Spell> spells = new ArrayList<>();

    public Adventurer(String name) {
        this.name = name;
        this.hitPoint = 500;
        this.atk = 1;
        this.def = 0;
        this.mana = 10;
    }

    public boolean isAlive() {
        return hitPoint > 0;
    }

    public String getName() {
        return name;
    }

    public void addBottle(Bottle bottle) {
        Bottle realBottle = null;
        switch(bottle.getType()) {
            case "HpBottle":
                realBottle = new HpBottle(bottle.getName(), bottle.getType(), bottle.getEffect());
                break;
            case "AtkBottle":
                realBottle = new AtkBottle(bottle.getName(), bottle.getType(), bottle.getEffect());
                break;
            case "DefBottle":
                realBottle = new DefBottle(bottle.getName(), bottle.getType(), bottle.getEffect());
                break;
            case "ManaBottle":
                realBottle = new ManaBottle(bottle.getName(), bottle.getType(), bottle.getEffect());
                break;
            default:
                break;
        }
        this.bottles.add(realBottle);
    }

    public void addEquipment(Equipment equipment) {
        this.equipments.add(equipment);
    }

    public String removeBottle(String name) {
        for (int i = 0; i < bottles.size(); i++) {
            if (bottles.get(i).getName().equals(name)) {
                String type = bottles.get(i).getType();
                bottles.remove(i);
                return type;
            }
        }
        return null;
    }

    public void learnSpell(Spell spell) {
        this.spells.add(spell);
    }

    public int getBottleCount() {
        return bottles.size();
    }

    public int getSpellCount() {
        return spells.size();
    }

    public String removeEquipment(String name) {
        for (int i = 0; i < equipments.size(); i++) {
            if (equipments.get(i).getName().equals(name)) {
                equipments.remove(i);
                return "Equipment";
            }
        }
        return null;
    }

    public int getEquipmentCount() {
        return equipments.size();
    }

    public String takeBottle(String name) {
        for (Bottle bottle : bottles) {
            if (bottle.getName().equals(name)) {
                bottle.setUsable(true);
                return bottle.getType();
            }
        }
        return null;
    }

    public  String takeEquipment(String name) {
        for (Equipment equipment : equipments) {
            if (equipment.getName().equals(name)) {
                equipment.setUsable(true);
                return "Equipment";
            }
        }
        return null;
    }

    public Adventurer use(String name, Adventurer target) {
        for (Bottle bottle : bottles) {
            if (bottle.getName().equals(name)) {
                bottle.use(this,target);
                bottles.remove(bottle);
                return target;
            }
        }
        for (Spell spell : spells) {
            if (spell.getId().equals(name)) {
                if (this.mana >= spell.getManaCost()) {
                    spell.use(target);
                    this.mana -= spell.getManaCost();
                    System.out.println(target.name + " " + target.hitPoint + " " +
                                       target.atk + " " + target.def + " " + target.mana
                    );
                }
                else {
                    System.out.println(this.name + " fail to use " + name);
                }
                return target;
            }
        }
        return target;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public int getAtk() {
        return atk;
    }

    public int getMana() {
        return mana;
    }

    public int getDef() {
        return def;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}