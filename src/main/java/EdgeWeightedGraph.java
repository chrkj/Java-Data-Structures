import java.util.HashMap;
import java.util.HashSet;

public class EdgeWeightedGraph
{
    private int edges;
    private final int vertices;
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
        if (!adj.containsKey(edge.getVertex2()))
            adj.put(edge.getVertex2(), new HashSet<>());
        adj.get(edge.getVertex1()).add(edge);
        adj.get(edge.getVertex2()).add(edge);
        edges++;
    }

    public int getDegree(int vertex)
    {
        return adj.get(vertex).size();
    }

    public HashSet<Edge> getAdj(int vertex)
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
