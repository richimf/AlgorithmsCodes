package com.cic.richie;

import com.oracle.tools.packager.Log;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Edge> minimumSpanningTree = new ArrayList<>();

    public static void main(String[] args) {

        // Vertex : Adjacency List
        AdjacencyList<String> al = new AdjacencyList<>();

        Vertex s = al.createVertex("s");
        Vertex h = al.createVertex("h");
        Vertex t = al.createVertex("t");
        Vertex d = al.createVertex("d");
        Vertex w = al.createVertex("w");
        Vertex sf = al.createVertex("sf");

        al.addEdge(s, h, 300);
        al.addEdge(s, t, 500);
        al.addEdge(h, s, 300);
        al.addEdge(h, t, 250);
        al.addEdge(h, sf, 600);
        al.addEdge(t, s, 500);
        al.addEdge(t, d, 450);
        al.addEdge(t, h, 250);
        al.addEdge(t, w, 300);
        al.addEdge(d, t, 450);
        al.addEdge(w, t, 300);
        al.addEdge(w, sf, 337);
        al.addEdge(sf, h, 600);
        al.addEdge(sf, w, 337);

        //Show values
        Log.info(al.toString());
        System.out.println("\nAdjacency List: \n");
        System.out.println(printNodes(s, al.getListFromVertex(s)));
        System.out.println(printNodes(h, al.getListFromVertex(h)));
        System.out.println(printNodes(t, al.getListFromVertex(t)));
        System.out.println(printNodes(d, al.getListFromVertex(d)));
        System.out.println(printNodes(w, al.getListFromVertex(w)));
        System.out.println(printNodes(sf, al.getListFromVertex(sf)));

        //Generate MST
        generateMST(al.getListFromVertex(h));
        generateMST(al.getListFromVertex(s));
        generateMST(al.getListFromVertex(t));
        generateMST(al.getListFromVertex(d));
        generateMST(al.getListFromVertex(w));
        generateMST(al.getListFromVertex(sf));

        Log.info(minimumSpanningTree.toString());

        System.out.println("\nMin Spanning Tree: \n");
        //Show minimum spanning tree
        for (Edge e : minimumSpanningTree) {
            System.out.println(e.source.getData().toString() + "---( " + e.weight + " )---" + e.destiny.getData().toString());
        }

    }

    private static String printNodes(Vertex v, List<Edge> edgeList) {
        String key = v.getData().toString() + " |---> ";
        String node = "";
        for (Edge e : edgeList) {
            node += "" + e.destiny.getData().toString();
            node += " , ";
        }
        //clear last comma
        node = node.substring(0, node.length() - 2) + ' ';
        return key + node;
    }

    //Generate Minimum Spanning Tree
    private static void generateMST(List<Edge> edgeList) {
        Edge e = getMinimumWeight(edgeList);
        minimumSpanningTree.add(e);
    }

    //Get the min weight
    private static Edge getMinimumWeight(List<Edge> edgeList) {
        int minw = 0;
        Edge fe = null;
        for (Edge e : edgeList) {
            int w = e.weight;
            if (minw == 0) {
                minw = w;
                fe = e;
                continue;
            }
            if (minw > w) {
                minw = w;
                fe = e;
                continue;
            }
        }
        return fe;
    }

}
