package lotr;

@AllArgsConctructor
abstract public class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;

    public boolean isAlive(){
        return hp > 0;
    }

    public void kick(Character enemy){
        kickStrategy.kick(this, enemy);
    };

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public void setKickStrategy(KickStrategy s) { this.kickStrategy = s; }

    public void setHp(int hp) { this.hp = Math.max(0, hp); }
    public void setPower(int power) { this.power = Math.max(0, power); }
    public int getPower() {return this.power;}
    public int getHp() {return this.hp;}

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + Integer.toString(hp) + ", power=" +
            Integer.toString(power) + "}";
    }
}
