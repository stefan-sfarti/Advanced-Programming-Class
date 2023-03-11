import java.util.HashSet;
import java.util.Set;

public class Person implements Node, Comparable<Person>{
    private String name;
    private int Id;
    private static Set<String> names = new HashSet<>();
    public String getNames(){
        return names.toString();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return Id;
    }

    public Person(String name, int Id) {
        if (names.contains(name)) {
            throw new IllegalArgumentException("Name already exists: " + name);
        }
        names.add(name);
        this.name = name;
        this.Id = Id;
    }

    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.getName());
    }
}
