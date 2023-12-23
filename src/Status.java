public class Status {

    private int strenght;
    private int intelligence;
    private int wisdow;
    private int concentration;

    public Status(int strenght, int intelligence, int wisdow, int concentration) {
        this.strenght = strenght;
        this.intelligence = intelligence;
        this.wisdow = wisdow;
        this.concentration = concentration;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdow() {
        return wisdow;
    }

    public void setWisdow(int wisdow) {
        this.wisdow = wisdow;
    }

    public int getConcentration() {
        return concentration;
    }

    public void setConcentration(int concentration) {
        this.concentration = concentration;
    }
}
