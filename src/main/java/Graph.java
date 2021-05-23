import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Unweighted undirected graph
 */
public class Graph
{
    private int edges;
    private int vertices;
    private final HashMap<Integer, HashSet<Integer>> adj;

    public Graph()
    {
        this.edges = 0;
        this.vertices = 0;
        this.adj = new HashMap<>();
    }

    public void addEdge(int vertex1, int vertex2)
    {
        if(!adj.containsKey(vertex1))
            adj.put(vertex1, new HashSet<>());
        vertices++;
        if(!adj.containsKey(vertex1))
            adj.put(vertex1, new HashSet<>());
        vertices++;
        adj.get(vertex1).add(vertex2);
        adj.get(vertex1).add(vertex2);
        edges++;
    }

    public int getDegree(int vertex)
    {
        return adj.get(vertex).size();
    }

    public Set<Integer> getAdj(int vertex)
    {
        return adj.get(vertex);
    }

    public int getVertices()
    {
        return vertices;
    }

    public int getEdges()
    {
        return edges;
    }
}
