package ua.ucu.apps.strategy;
import ua.ucu.apps.lab4.Character;

public class HobbitKickStrategy implements KickStrategy{
    @Override public void kick(Character self, Character enemy) {
        System.out.println("Hobbit cries :(");
    }
}
