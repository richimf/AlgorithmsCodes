package com.cic.richie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjacencyList<T> {

    // Vertex : Adjacency List
    private Map<Vertex, List<Edge>> adjacencyList = new HashMap<Vertex, List<Edge>>();

    public AdjacencyList() {
    }

    //Create vertex with data
    public Vertex createVertex(T data) {
        List<Edge> le = new ArrayList<>(); //Edge
        Vertex v = (data == null) ? new Vertex() : new Vertex(data); //Vertex
        adjacencyList.put(v, le); //Vertex without adjacency list
        return v;
    }

    //Source - Destination, Weight
    public void addEdge(Vertex s, Vertex d, int w) {
        List<Edge> le = adjacencyList.get(s);
        Edge e = new Edge(s, d, w);
        le.add(e);
        adjacencyList.put(s, le);
    }

    public List<Edge> getListFromVertex(Vertex v) {
        return adjacencyList.get(v);
    }

}
