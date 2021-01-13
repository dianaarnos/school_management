package school.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
     * Creates a new teacher object
     * @param id teacher's unique id
     * @param name teacher's name
     * @param salary teacher's salary
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
