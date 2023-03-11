public class Person implements Node, Comparable<Person>{
    private String name;
    private int Id;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return Id;
    }

    public Person(String name, int Id) {
        this.name = name;
    }

    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.getName());
    }
}
