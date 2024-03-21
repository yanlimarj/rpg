import java.util.Random;
import java.util.Scanner;

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
    public static void atkActionPersonagem3(int escolha, Random gerador, Monster monstro, Personagem personagem1, Personagem personagem2, Personagem personagem3, Status statusPersonagem3) {
        int totalDamage = 0;
        int bonusDmg = 0;
        int totalHeal = 0;

        if (escolha == 0) {
            totalHeal = Actions.calculoCura(2, 8, totalHeal, gerador);

            System.out.println();
            System.out.println("Cura total: " + totalHeal);
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

        atkAction3(gerador, monstro, totalDamage, totalHeal, personagem1, personagem2, personagem3, escolha);
    }
    private static void atkAction3(Random gerador, Monster monstro1, int totalDamage, int totalHeal, Personagem personagem1, Personagem personagem2, Personagem personagem3, int escolha) {
        int atkDice;
        int defDice;
        atkDice = gerador.nextInt(1, 21);
        defDice = gerador.nextInt(1, 21);
        System.out.println("atkDice = [" + atkDice + "]");
        System.out.println("defDice = [" + defDice + "]");
        Scanner sc = new Scanner(System.in);

        if(escolha == 0){
            System.out.println("Escolha o alvo: [1] " + personagem1.getNome() + ", [2] " + personagem2.getNome() + ", [3] " + personagem3.getNome());
            int alvo = sc.nextInt();
            if(alvo == 1){
                personagem1.setHitDie(personagem1.getHitDie() + totalHeal);
            }
            if(alvo == 2){
                personagem2.setHitDie(personagem2.getHitDie() + totalHeal);
            }
            if(alvo == 3){
                personagem3.setHitDie(personagem3.getHitDie() + totalHeal);
            }
        }

        else{
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


    }
}



