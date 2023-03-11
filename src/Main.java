import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String args[]) {

        Person p1 = new Person("Stefan", 1);
        Person p2 = new Person("Carina", 1);
        Company c1 = new Company("Amazon", 1);
        Company c2 = new Company("Alten", 2);

        List<Node> nodes = new ArrayList<>();
        nodes.add(p1);
        nodes.add(p2);
        nodes.add(c1);
        nodes.add(c2);

        for (Node node: nodes) {
            System.out.println(node.getName());
        }
    }
}
