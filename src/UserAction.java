import java.util.Random;

public class UserAction {

    public static void atkActionPersonagem2(int escolha, Random gerador, Personagem personagem, Status statusPersonagem2) {
        int totalDamage = 0;
        int diceNumber;
        int bonusDmg = 0;
        int countDice = 0;
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

        atkAction2(gerador, personagem, totalDamage);
    }

    private static void atkAction2(Random gerador, Personagem personagem1, int totalDamage) {
        int atkDice;
        int defDice;
        atkDice = gerador.nextInt(1, 21);
        defDice = gerador.nextInt(1, 21);
        System.out.println("atkDice = [" + atkDice + "]");
        System.out.println("defDice = [" + defDice + "]");

        if (atkDice >= defDice) {
            System.out.println();
            personagem1.setHitDie(personagem1.getHitDie() - totalDamage);
            System.out.println(personagem1.getNome() + " recebeu " + totalDamage + " de dano");
            System.out.println(personagem1.getNome() + " agora possui " + personagem1.getHitDie() + " de vida");
        } else {
            System.out.println();
            personagem1.setHitDie(personagem1.getHitDie() - (totalDamage / 2));
            System.out.println(personagem1.getNome() + " recebeu " + (totalDamage / 2) + " de dano");
            System.out.println(personagem1.getNome() + " agora possui " + personagem1.getHitDie() + " de vida");
        }
    }

    private static void atkAction1(Random gerador, Personagem personagem2, int totalDamage) {
        int atkDice;
        int defDice;
        atkDice = gerador.nextInt(1, 21);
        defDice = gerador.nextInt(1, 21);
        System.out.println("atkDice = [" + atkDice + "]");
        System.out.println("defDice = [" + defDice + "]");

        if (atkDice >= defDice) {
            System.out.println();
            personagem2.setHitDie(personagem2.getHitDie() - totalDamage);
            System.out.println(personagem2.getNome() + " recebeu " + totalDamage + " de dano");
            System.out.println(personagem2.getNome() + " agora possui " + personagem2.getHitDie() + " de vida");
        } else {
            System.out.println();
            personagem2.setHitDie(personagem2.getHitDie() - (totalDamage / 2));
            System.out.println(personagem2.getNome() + " recebeu " + (totalDamage / 2) + " de dano");
            System.out.println(personagem2.getNome() + " agora possui " + personagem2.getHitDie() + " de vida");
        }
    }

    public static void atkActionPersonagem1(int escolha, Random gerador, Personagem personagem, Status statusPersonagem1) {
        int totalDamage = 0;
        int diceNumber;
        int bonusDmg = 0;
        int countDice = 0;

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
        atkAction1(gerador, personagem, totalDamage);
    }
}



