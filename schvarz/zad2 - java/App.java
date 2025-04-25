public class App {
    public static void main(String[] args) {
        // castle
        Castle castle = new Castle("Winterfell", 1000, true);

        // warriors
        Warrior warrior1 = new Warrior("Jon Snow", 200, 50);
        Warrior warrior2 = new Warrior("Arya Stark", 150, 60);

        // knight
        Knight knight = new Knight("Brienne of Tarth", 300, 70, "sword");
        knight.setArmor(100);

        // archer tower
        ArcherTower tower = new ArcherTower("North Tower", 500, 300);

        // defenders
        castle.addDefender(warrior1);
        castle.addDefender(warrior2);
        castle.addDefender(knight);

        // Add the archer tower to the castle
        castle.addTower(tower);

        // Simulate some actions
        tower.defend(castle);
        knight.defend(castle);
        warrior1.attack(tower);
        knight.fight(warrior2);

        // Repair the castle
        castle.repair(200);

        // Simulate an attack on the castle
        DefenceStructure enemyCatapult = new DefenceStructure("Enemy Catapult", 300);
        enemyCatapult.attack(castle);
    }
}