public class DefenceStructure {
    private String name;
    private int health;

    public DefenceStructure(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }

    public void attack(DefenceStructure defenceStructure) {
        System.out.println(this.name + " is attacking " + defenceStructure.getName());
        defenceStructure.takeDamage(10);
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(this.name + " took " + damage + " DMG. Remaining health: " + this.health);
    }

    public void repair(int amount) {
        this.health += amount;
        System.out.println(this.name + " repaired " + amount + " HP. Current health: " + this.health);
    }
}