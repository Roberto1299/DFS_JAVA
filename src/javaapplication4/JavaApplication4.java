package javaapplication4;

/**
 *
 * @author rober
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vertex vertexA = new Vertex("1");
        Vertex vertexB = new Vertex("2");
        Vertex vertexC = new Vertex("3");
        Vertex vertexD = new Vertex("4");
        Vertex vertexE = new Vertex("5");
        

        vertexA.addNeighbour(vertexB);
        vertexA.addNeighbour(vertexC);
        vertexB.addNeighbour(vertexD);
        vertexB.addNeighbour(vertexE);

        DFS dfs = new DFS();
        dfs.recursiveDfs(vertexA);
        for (int i = 1; i < 2; i++) {
            System.out.println(i);
        }
    }
}
