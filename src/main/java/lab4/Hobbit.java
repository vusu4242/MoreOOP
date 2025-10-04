package ua.ucu.apps.lab4;
import ua.ucu.apps.strategy.HobbitKickStrategy;


public class Hobbit extends Character{
    public Hobbit(){
        super(0,3);
        setKickStrategy(new HobbitKickStrategy());
    }
    // @Override
    // public void kick(Character enemy) {
    //     System.out.println("Hobbit cries :(");
    // }

    
}
