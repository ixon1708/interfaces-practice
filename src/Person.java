public abstract class Person implements Identifiable, ComputerSupportable {

    private Long id;
    private String name;
    private Computer computer;

    public Person(Long id, String name, Computer computer) {
        this.id = id;
        this.name = name;
        this.computer = computer;
    }

    @Override
    public Computer getComputer() {
        return computer;
    }

    @Override
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}