import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjacencyList<T> {

    // Vertex : Adjacency List
    private Map<Vertex, List<Edge>> adjacencyList = new HashMap<Vertex, List<Edge>>();

    public AdjacencyList() {}

    //Create vertex with data
    public Vertex createVertex(T data) {
        List<Edge> le = new ArrayList<>(); //Edge list
        Vertex v = (data == null) ? new Vertex() : new Vertex(data); //Vertex
        adjacencyList.put(v, le); //Vertex without adjacency list
        return v;
    }

    //Create an Edge with starting node "s", and destination node "d"
    public void addEdge(Vertex s, Vertex d) {
//        List<Edge> le = adjacencyList.get(s);
////        Edge e = new Edge(s, d);
////        le.add(e);
////        adjacencyList.put(s, le);
        setupEdge(s,d);
        setupEdge(d,s);
    }

    private void setupEdge(Vertex s, Vertex d){
        List<Edge> l = adjacencyList.get(s);
        Edge e = new Edge(s, d);
        l.add(e);
        adjacencyList.put(s, l);
    }

    //Source - Destination, Weight
//    public void addEdgeWeighted(Vertex s, Vertex d, int w) {
//        List<Edge> le = adjacencyList.get(s);
//        Edge e = new Edge(s, d, w);
//        le.add(e);
//        adjacencyList.put(s, le);
//    }

    public List<Edge> getListFromVertex(Vertex v) {
        return adjacencyList.get(v);
    }

}
