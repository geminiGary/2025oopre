import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    private static final ArrayList<Adventurer> adventurers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int a = 0;a < n;a++) {
            String type = input.next();
            switch (type) {
                case "aa":
                    addAdventurer(new Adventurer(input.next()));
                    break;
                case "ab":
                    addBottle(input.next(),input.next(),input.next(),input.nextInt());
                    break;
                case "ae":
                    addEquipment(input.next(),input.next(),input.next(),input.nextInt());
                    break;
                case "ls":
                    learnSpell(
                            input.next(),input.next(),input.next(),input.nextInt(),input.nextInt()
                    );
                    break;
                case "ri":
                    removeItem(input.next(),input.next());
                    break;
                case "ti":
                    takeItem(input.next(),input.next());
                    break;
                case "use":
                    use(input.next(),input.next(),input.next());
                    break;
                case "bi":
                    buyItem(input.next(),input.next(),input.next());
                    break;
                case "fight":
                    String adventurerName = input.next();
                    int k = input.nextInt();
                    ArrayList<Adventurer> opponents = new ArrayList<>();
                    for (int i = 0; i < k; i++) {
                        String opponentName = input.next();
                        for (Adventurer adv : adventurers) {
                            if (adv.getName().equals(opponentName)) {
                                opponents.add(adv);
                                break;
                            }
                        }
                    }
                    fight(adventurerName,opponents);
                    break;
                default:
                    break;
            }
        }
    }

    public static void addAdventurer(Adventurer adventurer) {
        adventurers.add(adventurer);
    }

    public static void addBottle(String adventurerName,String name,String type,int effect) {
        for (Adventurer adventurer:adventurers) {
            if (adventurer.getName().equals(adventurerName)) {
                if (adventurer.isAlive())
                {
                    adventurer.addBottle(new Bottle(name,type,effect));
                }
                else
                {
                    System.out.println(adventurerName + " is dead!");
                }
                break;
            }
        }
    }

    public static void addEquipment(String adventurerName,String name,String type,int ce) {
        for (Adventurer adventurer : adventurers) {
            if (adventurer.getName().equals(adventurerName)) {
                if (adventurer.isAlive())
                {
                    adventurer.addEquipment(new Equipment(name,type,ce));
                }
                else
                {
                    System.out.println(adventurerName + " is dead!");
                }
                break;
            }
        }
    }

    public static void learnSpell(
            String adventurerName,String name,String type,int manaCost,int power
    ) {
        for (Adventurer adventurer:adventurers) {
            if (adventurer.getName().equals(adventurerName)) {
                if (adventurer.isAlive())
                {
                    adventurer.learnSpell(new Spell(name,type,manaCost,power));
                }
                else
                {
                    System.out.println(adventurerName + " is dead!");
                }
                break;
            }
        }
    }

    public static void removeItem(String adventurerName,String name) {
        for (Adventurer adventurer:adventurers) {
            if (adventurer.getName().equals(adventurerName)) {
                if (adventurer.isAlive())
                {
                    String typeB = adventurer.removeBottle(name);
                    String typeE = adventurer.removeEquipment(name);
                    System.out.println((typeB == null) ? typeE : typeB);
                }
                else
                {
                    System.out.println(adventurerName + " is dead!");
                }
            }
        }
    }

    public static void takeItem(String adventurerName,String name) {
        for (Adventurer adventurer:adventurers) {
            if (adventurer.getName().equals(adventurerName)) {
                if (adventurer.isAlive())
                {
                    String typeB = adventurer.takeBottle(name);
                    String typeE = adventurer.takeEquipment(name);
                    System.out.println((typeB == null) ? typeE : typeB);
                }
                else
                {
                    System.out.println(adventurerName + " is dead!");
                }
            }
        }
    }

    public static void use(String adventurerName,String name,String target) {
        for (Adventurer adventurer:adventurers) {
            if (adventurer.getName().equals(adventurerName)) {
                if (adventurer.isAlive())
                {
                    for (Adventurer advTarget:adventurers) {
                        if (advTarget.getName().equals(target)) {
                            if (advTarget.isAlive())
                            {
                                adventurer.use(name,advTarget);
                            }
                            else
                            {
                                System.out.println(target + " is dead!");
                            }
                            break;
                        }
                    }
                }
                else
                {
                    System.out.println(adventurerName + " is dead!");
                }
            }
        }
    }

    public static void buyItem(String adventurerName,String name,String type) {
        for (Adventurer adventurer:adventurers) {
            if (adventurer.getName().equals(adventurerName)) {
                if (adventurer.isAlive())
                {
                    adventurer.buyItem(name,type);
                }
                else
                {
                    System.out.println(adventurerName + " is dead!");
                }
            }
        }
    }

    public static void fight(String adventurerName, ArrayList<Adventurer> opponents) {
        for (Adventurer adventurer:adventurers) {
            if (adventurer.getName().equals(adventurerName)) {
                if (adventurer.isAlive())
                {
                    adventurer.fight(opponents);
                }
                else
                {
                    System.out.println(adventurerName + " is dead!");
                }
            }
        }
    }

}