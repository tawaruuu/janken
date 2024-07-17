package src;

public class game {
    public static int judge(Player p1, Player p2) {

        //TODO:nullチェック

        return p1.getHand().compare(p2.getHand());

    }
}
