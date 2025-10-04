package lotr;

public class Elf extends Character{
    public Elf(){
        super(10, 10);
        setKickStrategy(new ElfKickStrategy());
    }

    // @Override
    // public void kick(Character enemy){
        
        // if (this.getHp()-enemy.getHp()>0){
        //     enemy.setHp(0);;}
        // else{
        //     enemy.setPower(enemy.getPower()-1);
        // }
// }
}
