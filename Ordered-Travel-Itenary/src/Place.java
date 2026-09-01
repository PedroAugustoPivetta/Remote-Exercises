public class Place {
    private String name;
    private Double distance;

    public Place(String name, double distance){
        this.name = name;
        this.distance = distance;
    }

    public String getName(){
        return this.name;
    }

    public double getDistance(){
        return this.distance;
    }
}
