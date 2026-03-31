public interface Employee {
    void setEmployer(Adventurer employer);

    Adventurer getEmployer();

    boolean cure(Adventurer employer);

    Spell findBestHealSpell();
}
