package com.cic.richie;

public class Edge{

    public Vertex source;
    public Vertex destiny;
    public int weight;

    public Edge(){

    }

    public Edge(Vertex source, Vertex destiny, int weight) {
        this.source = source;
        this.destiny = destiny;
        this.weight = weight;
    }

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
