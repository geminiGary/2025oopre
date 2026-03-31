import static org.junit.Assert.*;

public class AdventurerTest {

    @org.junit.Test
    public void isAlive() {
        Adventurer adventurer = new Adventurer("Hero");
        assertTrue(adventurer.isAlive());
        adventurer.setHitPoint(0);
        assertFalse(adventurer.isAlive());
    }

    @org.junit.Test
    public void getName() {
        Adventurer adventurer = new Adventurer("Hero");
        assertEquals("Hero", adventurer.getName());
    }

    @org.junit.Test
    public void addBottle() {
        Adventurer adventurer = new Adventurer("Hero");
        Bottle bottle = new Bottle("HealthPotion", "Heal", 50);
        adventurer.addBottle(bottle);
        assertEquals(1, adventurer.getBottleCount());
    }

    @org.junit.Test
    public void addEquipment() {
        Adventurer adventurer = new Adventurer("Hero");
        Equipment equipment = new Equipment("Sword");
        adventurer.addEquipment(equipment);
        assertEquals(1, adventurer.getEquipmentCount());
    }

    @org.junit.Test
    public void removeBottle() {
        Adventurer adventurer = new Adventurer("Hero");
        Bottle bottle = new Bottle("HealthPotion", "Heal", 50);
        adventurer.addBottle(bottle);
        String type = adventurer.removeBottle("HealthPotion");
        assertEquals("Heal", type);
        assertEquals(0, adventurer.getBottleCount());
    }

    @org.junit.Test
    public void learnSpell() {
        Adventurer adventurer = new Adventurer("Hero");
        Spell spell = new Spell("Fireball", "Fire", 5, 100);
        adventurer.learnSpell(spell);
        // Assuming there's a method to get spell count or list
        assertEquals(1, adventurer.getSpellCount());
    }

    @org.junit.Test
    public void getBottleCount() {
        Adventurer adventurer = new Adventurer("Hero");
        assertEquals(0, adventurer.getBottleCount());
        adventurer.addBottle(new Bottle("HealthPotion", "Heal", 50));
        assertEquals(1, adventurer.getBottleCount());
    }

    @org.junit.Test
    public void removeEquipment() {
        Adventurer adventurer = new Adventurer("Hero");
        Equipment equipment = new Equipment("Sword");
        adventurer.addEquipment(equipment);
        String type = adventurer.removeEquipment("Sword");
        assertEquals("Equipment", type);
        assertEquals(0, adventurer.getEquipmentCount());
    }

    @org.junit.Test
    public void getEquipmentCount() {
        Adventurer adventurer = new Adventurer("Hero");
        assertEquals(0, adventurer.getEquipmentCount());
        adventurer.addEquipment(new Equipment("Sword"));
        assertEquals(1, adventurer.getEquipmentCount());
    }

    @org.junit.Test
    public void takeBottle() {
        Adventurer adventurer = new Adventurer("Hero");
        Bottle bottle = new Bottle("HealthPotion", "Heal", 50);
        adventurer.addBottle(bottle);
        assertFalse(bottle.isUsable());
        String type = adventurer.takeBottle("HealthPotion");
        assertTrue(bottle.isUsable());
        assertEquals("Heal", type);
    }

    @org.junit.Test
    public void takeEquipment() {
        Adventurer adventurer = new Adventurer("Hero");
        Equipment equipment = new Equipment("Sword");
        adventurer.addEquipment(equipment);
        assertFalse(equipment.isUsable());
        String type = adventurer.takeEquipment("Sword");
        assertTrue(equipment.isUsable());
        assertEquals("Equipment", type);
    }

    @org.junit.Test
    public void use() {
        Adventurer adventurer = new Adventurer("Hero");
        Adventurer target = new Adventurer("Monster");
        Bottle bottle = new Bottle("HealthPotion", "HpBottle", 50);
        Bottle bottle2 = new Bottle("AttackBottle", "AtkBottle", 400);
        Bottle bottle3 = new Bottle("ManaPotion", "ManaBottle", 30);
        Bottle bottle4 = new Bottle("RevivePotion", "DefBottle", 100);
        adventurer.addBottle(bottle);
        adventurer.addBottle(bottle2);
        adventurer.addBottle(bottle3);
        adventurer.addBottle(bottle4);
        adventurer.use("HealthPotion", target);
        assertEquals(500, target.getHitPoint());
        adventurer.takeBottle("HealthPotion");
        adventurer.takeBottle("AttackBottle");
        adventurer.takeBottle("ManaPotion");
        adventurer.takeBottle("RevivePotion");
        target.setHitPoint(100);
        adventurer.use("HealthPotion", target);
        adventurer.use("AttackBottle", target);
        adventurer.use("ManaPotion", target);
        adventurer.use("RevivePotion", target);
        assertEquals(150, target.getHitPoint());
        assertEquals(401, target.getAtk());
        assertEquals(40, target.getMana());
        assertEquals(100, target.getDef());
        Spell spell = new Spell("Fireball", "AttackSpell", 5, 100);
        adventurer.learnSpell(spell);
        adventurer.use("Fireball", target);
        assertEquals(5, adventurer.getMana());
        assertEquals(50, target.getHitPoint());
        adventurer.use("Fireball", target);
        assertEquals(0, adventurer.getMana());
        assertEquals(0, target.getHitPoint());
        Spell spell2 = new Spell("Waterfall", "HealSpell", 10, 100);
        adventurer.learnSpell(spell2);
        adventurer.use("Waterfall", target);
        assertEquals(0, adventurer.getMana());
        assertEquals(0, target.getHitPoint());
        Spell spell3 = new Spell("ReviveSpell", "HealSpell", 0, 100);
        adventurer.learnSpell(spell3);
        adventurer.use("ReviveSpell", target);
        assertEquals(100, target.getHitPoint());
        assertEquals(0, adventurer.getMana());
    }

    @org.junit.Test
    public void setHitPoint() {
        Adventurer adventurer = new Adventurer("Hero");
        adventurer.setHitPoint(200);
        assertEquals(200, adventurer.getHitPoint());
    }

    @org.junit.Test
    public void getHitPoint() {
        Adventurer adventurer = new Adventurer("Hero");
        assertEquals(500, adventurer.getHitPoint());
    }

    @org.junit.Test
    public void getAtk() {
        Adventurer adventurer = new Adventurer("Hero");
        assertEquals(1, adventurer.getAtk());
    }

    @org.junit.Test
    public void getDef() {
        Adventurer adventurer = new Adventurer("Hero");
        assertEquals(0, adventurer.getDef());
    }

    @org.junit.Test
    public void getMana() {
        Adventurer adventurer = new Adventurer("Hero");
        assertEquals(10, adventurer.getMana());
    }
}