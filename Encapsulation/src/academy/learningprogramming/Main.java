package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "kami";
//        player.health = 20;
//        player.weapon = "Crossbow";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;  // we are able to modify the player fields
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Kami", 200, "Crossbow");
        System.out.println("Initial health is " + enhancedPlayer.getHitPoints());
    }
}
