package graph;

public class Edge<T extends Node> {
    private T n1;
    private T n2;


    Edge(Edge<T> edge)
    {
        this.n1 = edge.n1;
        this.n2 = edge.n2;
    }

    Edge(T n1, T n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }

    void setN1(T n1) {
        this.n1 = n1;
    }

    void setN2(T n2) {
        this.n2 = n2;
    }

    public final T getN1() {
        return n1;
    }

    public final T getN2() {
        return n2;
    }
}
