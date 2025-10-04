package ua.ucu.apps.lab4;
import lombok.AllArgsConstructor;
import lombok.Data;
import ua.ucu.apps.strategy.KickStrategy;


@Data
@AllArgsConctructor
abstract public class Character {


    private int power;
    private int hp;
    private KickStrategy kickStrategy;

    public boolean isAlive(){
        return hp>0;
    }

    public void kick(Character enemy){
        kickStrategy.kick(this, enemy);
    };

    public Character(int power, int hp) {
        this.power = power;
        this.hp = power;
    }

    public void setKickStrategy(KickStrategy s) { this.kickStrategy = s; }

    public void setHp(int hp) { this.hp = Math.max(0, hp); }
    public void setPower(int power) { this.power = Math.max(0, power); }


}
