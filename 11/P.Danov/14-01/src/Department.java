import java.util.List;

public class Department {
    private String name;
    private String manager;
    private List<String> workers;

    public Department(String name, String manager, List<String> workers) {
        this.name = name;
        this.manager = manager;
        this.workers = workers;
    }

    public String getName() {
        return name;
    }

    public String getManager() {
        return manager;
    }

    public List<String> getWorkers() {
        return workers;
    }

    @Override
    public String toString() {
        return "Department: " + name + ", Manager: " + manager + ", Workers: " + workers;
    }
}
