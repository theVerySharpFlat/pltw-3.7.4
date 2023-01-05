public class Horse {
    public Horse(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    
    @Override
    public String toString() {
        return getName();
    }

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    private int weight;
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
