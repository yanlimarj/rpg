
import java.util.Random;
public class Actions {

    public static int calculoDano (int x, int dano, int totalDamage, Random gerador){
        int diceNumber;

        for(int i = 0; i < x; i++){
            diceNumber = gerador.nextInt(1, dano);
            System.out.print("[" + diceNumber + "]");
            totalDamage += diceNumber;
        }
        return totalDamage;
    }

    public static int calculoCura (int x, int maxDiceNumber, int totalHeal, Random gerador){
        int diceNumber;

        for(int i = 0; i < x; i++){
            diceNumber = gerador.nextInt(1, maxDiceNumber);
            System.out.print("[" + diceNumber + "]");
            totalHeal += diceNumber;
        }
        return totalHeal;
    }

}
