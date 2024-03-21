public class Status {

    private Integer strenght;
    private Integer intelligence;
    private Integer wisdow;
    private Integer concentration;

    public Status(Integer strenght, Integer intelligence, Integer wisdow, Integer concentration) {
        this.strenght = strenght;
        this.intelligence = intelligence;
        this.wisdow = wisdow;
        this.concentration = concentration;
    }

    public Integer getStrenght() {
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
