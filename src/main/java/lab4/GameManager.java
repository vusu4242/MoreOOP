package ua.ucu.apps.lab4;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("=== FIGHT START ===");
        System.out.println(c1 + " vs " + c2);
        int round = 1;
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("-- Round " + round++ + " --");
            System.out.println(c1.getClass().getSimpleName() + " attacks");
            c1.kick(c2);
            System.out.println("  " + c1 + " | " + c2);
            if (!c2.isAlive()) break;

            System.out.println(c2.getClass().getSimpleName() + " attacks");
            c2.kick(c1);
            System.out.println("  " + c1 + " | " + c2);
        }
        System.out.println("Winner: " + (c1.isAlive() ? c1.getClass().getSimpleName() : c2.getClass().getSimpleName()));
        System.out.println("=== FIGHT END ===");
    }
}
