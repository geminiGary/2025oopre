import java.util.ArrayList;
import java.util.Objects;

public class Parser {
    private final Lexer lexer;
    //private final ArrayList<Adventurer> adventurers;
    //private ArrayList<Node> nodes = new ArrayList<>();

    public Parser(Lexer lexer) {
        this.lexer = lexer;
    }

    public void parse() {
        while (lexer.peek() != null) {
            parseAdventurer();
        }
    }

    public String parseAdventurer() {
        String adventureName = lexer.peek();
        if (adventureName != null) {
            lexer.next();
            if (lexer.peek() != null) {
                parseEmployee(adventureName);
            }
        }
        return adventureName;
    }

    public void parseEmployee(String adventureName) {
        if (Objects.equals(lexer.peek(), "(")) {
            lexer.next();
            ArrayList<String> employees = parseAdventurerList();
            for (String employee : employees) {
                MainClass.addRelation(adventureName, employee);
            }
            lexer.next();
        }
    }

    public ArrayList<String> parseAdventurerList() {
        ArrayList<String> employees = new ArrayList<>();
        String employeeName = parseAdventurer();
        employees.add(employeeName);
        while (Objects.equals(lexer.peek(), ",")) {
            lexer.next();
            employeeName = parseAdventurer();
            employees.add(employeeName);
        }
        return employees;
    }

}
