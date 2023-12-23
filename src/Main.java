import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        Personagem personagem1 = new Personagem("Harumin", "Mage", 82, "Staff");
        Personagem personagem2 = new Personagem("Natsume", "Archer", 124, "Bow");
        Status statusPersonagem1 = new Status(8, 20, 14, 10);
        Status statusPersonagem2 = new Status(20, 6, 10, 12);


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


        while (personagem1.getHitDie() >= 0 && personagem2.getHitDie() >= 0) {

            System.out.println("Vez da --- " + personagem2.getNome() + " ---");
            System.out.println();
            System.out.println("Habilidades disponíveis:");
            mostrarSkills(skillsPersonagem2);
            System.out.println();

            String selectedSkill;
            int atkDice;
            int defDice;
            int escolha = escolherSkills(skillsPersonagem2.size());


            System.out.println();

            if (escolha != -1) {

                selectedSkill = obterNomeSkills(skillsPersonagem2, escolha);
                System.out.println(personagem2.getNome() + " usou " + selectedSkill + "!");
                UserAction.atkActionPersonagem2(escolha, gerador, personagem1, statusPersonagem2);
                System.out.println();

                if (personagem1.getHitDie() == 0) {
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
                UserAction.atkActionPersonagem1(escolha, gerador, personagem2, statusPersonagem1);


            }


            if (personagem2.getHitDie() == 0) {
                break;
            }
        }



        if (personagem1.getHitDie() <= 0) {
            System.out.println("Vitoria da " + personagem2.getNome());
        } else {
            System.out.println("Vitoria da " + personagem1.getNome());
        }

    }


    public static void mostrarSkills(ArrayList<String> skillsPersonagem2) {
        for (int i = 0; i < skillsPersonagem2.size(); i++) {
            System.out.println((i + 1) + ". " + skillsPersonagem2.get(i));
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

