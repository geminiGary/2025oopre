public class HpBottle extends Bottle {
    public HpBottle(String name, String type, int effect) {
        super(name, type, effect);
    }

    @Override
    public void use(Adventurer user, Adventurer target) {
        if (!isUsable()) {
            System.out.println(user.getName() + " fail to use " + getName());
        }
        else {
            int heal = getEffect();
            target.setHitPoint(target.getHitPoint() + heal);
            System.out.println(target.getName() + " " + target.getHitPoint() + " " +
                               target.getAtk() + " " + target.getDef() + " " + target.getMana());
        }
    }
}
