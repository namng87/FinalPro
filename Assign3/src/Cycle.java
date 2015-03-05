public class Cycle {
    private int numberOfWheels;
    private int weight;
    public Cycle(int numberOfWheels, int weight) {
        this.numberOfWheels = numberOfWheels;
        this.weight = weight;
    }
    // B part
    public Cycle(){
        this.numberOfWheels = 100;
        this.weight = 1000;
    }
    public String toString(){
        return "Cycle - number of Wheels: " + numberOfWheels + "\n" +
        "Cycle - Weight: " + weight;
    }
}