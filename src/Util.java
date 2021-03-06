import graph.Edge;
import graph.Graph;
import graph.Node;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;

public class Util {

    public static Graph<DummyNode> newErdosAndReyisModel(int n,int m)
    {
        Graph<DummyNode> dummyNodeGraph = new Graph<>();

        for (int i=0;i < n;i++)
        {
            dummyNodeGraph.addNode(new DummyNode(i));
        }

        Random random = new Random();
        for (int i=0; i < m ; i++)
        {
            int n1 = random.nextInt(n);
            int n2 = random.nextInt(n);
            if (n1 != n2) {
                dummyNodeGraph.addEdge(n1, n2);
            }
        }

        return dummyNodeGraph;
    }

    public static Graph<DummyNode> newGilbertModel(int n,double p)
    {
        Graph<DummyNode> dummyNodeGraph = new Graph<>();

        for (int i=0;i < n;i++)
        {
            dummyNodeGraph.addNode(new DummyNode(i));
        }

        Random random = new Random();
        for (int i=0; i < n ; i++)
        {
            for (int j=0; j < n; j++)
            {
                if (i != j && random.nextDouble() < p)
                {
                    dummyNodeGraph.addEdge(i,j);
                }
            }

        }

        return dummyNodeGraph;
    }

    public static Graph<GeographicNode> newGeographicModel(int n, double r)
    {
        Graph<GeographicNode> geometricNodeGraph = new Graph<>();


        Random random = new Random();
        for (int i=0;i < n;i++)
        {
            geometricNodeGraph.addNode(new GeographicNode(i,random.nextDouble(),random.nextDouble()));
        }

        for (int i=0; i < n ; i++)
        {
            GeographicNode node1 = geometricNodeGraph.getNode(i);

            for (int j=0; j < n; j++) {
                GeographicNode node2 = geometricNodeGraph.getNode(j);
                double c = Math.sqrt(Math.pow(Math.abs(node1.x-node2.x),2)+Math.pow(Math.abs(node1.y-node2.y),2));

                if (i != j && c <= r)
                {
                    geometricNodeGraph.addEdge(i,j);
                }
            }
        }

        return geometricNodeGraph;
    }

    public static Graph<DummyNode> newBarabasiAlbertModel(int n,double d)
    {
        Graph<DummyNode> graph = new Graph<>();

        Random random = new Random();
        for (int i=0;i < n;i++)
        {
            graph.addNode(new DummyNode(i));
            for (int j=0;j < n;j++)
            {
                double p = 1-graph.getDegreeOfNode(j)/d;
                if (i != j && random.nextDouble() <= p)
                {
                    graph.addEdge(i,j);
                }
            }
        }

        return graph;
    }

    public static void saveGraph(String fileName,Graph graph)
    {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(graph.getGVFormat("a"));
            writer.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void addRandomWeight(Graph<Node> graph)
    {
        Random random = new Random();
        for (int i=0;i< graph.getEdgesCount();i++)
        {
            graph.addWeight(i,random.nextInt(100));
        }
    }
}
