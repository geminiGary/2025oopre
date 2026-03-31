public class AtkBottle extends Bottle {
    public AtkBottle(String name, String type, int effect) {
        super(name, type, effect);
    }

    @Override
    public void use(Adventurer user, Adventurer target) {
        if (!isUsable()) {
            System.out.println(user.getName() + " fail to use " + getName());
        }
        else {
            int damage = getEffect();
            target.setAtk(target.getAtk() + damage);
            System.out.println(target.getName() + " " + target.getHitPoint() + " " +
                               target.getAtk() + " " + target.getDef() + " " + target.getMana());
        }
    }
}
