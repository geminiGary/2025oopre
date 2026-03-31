import org.junit.Test;

import static org.junit.Assert.*;

public class BottleTest {

    @Test
    public void getName() {
        Bottle bottle=new Bottle("HealthPotion", "Heal", 50);
        assertEquals("HealthPotion", bottle.getName());
    }

    @Test
    public void getEffect() {
        Bottle bottle=new Bottle("HealthPotion", "Heal", 50);
        assertEquals(50, bottle.getEffect());
    }

    @Test
    public void getType() {
        Bottle bottle=new Bottle("HealthPotion", "Heal", 50);
        assertEquals("Heal", bottle.getType());
    }

    @Test
    public void isUsable() {
        Bottle bottle=new Bottle("HealthPotion", "Heal", 50);
        assertFalse(bottle.isUsable());
        bottle.setUsable(true);
        assertTrue(bottle.isUsable());
    }

    @Test
    public void setUsable() {
        Bottle bottle=new Bottle("HealthPotion", "Heal", 50);
        assertFalse(bottle.isUsable());
        bottle.setUsable(true);
        assertTrue(bottle.isUsable());
    }

    @Test
    public void AtkBottle() {
        AtkBottle bottle=new AtkBottle("HealthPotion", "AttackBottle", 50);
        assertEquals("HealthPotion", bottle.getName());
        assertEquals("AttackBottle", bottle.getType());
        assertEquals(50, bottle.getEffect());
        assertFalse(bottle.isUsable());
    }

    @Test
    public void DefBottle() {
        DefBottle bottle=new DefBottle("HealthPotion", "DefBottle", 50);
        assertEquals("HealthPotion", bottle.getName());
        assertEquals("DefBottle", bottle.getType());
        assertEquals(50, bottle.getEffect());
        assertFalse(bottle.isUsable());
    }

    @Test
    public void HpBottle() {
        HpBottle bottle=new HpBottle("HealthPotion", "HpBottle", 50);
        assertEquals("HealthPotion", bottle.getName());
        assertEquals("HpBottle", bottle.getType());
        assertEquals(50, bottle.getEffect());
        assertFalse(bottle.isUsable());
    }

    @Test
    public void ManaBottle() {
        ManaBottle bottle=new ManaBottle("HealthPotion", "ManaBottle", 50);
        assertEquals("HealthPotion", bottle.getName());
        assertEquals("ManaBottle", bottle.getType());
        assertEquals(50, bottle.getEffect());
        assertFalse(bottle.isUsable());
    }
}
