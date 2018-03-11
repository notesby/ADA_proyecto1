package graph;

import java.util.ArrayList;

abstract class AbstractGraph<T extends Node> {
    protected ArrayList<T> nodes;
    protected ArrayList<Edge<T>> edges;

    AbstractGraph()
    {
        this.nodes = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

    public T getNode(int index)
    {
        T node = null;
        if (validateIndex(index,nodes))
        {
            node = nodes.get(index) ;
        }

        return node;
    }

    public void addNode(T node){
        if (node != null) {
            this.nodes.add(node);
        }
    }

    public void removeNode(int index){
        if (validateIndex(index,nodes))
        {
            T node = nodes.get(index);
            if (node != null) {
                for (Edge edge : edges) {
                    if (node == edge.getN1() || node == edge.getN2())
                    {
                        edges.remove(edge);
                    }
                }

                nodes.remove(node);
            }
        }
    }

    public Edge<T> getEdge(int index)
    {
        if (validateIndex(index,edges)) {
            return new Edge(edges.get(index));
        }

        return null;
    }

    public void addEdge(int index1, int index2){
        if (validateIndex(index1,nodes) && validateIndex(index2, nodes)) {

            Node node1 = nodes.get(index1);
            Node node2 = nodes.get(index2);

            if (node1 != null && node2 != null) {
                Edge edge = new Edge(node1, node2);

                if (!hasEdge(edge))
                {
                    edges.add(edge);
                }
            }
        }
    }

    public boolean hasEdge(Edge edge)
    {
        for (Edge edge1:edges)
        {
            if (edge == edge1)
            {
                return true;
            }
        }

        return false;
    }

    public void removeEdge(int index){
        if (validateIndex(index,edges)) {
            edges.remove(index);
        }
    }

    public ArrayList<Edge<T>> getEdgesOfNode(int index){
        ArrayList<Edge<T>> nodeEdges = null;

        if (validateIndex(index,nodes)) {
            Node node = nodes.get(index);

            if (node != null) {
                nodeEdges = new ArrayList<>();

                for (Edge edge : edges) {
                    if (node == edge.getN1() || node == edge.getN2()) {
                        nodeEdges.add(edge);
                    }
                }
            }
        }

        return  nodeEdges;
    }

    public int getDegreeOfNode(int index)
    {
        int degree = 0;

        if (validateIndex(index,nodes))
        {
            Node node = nodes.get(index);
            if (node != null)
            {
                for (Edge edge:edges)
                {
                    if (node == edge.getN1())
                    {
                        degree++;
                    }
                    if (node == edge.getN2())
                    {
                        degree++;
                    }
                }
            }
        }

        return degree;
    }

    public int getMaxDegree()
    {
        int maxDegree = 0;

        for (Node node:nodes)
        {
            int degree = 0;

            for (Edge edge: edges)
            {
                if (edge.getN1() == node )
                {
                    degree++;
                }

                if (edge.getN2() == node)
                {
                    degree++;
                }
            }

            if (maxDegree < degree){
                maxDegree = degree;
            }
        }

        return maxDegree;
    }

    public int getMinDegree()
    {
        int minDegree = 0;

        for (Node node:nodes)
        {
            int degree = 0;

            for (Edge edge: edges)
            {
                if (edge.getN1() == node )
                {
                    degree++;
                }

                if (edge.getN2() == node)
                {
                    degree++;
                }
            }

            if (minDegree > degree){
                minDegree = degree;
            }
        }

        return minDegree;
    }

    public ArrayList<Edge<T>> getEdges() {
        return new ArrayList<>(edges);
    }

    public ArrayList<T> getNodes() {
        return new ArrayList<>(nodes);
    }

    public int getEdgesCount()
    {
        return edges.size();
    }

    public int getNodesCount(){
        return nodes.size();
    }

    public void setNodes(ArrayList<T> nodes) {
        this.nodes.addAll(nodes);
    }

    protected boolean validateIndex(int index, ArrayList list)
    {
        return list != null && index >=0 && index < list.size();
    }

    public String getGDFFormat(){
        String nodesHeader = "nodedef> name VARCHAR,label VARCHAR\n";
        String edgesHeader = "edgedef> node1,node2\n";

        String graph = nodesHeader;

        for (Node node:nodes)
        {
            graph += node.getId()+","+node.getLabel()+"\n";
        }


        graph += edgesHeader;
        for (Edge edge:edges){
            graph += edge.getN1().getId()+","+edge.getN2().getId()+"\n";
        }

        return graph;
    }
}
