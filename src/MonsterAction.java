import java.awt.*;
import java.util.Random;

public class MonsterAction {
    public static void monsterAction1(int escolha, Random gerador, Personagem personagem1, Personagem personagem2, Monster monstro1){

        int totalDamage = 0;

        if (escolha == 0) {
            totalDamage = Actions.calculoDano(2, 7, totalDamage, gerador);

            System.out.println();
            System.out.println("Dano total: " + totalDamage);
            System.out.println();
        } else if (escolha == 1) {

            totalDamage = Actions.calculoDano(3, 5, totalDamage, gerador);

            System.out.println();
            System.out.println("Dano total: " + totalDamage);
            System.out.println();
        } else if (escolha == 2) {

            totalDamage = Actions.calculoDano(2, 9, totalDamage, gerador);

            System.out.println();
            System.out.println("Dano total: " + totalDamage);
            System.out.println();
        } else if (escolha == 3) {

            totalDamage = Actions.calculoDano(2, 11, totalDamage, gerador);

            System.out.println();
            System.out.println("Dano total: " + totalDamage);
            System.out.println();
        } else {
            System.out.println("Escolha inválida!");
            return;
        }

        atkMonsterAction1(gerador, personagem1, personagem2, totalDamage, escolha, monstro1);




    }

    private static void atkMonsterAction1(Random gerador, Personagem personagem1, Personagem personagem2, int totalDamage, int escolha, Monster monstro1) {
        int atkDice;
        int defDice;
        String alvo;
        int hitAlvo;

        Personagem[] personagens = new Personagem[]{personagem1, personagem2};

        int indiceAlvo = gerador.nextInt(personagens.length);
        alvo = personagens[indiceAlvo].getNome();
        hitAlvo = personagens[indiceAlvo].getHitDie();
        System.out.println();

        atkDice = gerador.nextInt(1, 21);
        defDice = gerador.nextInt(1, 21);

        System.out.println("atkDice = [" + atkDice + "]");
        System.out.println("defDice = [" + defDice + "]");

        if (atkDice >= defDice) {
            if(atkDice == 20){
                totalDamage *= 2;
            }

            System.out.println();
            personagens[indiceAlvo].setHitDie(hitAlvo - totalDamage);
            System.out.println(alvo + " recebeu " + totalDamage + " de dano");
            System.out.println(alvo + " agora possui " + hitAlvo + " de vida");
            System.out.println();
            if(escolha == 3){
                monstro1.setHitDie(monstro1.getHitDie() + totalDamage);
                System.out.println(monstro1.getNome() + " curou " + totalDamage + " de vida");
                System.out.println(monstro1.getNome() + " agora possui " + monstro1.getHitDie() + " de vida");
            }
        } else {
            if(defDice == 20){
                totalDamage = 0;
            }
            System.out.println();
            personagens[indiceAlvo].setHitDie(hitAlvo - (totalDamage / 2));
            System.out.println(alvo + " recebeu " + (totalDamage / 2) + " de dano");
            System.out.println(alvo + " agora possui " + hitAlvo + " de vida");
        }
    }

























}
