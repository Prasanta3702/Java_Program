import java.util.Iterator;
import java.util.Random;
import java.util.NoSuchElementException;

class Graph {
    private static String newLine = System.getProperty("line.separtor");
    private final int V;
    private int E;
    private boolean[][] adjMatrix;

    public Graph() {
        this.V = 0;
        this.E = 0;
    }
    public Graph(int v, int e) {
        this.V = v;
        this.E = e;
    }
    public void setV(int v) {
        this.V = v;
    }
    public int getV() {
        return V;
    }
}
public class graphDemo {
    public static void main(String[] args) {
        Graph g = new Graph();

        System.out.println("V = "+g.getV());
    }
}