import java.util.ArrayList;
import java.util.Objects;

import static java.lang.Math.ceil;
import static java.lang.Math.max;
import static java.lang.Math.sqrt;

public class Adventurer {
    private final String name;
    private int hitPoint;
    private int atk;
    private int def;
    private int mana;
    private int money;
    private Armour armour;
    private Weapon weapon;
    private final ArrayList<Bottle> bottles = new ArrayList<>();
    private final ArrayList<Equipment> equipments = new ArrayList<>();
    private final ArrayList<Spell> spells = new ArrayList<>();
    private final ArrayList<Bottle> takenBottles = new ArrayList<>();

    public Adventurer(String name) {
        this.name = name;
        this.hitPoint = 500;
        this.atk = 1;
        this.def = 0;
        this.mana = 10;
        this.money = 50;
        this.armour = null;
        this.weapon = null;
    }

    public boolean isAlive() {
        return hitPoint > 0;
    }

    public String getName() {
        return name;
    }

    public void addBottle(Bottle bottle) {
        Bottle realBottle = null;
        switch (bottle.getType()) {
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
        Equipment realEquipment = null;
        switch (equipment.getType()) {
            case "Armour":
                realEquipment = new Armour(equipment.getName(), equipment.getType(),
                        equipment.getCE());
                break;
            case "Sword":
            case "Magicbook":
                realEquipment = new Weapon(equipment.getName(), equipment.getType(),
                        equipment.getCE());
                break;
            default:
                break;
        }
        this.equipments.add(realEquipment);
    }

    public String removeBottle(String name) {
        for (int i = 0; i < takenBottles.size(); i++) {
            if (takenBottles.get(i).getName().equals(name)) {
                takenBottles.remove(i);
                break;
            }
        }
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

    public String removeEquipment(String name) {
        String type = null;
        for (int i = 0; i < equipments.size(); i++) {
            if (equipments.get(i).getName().equals(name)) {
                type = equipments.get(i).getType();
                equipments.remove(i);
                break;
            }
        }
        if (this.armour == null || this.armour.getName().equals(name)) {
            this.armour = null;
        }
        if (this.weapon == null || this.weapon.getName().equals(name)) {
            this.weapon = null;
        }
        return type;
    }

    public String takeBottle(String name) {
        for (Bottle bottle : bottles) {
            if (bottle.getName().equals(name)) {
                if (!takenBottles.contains(bottle)) {
                    takenBottles.add(bottle);
                    if (takenBottles.size() > 10) {
                        takenBottles.get(0).setUsable(false);
                        takenBottles.remove(0);
                    }
                }
                bottle.setUsable(true);
                return bottle.getType();
            }
        }
        return null;
    }

    public String takeEquipment(String name) {
        for (Equipment equipment : equipments) {
            if (equipment.getName().equals(name)) {
                switch (equipment.getType()) {
                    case "Armour":
                        Armour armour = (Armour) equipment;
                        if (this.armour != null)
                        {
                            this.armour.setUsable(false);
                        }
                        this.armour = armour;
                        break;
                    case "Sword":
                    case "Magicbook":
                        Weapon weapon = (Weapon) equipment;
                        if (this.weapon != null)
                        {
                            this.weapon.setUsable(false);
                        }
                        this.weapon = weapon;
                        break;
                    default:
                        break;
                }
                equipment.setUsable(true);
                return equipment.getType();
            }
        }
        return null;
    }

    public Adventurer use(String name, Adventurer target) {
        for (Bottle bottle : bottles) {
            if (bottle.getName().equals(name)) {
                bottle.use(this,target);
                if (bottle.isUsable()) {
                    takenBottles.remove(bottle);
                    bottles.remove(bottle);
                }
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
                    if (!target.isAlive()) {
                        this.money += target.getMoney();
                        for (Bottle bottle : target.bottles) {
                            this.money += bottle.getEffect();
                        }
                        for (Equipment equipment : target.equipments) {
                            this.money += equipment.getCE();
                        }
                    }
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

    public int getMoney() {
        return money;
    }

    public void buyItem(String name, String type) {
        int effect = Math.min(100, this.money);
        Bottle bottle = Factory.createBottle(type, name, effect);
        Equipment equipment = Factory.createEquipment(type, name, effect);
        if (bottle != null) {
            this.addBottle(bottle);
            this.money -= effect;
            //System.out.println(bottle.getName() + " " + bottle.getType());
        } else if (equipment != null) {
            this.addEquipment(equipment);
            this.money -= effect;
            //System.out.println(equipment.getName() + " " + equipment.getType());
        }
        System.out.println(this.money);
    }

    public void fight(ArrayList<Adventurer> opponents) {
        //System.out.println(this.weapon.getName());
        if (this.weapon == null || Objects.equals(this.weapon.getType(), "Sword")) {
            int def = 0;
            for (Adventurer adventurer : opponents) {
                def = max(def, adventurer.getFightDef());
            }
            if (this.getFightAtk() > def) {
                int damage = this.getFightAtk() - def;
                StringBuilder stringBuilder = new StringBuilder();
                for (Adventurer adventurer : opponents) {
                    adventurer.setHitPoint(max(0, adventurer.getHitPoint() - damage));
                    if (!adventurer.isAlive()) {
                        this.money += adventurer.getMoney();
                        for (Bottle bottle : adventurer.bottles) {
                            this.money += bottle.getEffect();
                        }
                        for (Equipment equipment : adventurer.equipments) {
                            this.money += equipment.getCE();
                        }
                    }
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(" ");
                    }
                    stringBuilder.append(adventurer.getHitPoint());
                }
                System.out.println(stringBuilder);
            }
            else {
                System.out.println("Adventurer " + this.name + " defeated");
            }
        }
        else if (Objects.equals(this.weapon.getType(), "Magicbook")) {
            int damage = this.getFightAtk();
            int manaCost = (int) ceil(sqrt(this.weapon.getCE()));
            //System.out.println(manaCost);
            if (this.mana >= manaCost) {
                this.mana -= manaCost;
                StringBuilder sb = new StringBuilder();
                for (Adventurer adventurer : opponents) {
                    adventurer.setHitPoint(max(0, adventurer.getHitPoint() - damage));
                    if (!adventurer.isAlive()) {
                        this.money += adventurer.getMoney();
                        for (Bottle bottle : adventurer.bottles) {
                            this.money += bottle.getEffect();
                        }
                        for (Equipment equipment : adventurer.equipments) {
                            this.money += equipment.getCE();
                        }
                    }
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(adventurer.getHitPoint());
                }
                System.out.println(sb);
            } else {
                System.out.println("Adventurer " + this.name + " defeated");
            }
        }
    }

    private int getFightDef() {
        return (this.armour != null) ? this.def + this.armour.getCE() : this.def;
    }

    private int getFightAtk() {
        return (this.weapon != null) ? this.atk + this.weapon.getCE() : this.atk;
    }
}