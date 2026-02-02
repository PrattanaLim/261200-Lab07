public class Attributes {
    private int health;
    private int stamina;
    private int maxHealth;
    private int maxStamina;

    public int getMaxHealth() {
        return 100;
    }

    public int getMaxStamina() {
        return 50;
    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public Attributes(){
        health = this.getMaxHealth();
        stamina = this.getMaxStamina();
    }

    public void printStatus(){
        System.out.println("Stamina : " + this.stamina);
        System.out.println("Health : " + this.health);
    }

    public void swingSword(){
        stamina -= 10;
        if(stamina<0){
            stamina=0;
        }
        System.out.println("Character swings the sword. Stamina is now " + this.stamina + ".");

        if(stamina == 0){
            System.out.println("Your character needs to cool down.");
        }

    }

    public void takeDamage(int damage){
        this.health -= damage;
        System.out.println("Character takes " + damage + " damage. Health is now " + this.health + ".");
        if(this.health<0){
            this.health=0;
        }
        if(this.health == 0){
            System.out.println("Character is dead.");
        }
    }

    public void rest(){
        this.health = this.getMaxHealth();
        this.stamina = this.getMaxStamina();
        System.out.println("Character has rested. Health and stamina restored to maximum.");
        System.out.println("Character's health: " + this.health +", stamina: "+this.stamina + ".");
    }

}
