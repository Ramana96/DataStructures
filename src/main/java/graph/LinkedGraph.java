package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LinkedGraph {
    private ArrayList<ArrayList<Character>> adjLinked;
    private int vertexCount;
    private final int maxCount = 20;
    ArrayList<Character> vertexList;

    LinkedGraph() {
        this.vertexCount = 0;
        adjLinked = new ArrayList<ArrayList<Character>>();
        vertexList = new ArrayList<Character>();
//        for (int i = 0; i < vertexCount; i++) {
//            ArrayList<Character> temp = new ArrayList<Character>();
//            temp.add(i);
//            adjLinked.add(temp);
//    }

    }

    public void addVertex(char c) {
        vertexList.add(c);
        vertexCount++;
        ArrayList<Character> x = new ArrayList<Character>();
        x.add(c);
        adjLinked.add(x);
    }

    public boolean addEdge(int i, int j) {
        if (i < adjLinked.size() && j < adjLinked.size() && i >= 0 && j >= 0) {
            adjLinked.get(i).add(vertexList.get(j));
            adjLinked.get(j).add(vertexList.get(j));
            return true;
        }
        return false;
    }

    public boolean isEdge(int i, int j) {
        boolean b = false;
        if (i < adjLinked.size() && j < adjLinked.size() && i >= 0 && j >= 0) {
            ArrayList<Character> integerLinkedList = adjLinked.get(i);
            b = integerLinkedList.contains(j);
        }
        return b;
    }

    public boolean deleteEdge(int i, int j) {
        boolean b = false;
        if (i < adjLinked.size() && j < adjLinked.size() && i > 0 && j > 0) {
            ArrayList<Character> integerLinkedList = adjLinked.get(i);
            b = integerLinkedList.remove(vertexList.get(j));
        }
        return b;

    }

    public void printGraph() {
        System.out.println(adjLinked);
    }


    public void BFS(int startNumber) {
        ArrayList<Character> bfsResult = new ArrayList<Character>();
        if (startNumber >= 0 && adjLinked.size() > startNumber) {
            Queue<Character> adjQueue = new LinkedList<Character>();
            bfsResult.add(vertexList.get(startNumber));
            adjQueue.add(vertexList.get(startNumber));
            while (!adjQueue.isEmpty()) {
                ArrayList<Character> x = adjLinked.get(adjQueue.remove());
                for (int i = 1; i < x.size(); i++) {
                    if (!bfsResult.contains(x.get(i))) {
                        bfsResult.add(x.get(vertexList.get(i)));
                        adjQueue.add(vertexList.get(i));
                    }
                }
            }
        }
        System.out.println(" result  " + bfsResult);

    }


    public void DFS(int startNumber) {
        ArrayList<Character> result = new ArrayList<Character>();
        implementDFS(startNumber, result);
        System.out.println(result);
    }

    private void implementDFS(int no, ArrayList<Character> result) {
        ArrayList<Character> x = adjLinked.get(no);
        for (int i = 0; i < x.size(); i++) {
            if (!result.contains(x.get(i))) {
                result.add(x.get(i));
                int yyy = vertexList.indexOf(x.get(i + 1));
                implementDFS(vertexList.indexOf(x.get(i + 1)), result);
            }
        }
    }


}
