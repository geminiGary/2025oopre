import org.junit.Test;

import static org.junit.Assert.*;

public class SpellTest {

    @Test
    public void getId() {
        Spell spell = new Spell("Fireball", "AttackSpell", 10, 50);
        assertEquals("Fireball", spell.getId());
    }

    @Test
    public void getType() {
        Spell spell = new Spell("Fireball", "AttackSpell", 10, 50);
        assertEquals("AttackSpell", spell.getType());
    }

    @Test
    public void getManaCost() {
        Spell spell = new Spell("Fireball", "AttackSpell", 10, 50);
        assertEquals(10, spell.getManaCost());
    }

    @Test
    public void getPower() {
        Spell spell = new Spell("Fireball", "AttackSpell", 10, 50);
        assertEquals(50, spell.getPower());
    }

    @Test
    public void use() {
        Adventurer target = new Adventurer("Target");
        target.setHitPoint(100);
        Spell spell = new Spell("Fireball", "AttackSpell", 10, 50);
        spell.use(target);
        assertEquals(50, target.getHitPoint());
        Spell healSpell = new Spell("Heal", "HealSpell", 5, 30);
        healSpell.use(target);
        assertEquals(80, target.getHitPoint());
        Spell overAttackSpell = new Spell("BigAttack", "AttackSpell", 5, 100);
        overAttackSpell.use(target);
        assertEquals(0, target.getHitPoint());
        Spell overHealSpell = new Spell("BigHeal", "HealSpell", 5, 200);
        overHealSpell.use(target);
        assertEquals(200, target.getHitPoint());
    }
}