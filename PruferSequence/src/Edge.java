public class Edge{

    public Vertex source;
    public Vertex destiny;
    public int weight;

    //Constructor
    public Edge(Vertex source, Vertex destiny) {
        this.source = source;
        this.destiny = destiny;
    }

    public Edge(Vertex source, Vertex destiny, int weight) {
        this.source = source;
        this.destiny = destiny;
        this.weight = weight;
    }

    //Getters and Setters
    public Vertex getSource() {
        return source;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public Vertex getDestiny() {
        return destiny;
    }

    public void setDestiny(Vertex destiny) {
        this.destiny = destiny;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
