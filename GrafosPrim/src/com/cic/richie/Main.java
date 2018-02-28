package com.cic.richie;

import com.oracle.tools.packager.Log;

import java.util.List;

public class Main {

    // Vertex : Adjacency List
    public static void main(String[] args) {

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
        al.addEdge(t, s, 60);
        al.addEdge(t, d, 70);
        al.addEdge(t, h, 80);
        al.addEdge(t, w, 90);
        al.addEdge(d, t, 100);
        al.addEdge(w, t, 110);
        al.addEdge(w, sf, 120);
        al.addEdge(sf, h, 130);
        al.addEdge(sf, w, 140);

        Log.info(al.toString());

        System.out.println(printNodes(s, al.getListFromVertex(s)));
        System.out.println(printNodes(h, al.getListFromVertex(h)));
        System.out.println(printNodes(t, al.getListFromVertex(t)));
        System.out.println(printNodes(d, al.getListFromVertex(d)));
        System.out.println(printNodes(w, al.getListFromVertex(w)));
        System.out.println(printNodes(sf, al.getListFromVertex(sf)));
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

}
