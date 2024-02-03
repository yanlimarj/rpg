import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();

        Personagem personagem1 = new Personagem("Harumin", "Mage", 82, "Staff");
        Personagem personagem2 = new Personagem("Natsume", "Archer", 124, "Bow");
        Monster monstro1 = new Monster("Sombragor", "Demon", 50);
        Status statusPersonagem1 = new Status(8, 20, 14, 10);
        Status statusPersonagem2 = new Status(20, 6, 10, 12);


        ArrayList<String> skillsMonstro1 = new ArrayList<>();
        skillsMonstro1.add("Dark Blade"); // 2d6
        skillsMonstro1.add("Haunt"); // 3d4
        skillsMonstro1.add("Dark Cover"); // 2d8
        skillsMonstro1.add("Drain Life"); // 2d10

        ArrayList<String> skillsPersonagem1 = new ArrayList<>();
        skillsPersonagem1.add("Frostbite"); //  3d6
        skillsPersonagem1.add("Magic Missile"); // 3d4 + 3
        skillsPersonagem1.add("Fireball"); // 5d6
        skillsPersonagem1.add("Basic Atk"); // 1d4

        ArrayList<String> skillsPersonagem2 = new ArrayList<>();
        skillsPersonagem2.add("Spike Growth"); // 2d4
        skillsPersonagem2.add("Flame Arrow"); // 1d8 + 1d4
        skillsPersonagem2.add("Storm of Arrows"); // 3d6
        skillsPersonagem2.add("Basic Atk"); // 1d8


        while ((personagem1.getHitDie() >= 0 || personagem2.getHitDie() >= 0) && monstro1.getHitDie() >= 0) {

            System.out.println("Vez da --- " + personagem2.getNome() + " ---");
            System.out.println();
            System.out.println("Habilidades disponíveis:");
            mostrarSkills(skillsPersonagem2);
            System.out.println();

            String selectedSkill;
            int escolha = escolherSkills(skillsPersonagem2.size());


            System.out.println();

            if (escolha != -1) {

                selectedSkill = obterNomeSkills(skillsPersonagem2, escolha);
                System.out.println(personagem2.getNome() + " usou " + selectedSkill + "!");
                UserAction.atkActionPersonagem2(escolha, gerador, monstro1, statusPersonagem2);
                System.out.println();

                if (monstro1.getHitDie() <= 0) {
                    break;
                }
            }
            System.out.println("Vez da --- " + personagem1.getNome() + " ---");
            System.out.println();
            System.out.println("Habilidades disponíveis:");
            mostrarSkills(skillsPersonagem1);
            System.out.println();

            escolha = escolherSkills(skillsPersonagem1.size());

            System.out.println();
            if (escolha != -1) {

                selectedSkill = obterNomeSkills(skillsPersonagem1, escolha);
                System.out.println(personagem1.getNome() + " usou " + selectedSkill + "!");
                UserAction.atkActionPersonagem1(escolha, gerador, monstro1, statusPersonagem1);


            }


            if (monstro1.getHitDie() <= 0) {
                break;
            }

            System.out.println("Vez do --- " + monstro1.getNome() + " ---");
            System.out.println();

            escolha = gerador.nextInt(0, 4);

            if (escolha != -1) {

                selectedSkill = obterNomeSkills(skillsMonstro1, escolha);
                System.out.println(monstro1.getNome() + " usou " + selectedSkill + "!");
                MonsterAction.monsterAction1(escolha, gerador, personagem1, personagem2, monstro1);


            }


            if (personagem1.getHitDie() <= 0 && personagem2.getHitDie() <= 0) {
                break;
            }
        }



        if (monstro1.getHitDie() <= 0) {
            System.out.println("Vitoria!");
        } else {
            System.out.println("Derrota!");
        }

    }


    public static void mostrarSkills(ArrayList<String> skillsPersonagem) {
        for (int i = 0; i < skillsPersonagem.size(); i++) {
            System.out.println((i + 1) + ". " + skillsPersonagem.get(i));
        }
    }

    public static int escolherSkills(int tamanhoLista) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha uma habilidade (1-" + tamanhoLista + "): ");
        int escolha = scanner.nextInt();

        if (escolha >= 1 && escolha <= tamanhoLista) {
            return escolha - 1;
        } else {
            return -1;
        }
    }

    public static String obterNomeSkills(ArrayList<String> skills, int indice) {
        return skills.get(indice);
    }



    }

