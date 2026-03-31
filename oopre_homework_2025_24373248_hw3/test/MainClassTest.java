import org.junit.Test;

import static org.junit.Assert.*;

public class MainClassTest {

    @Test
    public void addAdventurer() {
        Adventurer adventurer = new Adventurer("Hero");
        MainClass.addAdventurer(adventurer);
    }

    @Test
    public void addBottle() {
        Adventurer adventurer = new Adventurer("Hero1");
        MainClass.addAdventurer(adventurer);
        MainClass.addBottle("Hero1", "HealthPotion", "Heal", 50);
        assertEquals(1, adventurer.getBottleCount());
    }

    @Test
    public void addEquipment() {
        Adventurer adventurer = new Adventurer("Hero2");
        MainClass.addAdventurer(adventurer);
        MainClass.addEquipment("Hero2", "Sword");
        assertEquals(1, adventurer.getEquipmentCount());
    }

    @Test
    public void learnSpell() {
        Adventurer adventurer = new Adventurer("Hero3");
        MainClass.addAdventurer(adventurer);
        MainClass.learnSpell("Hero3", "Fireball", "Fire", 5, 100);
        assertEquals(1, adventurer.getSpellCount());
    }

    @Test
    public void removeItem() {
        Adventurer adventurer = new Adventurer("Hero4");
        MainClass.addAdventurer(adventurer);
        MainClass.addBottle("Hero4", "HealthPotion", "Heal", 50);
        assertEquals(1,adventurer.getBottleCount());
        MainClass.removeItem("Hero4", "HealthPotion");
        assertEquals(0,adventurer.getBottleCount());
        MainClass.addEquipment("Hero4", "Sword");
        assertEquals(1,adventurer.getEquipmentCount());
        MainClass.removeItem("Hero4", "Sword");
        assertEquals(0,adventurer.getEquipmentCount());
    }

    @Test
    public void takeItem() {
        Adventurer adventurer = new Adventurer("Hero5");
        MainClass.addAdventurer(adventurer);
        MainClass.addBottle("Hero5", "HealthPotion", "HpBottle", 50);
        MainClass.takeItem("Hero5", "HealthPotion");
        MainClass.addEquipment("Hero5", "Sword");
        MainClass.takeItem("Hero5", "Sword");
    }

    @Test
    public void use() {
        Adventurer adventurer = new Adventurer("Hero6");
        MainClass.addAdventurer(adventurer);
        MainClass.addBottle("Hero6", "HealthPotion", "HpBottle", 50);
        assertEquals(500,adventurer.getHitPoint());
        MainClass.use("Hero6", "HealthPotion", "Hero6");
        assertEquals(500,adventurer.getHitPoint());
        MainClass.takeItem("Hero6", "HealthPotion");
        MainClass.use("Hero6", "HealthPotion", "Hero6");
        assertEquals(550,adventurer.getHitPoint());
        MainClass.learnSpell("Hero6", "Fireball", "AttackSpell", 5, 100);
        MainClass.use("Hero6", "Fireball", "Hero6");
        assertEquals(450,adventurer.getHitPoint());
        adventurer.setHitPoint(50);
        MainClass.use("Hero6", "Fireball", "Hero6");
        assertEquals(0,adventurer.getHitPoint());
    }
}