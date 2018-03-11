import graph.Graph;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

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
            dummyNodeGraph.addEdge(random.nextInt(n),random.nextInt(n));
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
                if (random.nextDouble() < p)
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
            geometricNodeGraph.addNode(new GeographicNode(random.nextDouble(),random.nextDouble()));
        }


        System.out.println("nuevo grafo +"+n);
        for (int i=0; i < n ; i++)
        {
            GeographicNode node1 = geometricNodeGraph.getNode(i);

            for (int j=0; j < n; j++) {
                GeographicNode node2 = geometricNodeGraph.getNode(j);
                double c = Math.sqrt(Math.pow(Math.abs(node1.x-node2.x),2)+Math.pow(Math.abs(node1.y-node2.y),2));

                System.out.println(node1.getLabel());
                System.out.println(node2.getLabel());
                System.out.println(c+","+r);
                if (c <= r)
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
                if (random.nextDouble() <= p)
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
            writer.write(graph.getGDFFormat());
            writer.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
