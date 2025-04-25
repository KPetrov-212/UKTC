import java.util.ArrayList;
import java.util.List;

public class Castle extends DefenceStructure{
    private boolean drawbridge;
    private List<Warrior> defenders;
    private List<ArcherTower> towers;

    public Castle(String name, int health, boolean drawbridge) {
        super(name, health);
        this.defenders = new ArrayList<>();
        this.towers = new ArrayList<>();
        this.drawbridge = drawbridge;
    }

    public void addDefender(Warrior warrior) {
        this.defenders.add(warrior);
        System.out.println(warrior.getName() + " has joined the castle's defence!");
    }
    public void removeDefender(Warrior warrior) {
        this.defenders.remove(warrior);
        System.out.println(warrior.getName() + " has left the castle's defence!");
    }
    public void addTower(ArcherTower tower) {
        this.towers.add(tower);
        System.out.println(tower.getName() + " has been added to the castle's defence!");
    }
    public void removeTower(ArcherTower tower) {
        this.towers.remove(tower);
        System.out.println(tower.getName() + " has been removed from the castle's defence!");
    }
    
}