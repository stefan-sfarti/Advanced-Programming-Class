public class Company implements Node, Comparable<Company>{
    private String name;
    private int Id;

    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return Id;
    }

    public Company(String name, int Id) {
        this.name = name;
        this.Id = Id;
    }

    @Override
    public int compareTo(Company c) {
        return this.name.compareTo(c.getName());
    }
}
