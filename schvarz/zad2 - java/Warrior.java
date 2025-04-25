public class Warrior {
    private String name;
    private int health;
    private int attackPower;

    public Warrior(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getAttackPower() {
        return attackPower;
    }
    
    public void attack(DefenceStructure defenceStructure) {
        System.out.println(this.name + " is attacking " + defenceStructure.getName());
        defenceStructure.takeDamage(this.attackPower);
    }

    public void takeDamage(int damage) {
        health = Math.max(0, health - damage);
        System.out.println(this.name + " took " + damage + " damage. Remaining health: " + health);
    }
}