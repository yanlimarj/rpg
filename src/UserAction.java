import java.util.Random;

public class UserAction {

    public static void atkActionPersonagem2(int escolha, Random gerador, Monster monstro, Status statusPersonagem2) {
        int totalDamage = 0;
        int bonusDmg = 0;

        for (int j = 1; j < statusPersonagem2.getStrenght() + 1; j++){
            if (j % 10 == 0){
                bonusDmg += 1;
            }
        }

        if (escolha == 0) {
                totalDamage = Actions.calculoDano(2, 5, totalDamage, gerador);

                System.out.println();
                System.out.println("Dano total: " + totalDamage + " + " + bonusDmg);
                totalDamage += bonusDmg;
                System.out.println();
        } else if (escolha == 1) {

                totalDamage = Actions.calculoDano(2, 8, totalDamage, gerador);

                System.out.println();
                System.out.println("Dano total: " + totalDamage + " + " + bonusDmg);
                totalDamage += bonusDmg;
                System.out.println();
        } else if (escolha == 2) {

                totalDamage = Actions.calculoDano(3, 7, totalDamage, gerador);

                System.out.println();
                System.out.println("Dano total: " + totalDamage + " + " + bonusDmg);
                totalDamage += bonusDmg;
                System.out.println();
        } else if (escolha == 3) {

                totalDamage = Actions.calculoDano(1, 9, totalDamage, gerador);

                System.out.println();
                System.out.println("Dano total: " + totalDamage + " + " + bonusDmg);
                totalDamage += bonusDmg;
                System.out.println();
        } else {
                System.out.println("Escolha inválida!");
                return;
        }

        atkAction2(gerador, monstro, totalDamage);
    }

    private static void atkAction2(Random gerador, Monster monstro1, int totalDamage) {
        int atkDice;
        int defDice;
        atkDice = gerador.nextInt(1, 21);
        defDice = gerador.nextInt(1, 21);
        System.out.println("atkDice = [" + atkDice + "]");
        System.out.println("defDice = [" + defDice + "]");

        if (atkDice >= defDice) {
            if(atkDice == 20){
                totalDamage *= 2;
            }
            System.out.println();
            monstro1.setHitDie(monstro1.getHitDie() - totalDamage);
            System.out.println(monstro1.getNome() + " recebeu " + totalDamage + " de dano");
            System.out.println(monstro1.getNome() + " agora possui " + monstro1.getHitDie() + " de vida");
        } else {
            if(defDice == 20){
                totalDamage = 0;
            }
            System.out.println();
            monstro1.setHitDie(monstro1.getHitDie() - (totalDamage / 2));
            System.out.println(monstro1.getNome() + " recebeu " + (totalDamage / 2) + " de dano");
            System.out.println(monstro1.getNome() + " agora possui " + monstro1.getHitDie() + " de vida");
        }
    }

    private static void atkAction1(Random gerador, Monster monstro1, int totalDamage) {
        int atkDice;
        int defDice;
        atkDice = gerador.nextInt(1, 21);
        defDice = gerador.nextInt(1, 21);
        System.out.println("atkDice = [" + atkDice + "]");
        System.out.println("defDice = [" + defDice + "]");

        if (atkDice >= defDice) {
            if(atkDice == 20){
                totalDamage *= 2;
            }
            System.out.println();
            monstro1.setHitDie(monstro1.getHitDie() - totalDamage);
            System.out.println(monstro1.getNome() + " recebeu " + totalDamage + " de dano");
            System.out.println(monstro1.getNome() + " agora possui " + monstro1.getHitDie() + " de vida");
        } else {
            if(defDice == 20){
                totalDamage = 0;
            }
            System.out.println();
            monstro1.setHitDie(monstro1.getHitDie() - (totalDamage / 2));
            System.out.println(monstro1.getNome() + " recebeu " + (totalDamage / 2) + " de dano");
            System.out.println(monstro1.getNome() + " agora possui " + monstro1.getHitDie() + " de vida");
        }
    }

    public static void atkActionPersonagem1(int escolha, Random gerador, Monster monstro, Status statusPersonagem1) {
        int totalDamage = 0;
        int bonusDmg = 0;


        for (int j = 1; j < statusPersonagem1.getIntelligence() + 1; j++){
            if (j % 10 == 0){
                bonusDmg += 1;
            }
        }

        if (escolha == 0) {

            totalDamage = Actions.calculoDano(3, 7, totalDamage, gerador);

            System.out.println();
            System.out.println("Dano total: " + totalDamage + " + " + bonusDmg);
            totalDamage += bonusDmg;
            System.out.println();
        } else if (escolha == 1) {

            totalDamage = Actions.calculoDano(3, 5, totalDamage, gerador);

            System.out.println(" + 3");
            totalDamage += 3;
            System.out.println();
            System.out.println("Dano total: " + totalDamage + " + " + bonusDmg);
            totalDamage += bonusDmg;
            System.out.println();

        } else if (escolha == 2) {

            totalDamage = Actions.calculoDano(5, 7, totalDamage, gerador);

            System.out.println();
            System.out.println("Dano total: " + totalDamage + " + " + bonusDmg);
            totalDamage += bonusDmg;
            System.out.println();

        } else if (escolha == 3) {

            totalDamage = Actions.calculoDano(1, 5, totalDamage, gerador);

            System.out.println();
            System.out.println("Dano total: " + totalDamage + " + " + bonusDmg);
            totalDamage += bonusDmg;
            System.out.println();
        }
            else{
            System.out.println("Escolha inválida!");
            return;
        }
        atkAction1(gerador, monstro, totalDamage);
    }
}



