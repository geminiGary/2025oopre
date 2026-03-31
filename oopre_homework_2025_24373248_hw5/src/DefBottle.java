public class DefBottle extends Bottle {
    public DefBottle(String name, String type, int effect) {
        super(name, type, effect);
    }

    @Override
    public void use(Adventurer user, Adventurer target) {
        if (!isUsable()) {
            System.out.println(user.getName() + " fail to use " + getName());
        }
        else {
            int increase = getEffect();
            target.setDef(target.getDef() + increase);
            System.out.println(target.getName() + " " + target.getHitPoint() + " " +
                               target.getAtk() + " " + target.getDef() + " " + target.getMana());
        }
    }
}
