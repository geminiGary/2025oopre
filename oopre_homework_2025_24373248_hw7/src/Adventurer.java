import java.util.ArrayList;
import java.util.Objects;

import static java.lang.Math.ceil;
import static java.lang.Math.max;
import static java.lang.Math.sqrt;

public class Adventurer implements Employee, Employer {
    private final String name;
    private int hitPoint;
    private int atk;
    private int def;
    private int mana;
    private int money;
    private Armour armour;
    private Weapon weapon;
    private boolean needCure = false;
    private final ArrayList<Bottle> bottles = new ArrayList<>();
    private final ArrayList<Equipment> equipments = new ArrayList<>();
    private final ArrayList<Spell> spells = new ArrayList<>();
    private final ArrayList<Bottle> takenBottles = new ArrayList<>();
    private Adventurer employer = null;
    private final ArrayList<Adventurer> employees = new ArrayList<>();

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

    public void use(String name, Adventurer target) {
        for (Bottle bottle : bottles) {
            if (bottle.getName().equals(name)) {
                if (this.isMyAlly(target)) {
                    bottle.use(this,target);
                    if (bottle.isUsable()) {
                        takenBottles.remove(bottle);
                        bottles.remove(bottle);
                    }
                    return;
                }
                else {
                    System.out.println("That's not my ally");
                }
            }
        }
        for (Spell spell : spells) {
            if (spell.getId().equals(name)) {
                switch (spell.getType()) {
                    case "HealSpell":
                        if (this.isMyAlly(target)) {
                            useSpell(spell, target);
                        }
                        else {
                            System.out.println("That's not my ally");
                        }
                        break;
                    case "AttackSpell":
                        if (!this.isMyBoss(target)) {
                            useSpell(spell, target);
                        }
                        else {
                            System.out.println("That's my boss!");
                        }
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public void useSpell(Spell spell, Adventurer target) {
        if (this.mana >= spell.getManaCost()) {
            this.mana -= spell.getManaCost();
            int beforeHp = target.hitPoint;
            spell.use(target);
            System.out.println(target.name + " " + target.hitPoint + " " +
                    target.atk + " " + target.def + " " + target.mana
            );
            if (!target.isAlive()) {
                target.removeAllRelation();
                this.money += target.getMoney();
                for (Bottle bottle : target.bottles) {
                    this.money += bottle.getEffect();
                }
                for (Equipment equipment : target.equipments) {
                    this.money += equipment.getCE();
                }
            }
            else if (Math.floorDiv(beforeHp, 2) >= target.hitPoint) {
                target.beCured();
            }
        }
        else {
            System.out.println(this.name + " fail to use " + spell.getId());
        }
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
        } else if (equipment != null) {
            this.addEquipment(equipment);
            this.money -= effect;
        }
        System.out.println(this.money);
    }

    public void fight(ArrayList<Adventurer> opponents) {
        for (Adventurer opponent : opponents) {
            if (this.isMyBoss(opponent)) {
                System.out.println("That's my boss!");
                return;
            }
        }
        if (this.weapon == null || Objects.equals(this.weapon.getType(), "Sword")) {
            int def = 0;
            for (Adventurer adventurer : opponents) {
                def = max(def, adventurer.getFightDef());
            }
            if (this.getFightAtk() > def) {
                int damage = this.getFightAtk() - def;
                fightSuccess(opponents, damage);
            }
            else {
                System.out.println("Adventurer " + this.name + " defeated");
            }
        }
        else if (Objects.equals(this.weapon.getType(), "Magicbook")) {
            int damage = this.getFightAtk();
            int manaCost = (int) ceil(sqrt(this.weapon.getCE()));
            if (this.mana >= manaCost) {
                this.mana -= manaCost;
                fightSuccess(opponents, damage);
            } else {
                System.out.println("Adventurer " + this.name + " defeated");
            }
        }
    }

    private void fightSuccess(ArrayList<Adventurer> opponents, int damage) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Adventurer adventurer : opponents) {
            int beforeHp = adventurer.getHitPoint();
            adventurer.setHitPoint(max(0, adventurer.getHitPoint() - damage));
            if (!adventurer.isAlive()) {
                adventurer.removeAllRelation();
                this.money += adventurer.getMoney();
                for (Bottle bottle : adventurer.bottles) {
                    this.money += bottle.getEffect();
                }
                for (Equipment equipment : adventurer.equipments) {
                    this.money += equipment.getCE();
                }
            }
            else if (Math.floorDiv(beforeHp, 2) >= adventurer.getHitPoint()) {
                adventurer.needCure = true;
            }
            if (stringBuilder.length() > 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(adventurer.getHitPoint());
        }
        System.out.println(stringBuilder);
        for (Adventurer adventurer : opponents) {
            if (adventurer.needCure) {
                adventurer.beCured();
                adventurer.needCure = false;
            }
        }
    }

    private int getFightDef() {
        return (this.armour != null) ? this.def + this.armour.getCE() : this.def;
    }

    private int getFightAtk() {
        return (this.weapon != null) ? this.atk + this.weapon.getCE() : this.atk;
    }

    @Override
    public void setEmployer(Adventurer employer) {
        this.employer = employer;
    }

    public Adventurer getEmployer() {
        return this.employer;
    }

    @Override
    public void addRelation(Adventurer advTarget) {
        advTarget.setEmployer(this);
        this.employees.add(advTarget);
    }

    @Override
    public void removeRelation(Adventurer advTarget) {
        advTarget.setEmployer(null);
        this.employees.remove(advTarget);
    }

    @Override
    public ArrayList<Adventurer> getAllEmployees()  {
        ArrayList<Adventurer> result = new ArrayList<>();
        java.util.Deque<Adventurer> stack = new java.util.ArrayDeque<>(this.employees);
        java.util.Set<Adventurer> visited = new java.util.HashSet<>();
        while (!stack.isEmpty()) {
            Adventurer a = stack.pop();
            if (visited.add(a)) {
                result.add(a);
                for (Adventurer sub : a.employees) {
                    stack.push(sub);
                }
            }
        }
        return result;
    }

    @Override
    public void beCured() {
        int cureCount = 0;
        ArrayList<Adventurer> allEmployees = this.getAllEmployees();
        for (Adventurer adventurer : allEmployees) {
            boolean isSuccess = adventurer.cure(this);
            if (isSuccess) {
                cureCount++;
            }
        }
        if (cureCount == 0) {
            return;
        }
        System.out.println(this.name + " is helped by " + cureCount +
                " adventurer(s), now Hp is " + this.hitPoint);
    }

    @Override
    public boolean cure(Adventurer target) {
        Spell spell = this.findBestHealSpell();
        if (spell != null) {
            target.setHitPoint(target.getHitPoint() + spell.getPower());
            this.mana -= spell.getManaCost();
            return true;
        }
        return false;
    }

    @Override
    public Spell findBestHealSpell() {
        Spell bestSpell = null;
        for (Spell spell : this.spells) {
            if (Objects.equals(spell.getType(), "HealSpell")) {
                if (this.mana >= spell.getManaCost()) {
                    if (bestSpell == null || spell.getPower() > bestSpell.getPower()) {
                        bestSpell = spell;
                    }
                    else if (spell.getPower() == bestSpell.getPower()) {
                        if (spell.getManaCost() < bestSpell.getManaCost()) {
                            bestSpell = spell;
                        }
                    }
                }
            }
        }
        return bestSpell;
    }

    public boolean isMyBoss(Adventurer target) {
        if (this.employer == target) {
            return true;
        }
        else if (this.employer == null) {
            return false;
        }
        else {
            return this.employer.isMyBoss(target);
        }
    }

    public boolean isMyAlly(Adventurer target) {
        if (this == target) {
            return true;
        }
        else if (this.isMyBoss(target)) {
            return true;
        }
        return target.isMyBoss(this);
    }

    public void removeAllRelation() {
        if (this.employer != null) {
            this.employer.employees.remove(this);
            this.employer = null;
        }
        for (Adventurer advTarget : this.employees) {
            advTarget.setEmployer(null);
        }
        this.employees.clear();
    }
}