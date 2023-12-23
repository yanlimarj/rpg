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
                for (int i = 0; i < 2; i++) {
                    int dmg = 5;
                    diceNumber = gerador.nextInt(1, dmg);
                    System.out.print("[" + diceNumber + "]");
                    totalDamage += diceNumber;
                    if(diceNumber == 4){
                        countDice += 1;
                    }
                }
                if(countDice == 2){
                    System.out.println();
                    System.out.println("Dano critico!");
                    for (int i = 0; i < 2; i++) {
                        int dmg = 5;
                        diceNumber = gerador.nextInt(1, dmg);
                        System.out.print("[" + diceNumber + "]");
                        totalDamage += diceNumber;
                    }
                }
                System.out.println();
                System.out.println("Dano total: " + totalDamage + " + " + bonusDmg);
                totalDamage += bonusDmg;
                System.out.println();
        } else if (escolha == 1) {
            for (int i = 0; i < 1; i++) {
                int dmg = 9;
                diceNumber = gerador.nextInt(1, dmg);
                System.out.print("[" + diceNumber + "]");
                totalDamage += diceNumber;
                if(diceNumber == 8){
                    countDice += 1;
                }
            }
            for (int i = 0; i < 1; i++) {
                diceNumber = gerador.nextInt(1, 5);
                System.out.print("[" + diceNumber + "]");
                totalDamage += diceNumber;
                if(diceNumber == 4){
                    countDice += 1;
                }
            }
            if(countDice == 2){
                System.out.println();
                System.out.println("Dano critico!");
                for (int i = 0; i < 1; i++) {
                    int dmg = 9;
                    diceNumber = gerador.nextInt(1, dmg);
                    System.out.print("[" + diceNumber + "]");
                    totalDamage += diceNumber;
                }
                for (int i = 0; i < 1; i++) {
                    diceNumber = gerador.nextInt(1, 5);
                    System.out.print("[" + diceNumber + "]");
                    totalDamage += diceNumber;
                }
            }
                System.out.println();
                System.out.println("Dano total: " + totalDamage + " + " + bonusDmg);
                totalDamage += bonusDmg;
                System.out.println();
        } else if (escolha == 2) {
            for (int i = 0; i < 3; i++) {
                int dmg = 7;
                diceNumber = gerador.nextInt(1, dmg);
                System.out.print("[" + diceNumber + "]");
                totalDamage += diceNumber;
                if(diceNumber == 6){
                    countDice += 1;
                }
            }
            if(countDice == 3){
                System.out.println();
                System.out.println("Dano Critico!");
                for (int i = 0; i < 3; i++) {
                    int dmg = 7;
                    diceNumber = gerador.nextInt(1, dmg);
                    System.out.print("[" + diceNumber + "]");
                    totalDamage += diceNumber;
                }
            }
                System.out.println();
                System.out.println("Dano total: " + totalDamage + " + " + bonusDmg);
                totalDamage += bonusDmg;
                System.out.println();
        } else if (escolha == 3) {
            int dmg = 9;
            diceNumber = gerador.nextInt(1, dmg);
            System.out.print("[" + diceNumber + "]");
            totalDamage += diceNumber;
            if(diceNumber == 8){
                countDice += 1;
            }
            if (countDice == 1){
                System.out.println();
                System.out.println("Dano critico!");
                diceNumber = gerador.nextInt(1, dmg);
                System.out.print("[" + diceNumber + "]");
                totalDamage += diceNumber;
            }
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
            for (int i = 0; i < 3; i++) {
                int dmg = 7;
                diceNumber = gerador.nextInt(1, dmg);
                System.out.print("[" + diceNumber + "]");
                totalDamage += diceNumber;
                if(diceNumber == 6){
                    countDice += 1;
                }
            }
            if(countDice == 3){
                System.out.println();
                System.out.println("Dano critico!");
                for (int i = 0; i < 3; i++) {
                    int dmg = 7;
                    diceNumber = gerador.nextInt(1, dmg);
                    System.out.print("[" + diceNumber + "]");
                    totalDamage += diceNumber;
                }
            }
            System.out.println();
            System.out.println("Dano total: " + totalDamage + " + " + bonusDmg);
            totalDamage += bonusDmg;
            System.out.println();
        } else if (escolha == 1) {
            for (int i = 0; i < 3; i++) {
                int dmg = 5;
                diceNumber = gerador.nextInt(1, dmg);
                System.out.print("[" + diceNumber + "]");
                totalDamage += diceNumber;
                if(diceNumber == 4){
                    countDice += 1;
                }
            }
            if(countDice == 3){
                System.out.println();
                System.out.println("Dano critico!");
                for (int i = 0; i < 3; i++) {
                    int dmg = 5;
                    diceNumber = gerador.nextInt(1, dmg);
                    System.out.print("[" + diceNumber + "]");
                    totalDamage += diceNumber;
                }
            }
            System.out.println(" + 3");
            totalDamage += 3;
            System.out.println();
            System.out.println("Dano total: " + totalDamage + " + " + bonusDmg);
            totalDamage += bonusDmg;
            System.out.println();

        } else if (escolha == 2) {
            for (int i = 0; i < 5; i++) {
                int dmg = 7;
                diceNumber = gerador.nextInt(1, dmg);
                System.out.print("[" + diceNumber + "]");
                totalDamage += diceNumber;
                if(diceNumber == 6){
                    countDice += 1;
                }
            }
            if(countDice == 4){
                System.out.println();
                System.out.println("Dano critico!");
                for (int i = 0; i < 5; i++) {
                    int dmg = 7;
                    diceNumber = gerador.nextInt(1, dmg);
                    System.out.print("[" + diceNumber + "]");
                    totalDamage += diceNumber;
                }
            }
            System.out.println();
            System.out.println("Dano total: " + totalDamage + " + " + bonusDmg);
            totalDamage += bonusDmg;
            System.out.println();

        } else if (escolha == 3) {
            for (int i = 0; i < 1; i++) {
                int dmg = 5;
                diceNumber = gerador.nextInt(1, dmg);
                System.out.print("[" + diceNumber + "]");
                totalDamage += diceNumber;
                if(diceNumber == 4){
                    countDice += 1;
                }
            }
            if (countDice == 1){
                System.out.println();
                System.out.println("Dano critico!");
                for (int i = 0; i < 1; i++) {
                    int dmg = 5;
                    diceNumber = gerador.nextInt(1, dmg);
                    System.out.print("[" + diceNumber + "]");
                    totalDamage += diceNumber;
                }
            }
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



