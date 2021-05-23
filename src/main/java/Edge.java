public class Edge implements Comparable<Edge>
{
    private final int vertex1;
    private final int vertex2;
    private final double weight;

    public Edge(int vertex1, int vertex2, double weight)
    {
        this.weight = weight;
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
    }

    public int getVertex1() { return vertex1; }

    public int getVertex2() { return vertex2; }

    public double getWeight() { return weight; }

    public int other(int vertex)
    {
        if (vertex == vertex2)
            return vertex1;
        else
            return vertex2;
    }

    @Override
    public int compareTo(Edge o)
    {
        return Double.compare(this.weight, o.weight);
    }
}