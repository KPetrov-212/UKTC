public class ArcherTower extends DefenceStructure {
    private int range;

    public ArcherTower(String name, int health, int range) {
        super(name, health);
        this.range = range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    public void defend(Castle castle) {
        System.out.println(this.getName() + " is defending " + castle.getName());
    }

}
