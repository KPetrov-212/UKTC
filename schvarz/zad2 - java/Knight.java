public class Knight extends Warrior {
    private int armor;
    private String weapon;

    public Knight(String name, int health, int attackPower, String weapon) {
        super(name, health, attackPower);
        if (isWeaponValid(weapon)){
            this.weapon = weapon;
        }else{
            throw new IllegalArgumentException("Invalid weapon type! Choose -> [sword/axe/spear]");
        }
        
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {
        if (isWeaponValid(weapon)) {
            this.weapon = weapon;
        } else {
            throw new IllegalArgumentException("Invalid weapon type! Choose -> [sword/axe/spear]");
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (armor > 0) {
            int remainingDamage = damage - armor;
            armor = Math.max(0, armor - damage);
            System.out.println(this.getName() + "'s armor absorbed " + damage + " damage. Remaining armor: " + armor);
            if (remainingDamage > 0) {
                super.takeDamage(remainingDamage);
            }
        } else {
            super.takeDamage(damage);
        }
    }

    private boolean isWeaponValid(String weapon) {
        return weapon.equalsIgnoreCase("sword") || weapon.equalsIgnoreCase("axe") || weapon.equalsIgnoreCase("spear");
    }

    public void defend(Castle castle){
        if (this.getArmor() > 50){
            System.out.println(this.getName() + " stands strong at the gates of " + castle.getName());
        }else{
            System.out.println(this.getName() + " is defending " + castle.getName());
        }
    }

    public void fight(Warrior warrior) {
        System.out.println(this.getName() + " is fighting " + warrior.getName());
        warrior.takeDamage(this.getAttackPower());
    
        if (warrior.getHealth() <= 0) {
            System.out.println("Victory!");
        } else {
            this.takeDamage(warrior.getAttackPower());
            if (this.getHealth() <= 0) {
                System.out.println("Defeat!");
            }
        }
    }
}