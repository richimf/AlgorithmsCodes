//Prüfer Sequence, la idea es construir un arbol unico con n-vertices desde una secuencia S de n-2 etiquetas.

//Prüfer Tree:
/*
One can generate a labeled tree's Prüfer sequence by iteratively removing vertices from the tree until only two vertices remain.
Specifically, consider a labeled tree T with vertices {1, 2, ..., n}.
At step i, remove the leaf with the smallest label and set the ith element of the Prüfer sequence to be the label of this leaf's neighbour.
The Prüfer sequence of a labeled tree is unique and has length n − 2.

Construir una secuencia S de n-2 etiquetas tal que codifican univocamente a T.
Elige un vértice Si perteneciente a T tal que grado Si>1 y Si es adyacente a un vértice V tal que el grado(v) = 1 ^ V es
la etiqueta mas pequeña. Entonces, borra v de T y adiciona Si a S. Este proceso se repite cuando a T le quedan dos vértices.
*/

/*
Inversamente:
Seleccione la etiqueta mas pequeña de I tal que no este en S, sea Si.
Entonces, se forma la arista (i1,s1) la cual pertenecera a T.
Entonces, eliminamos i1 de I y s1 de S. Este proceso se repite hasta que I se queda con 2 vertices y S = vacio.
*/

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Vertex : Adjacency List
    static AdjacencyList<String> al = new AdjacencyList<>();

    public static void main(String[] args){

        //Setting up the Tree
        Vertex a = al.createVertex("1");
        Vertex b = al.createVertex("2");
        Vertex c = al.createVertex("3");
        Vertex d = al.createVertex("4");
        Vertex e = al.createVertex("5");
        Vertex f = al.createVertex("6");
        Vertex g = al.createVertex("7");
        Vertex h = al.createVertex("8");

        al.addEdge(a, b);
        al.addEdge(a, c);
        al.addEdge(c, e);
        al.addEdge(c, d);
        al.addEdge(d, f);
        al.addEdge(d, g);
        al.addEdge(d, h);

        //Show values
        System.out.println("\nAdjacency List:\n");
        System.out.println(printNodes(a));
        System.out.println(printNodes(b));
        System.out.println(printNodes(c));
        System.out.println(printNodes(d));
        System.out.println(printNodes(e));
        System.out.println(printNodes(f));
        System.out.println(printNodes(g));
        System.out.println(printNodes(h));
    }

    private static String printNodes(Vertex v) {
        List<Edge> edgeList = al.getListFromVertex(v);
        String key = v.getData().toString() + " |---> ";
        String node = "";
        for (Edge e : edgeList) {
            node += "" + e.destiny.getData().toString();
            node += " , ";
        }
        //delete last "comma"
        node = node.substring(0, node.length() - 2) + ' ';
        return key + node;
    }

    //S is the prufer sequence, it is assumed the sequence is not empty.
    static List<Integer> li = new ArrayList<>();
    private static void convertPruferToTree(Vertex... S){
        //Sort sequence

        //Draw the n nodes of the tree we are to generate , and label them from 1 to n.
        for(int i = 0; i < S.length; i++){
            li.add(i+1); //list from 1 to n
            System.out.println(S[i]);
       }
    }

    private static Vertex[] sortSequence(){
        return ;
    }

    //        createTree("1","2","3","4","5");
//    private static void createTree(String... values){
//        for(int i = 0; i < values.length; i++){
//            System.out.println(values[i]);
//            Vertex a = al.createVertex(values[i]);
//        }
//    }

}
