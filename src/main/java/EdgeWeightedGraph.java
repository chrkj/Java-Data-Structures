import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Weighted undirected graph
 */
public class EdgeWeightedGraph
{
    private int edges;
    private int vertices;
    private final HashMap<Integer, HashSet<Edge>> adj;

    public EdgeWeightedGraph()
    {
        this.edges = 0;
        this.vertices = 0;
        adj = new HashMap<>();
    }

    public void addEdge(Edge edge)
    {
        if (!adj.containsKey(edge.getVertex1()))
            adj.put(edge.getVertex1(), new HashSet<>());
            vertices++;
        if (!adj.containsKey(edge.getVertex2()))
            adj.put(edge.getVertex2(), new HashSet<>());
            vertices++;
        adj.get(edge.getVertex1()).add(edge);
        adj.get(edge.getVertex2()).add(edge);
        edges++;
    }

    public int getDegree(int vertex)
    {
        return adj.get(vertex).size();
    }

    public Set<Edge> getAdj(int vertex)
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
