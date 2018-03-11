package graph;

public class DiGraph<T extends Node> extends AbstractGraph<T>{


    @Override
    public void addEdge(int indexOut, int indexIn) {
        super.addEdge(indexOut, indexIn);
    }

    int getOutDegreeOfNode(int index)
    {
        int degree = 0;

        if (validateIndex(index,nodes))
        {
            Node node = nodes.get(index);
            if (node == null)
            {
                for (Edge edge:edges)
                {
                    if (node == edge.getN1())
                    {
                        degree++;
                    }
                }
            }
        }

        return degree;
    }

    int getInDegreeOfNode(int index)
    {
        int degree = 0;

        if (validateIndex(index,nodes))
        {
            Node node = nodes.get(index);
            if (node == null)
            {
                for (Edge edge:edges)
                {
                    if (node == edge.getN2())
                    {
                        degree++;
                    }
                }
            }
        }

        return degree;
    }

    int getMaxOutDegree()
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
            }

            if (maxDegree < degree){
                maxDegree = degree;
            }
        }

        return maxDegree;
    }

    int getMinOutDegree()
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
            }

            if (minDegree > degree){
                minDegree = degree;
            }
        }

        return minDegree;
    }

    int getMaxInDegree()
    {
        int maxDegree = 0;

        for (Node node:nodes)
        {
            int degree = 0;

            for (Edge edge: edges)
            {
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

    int getMinInDegree()
    {
        int minDegree = 0;

        for (Node node:nodes)
        {
            int degree = 0;

            for (Edge edge: edges)
            {
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
}
