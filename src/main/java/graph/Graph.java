package graph;

public class Graph {
    boolean[][] adjMatrix;
    int vertexCount;

    Graph(int vertexCount) {
        this.vertexCount = vertexCount;
        adjMatrix = new boolean[vertexCount][vertexCount];
    }

    public boolean addEdge(int i, int j) {
        if (i > vertexCount && j > vertexCount) {
            System.out.println("out of size");
            return false;
        }
        if (adjMatrix[i][j] == true) {
            System.out.println("it has already a link");
            return false;
        }
        adjMatrix[i][j] = true;
        return true;

    }

    public boolean isEdge(int i, int j) {
        if (adjMatrix[i][j] == true) {
            return true;
        }
        return false;

    }

    public boolean removeEdge(int i, int j) {
        if (i > 0 && j > 0 && i < vertexCount && j < vertexCount) {
            adjMatrix[i][j] = false;
            return true;
        }
        return false;
    }

    public void printGraph() {
        for (boolean[] x : adjMatrix) {
            for (boolean b : x) {
                System.out.print(b + "    ");
            }
            System.out.println();
        }
    }

}
