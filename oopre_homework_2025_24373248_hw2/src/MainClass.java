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
                    addBottle(input.next(),input.next(),input.nextInt());
                    break;
                case "ae":
                    addEquipment(input.next(),input.next());
                    break;
                case "rb":
                    removeBottle(input.next(),input.next());
                    break;
                case "re":
                    removeEquipment(input.next(),input.next());
                    break;
                default:
                    break;
            }
        }
    }

    private static void addAdventurer(Adventurer adventurer) {
        adventurers.add(adventurer);
    }

    private static void addBottle(String adventurerName,String name,int effect) {
        for (Adventurer adventurer:adventurers) {
            if (adventurer.getName().equals(adventurerName)) {
                adventurer.addBottle(new Bottle(name,effect));
                break;
            }
        }
    }

    private static void addEquipment(String adventurerName,String name) {
        for (Adventurer adventurer : adventurers) {
            if (adventurer.getName().equals(adventurerName)) {
                adventurer.addEquipment(new Equipment(name));
                break;
            }
        }
    }

    private static void removeBottle(String adventurerName,String name) {
        for (Adventurer adventurer:adventurers) {
            if (adventurer.getName().equals(adventurerName)) {
                Bottle bottle = adventurer.removeBottle(name);
                int count = adventurer.getBottleCount();
                System.out.println(count + " " + bottle.getEffect());
                break;
            }
        }
    }

    private static void removeEquipment(String adventurerName,String name) {
        for (Adventurer adventurer:adventurers) {
            if (adventurer.getName().equals(adventurerName)) {
                Equipment equipment = adventurer.removeEquipment(name);
                int count = adventurer.getEquipmentCount();
                System.out.println(count);
                break;
            }
        }
    }
}