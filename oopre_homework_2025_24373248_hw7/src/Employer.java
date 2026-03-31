import java.util.ArrayList;

public interface Employer {
    void addRelation(Adventurer target);

    void removeRelation(Adventurer target);

    void beCured();

    ArrayList<Adventurer> getAllEmployees();
}
