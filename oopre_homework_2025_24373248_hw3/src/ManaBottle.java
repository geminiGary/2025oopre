public class ManaBottle extends Bottle {
    public ManaBottle(String name, String type, int effect) {
        super(name, type, effect);
    }

    @Override
    public void use(Adventurer user, Adventurer target) {
        if (!isUsable()) {
            System.out.println(user.getName() + " fail to use " + getName());
        }
        else {
            int restore = getEffect();
            target.setMana(target.getMana() + restore);
            System.out.println(target.getName() + " " + target.getHitPoint() + " " +
                               target.getAtk() + " " + target.getDef() + " " + target.getMana());
        }
    }
}
