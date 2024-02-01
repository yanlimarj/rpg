public class Monster {

    private String nome;
    private String raca;
    private int hitDie;

    public Monster(String nome, String raca, int hitDie) {
        this.nome = nome;
        this.raca = raca;
        this.hitDie = hitDie;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getHitDie() {
        return hitDie;
    }

    public void setHitDie(int hitDie) {
        this.hitDie = hitDie;
    }
}
