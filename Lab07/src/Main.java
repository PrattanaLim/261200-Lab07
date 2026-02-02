public class Main{
    public static void main(String[] args){
        Character Tim = new Character();
        Tim.printStatus();
        for(int i = 0;i<5;i++){
            Tim.swingSword();
        }
        Tim.takeDamage(30);
        Tim.takeDamage(50);
        Tim.takeDamage(20);
        Tim.rest();
    }
}
