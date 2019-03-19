package graph;

import java.util.ArrayList;

public class Implementation {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(1, 2);
//        graph.addEdge(1, 3);
//        graph.addEdge(1, 4);
//        graph.addEdge(2, 3);
//        graph.addEdge(3, 1);
//        graph.printGraph();
//        System.out.println("_________________________________");
//        graph.removeEdge(3, 1);
//        graph.printGraph();

//        System.out.println(graph.adjMatrix);

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(2);
//        System.out.println(al.get(3));
        LinkedGraph linkedGraph = new LinkedGraph();
        linkedGraph.addVertex('a');
        linkedGraph.addVertex('b');
        linkedGraph.addVertex('c');
        linkedGraph.addVertex('d');
        linkedGraph.addVertex('e');
        linkedGraph.addVertex('f');
        linkedGraph.addVertex('g');
        linkedGraph.addVertex('h');
        linkedGraph.addVertex('j');
        linkedGraph.addVertex('h');
        linkedGraph.addEdge(0, 1);
        linkedGraph.addEdge(0, 2);
        linkedGraph.addEdge(3, 2);
        linkedGraph.addEdge(2, 8);
        linkedGraph.addEdge(3, 8);
        linkedGraph.addEdge(2, 9);
        linkedGraph.addEdge(2, 3);
        linkedGraph.addEdge(2, 1);
        linkedGraph.addEdge(1, 4);
        linkedGraph.addEdge(1, 7);
        linkedGraph.addEdge(1, 6);
        linkedGraph.addEdge(4, 5);
        linkedGraph.addEdge(4, 6);
//        linkedGraph.addEdge(7, 6);


        linkedGraph.printGraph();
//        System.out.println(linkedGraph.isEdge(1, 2));

//        linkedGraph.deleteEdge(1,2);
//        linkedGraph.printGraph();

//        linkedGraph.BFS(0);
        linkedGraph.DFS(0);


    }


}
