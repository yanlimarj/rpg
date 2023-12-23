public class Personagem {

    private String nome;
    private String job;
    private int hitDie;
    private String weapon;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getHitDie() {
        return hitDie;
    }

    public void setHitDie(int hitDie) {
        this.hitDie = hitDie;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Personagem(String nome, String job, int hitDie, String weapon) {

        this.nome = nome;
        this.job = job;
        this.hitDie = hitDie;
        this.weapon = weapon;

    }




}
