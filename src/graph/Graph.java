package graph;

import java.util.*;

public class Graph<T extends Node> extends AbstractGraph<T> {
    public Graph BFS(Node start)
    {
        Graph tree = new Graph();
        LinkedList<Node> nodes = new LinkedList<>();
        HashSet<Node> visited = new HashSet<>();

        nodes.add(start);
        visited.add(start);
        tree.addNode(start);

        while (!nodes.isEmpty())
        {
            Node v = nodes.poll();

            for (Edge w : getEdgesOfNode(getIndex(v)))
            {
                Node neighbor;
                if (w.getN2() == v)
                {
                    neighbor = w.getN1();
                }
                else
                {
                    neighbor = w.getN2();
                }
                if (!visited.contains(neighbor))
                {
                    tree.addNode(neighbor);
                    tree.addEdge(tree.getIndex(v),tree.getIndex(neighbor));
                    nodes.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        return tree;
    }

    public Graph DFS_R(Node s)
    {
        HashSet<Node> discovered = new HashSet<>();
        Graph tree = new Graph();

        tree.addNode(s);
        DFSRecursive(s,discovered,tree);

        return tree;
    }

    public void DFSRecursive (Node s,HashSet<Node> discovered,Graph tree)
    {
        discovered.add(s);
        for (Edge e : getEdgesOfNode(getIndex(s)))
        {
            Node neighbor;
            if (e.getN1() == s)
            {
                neighbor = e.getN2();
            }
            else
            {
                neighbor = e.getN1();
            }

            if (!discovered.contains(neighbor))
            {
                tree.addNode(neighbor);
                tree.addEdge(tree.getIndex(e.getN1()),tree.getIndex(e.getN2()));
                DFSRecursive(neighbor,discovered,tree);
            }
        }
    }

    public Graph DFS_I(Node s)
    {
        HashSet<Node> discovered = new HashSet<>();
        Graph tree = new Graph();
        Stack<Node> stack = new Stack<>();

        stack.push(s);
        tree.addNode(s);

        Node prev = null;

        while (!stack.isEmpty())
        {
            Node v = stack.pop();

            if (!discovered.contains(v))
            {
                if (prev != null)
                {
                    tree.addNode(v);
                    tree.addEdge(tree.getIndex(prev), tree.getIndex(v));
                }
                else {
                    tree.addNode(prev);
                }

                discovered.add(v);

                ArrayList<Edge<T>> neighbors = getEdgesOfNode(getIndex(v));
                for (Edge e : neighbors)
                {
                    Node neighbor;
                    if (e.getN1() == v)
                    {
                        neighbor = e.getN2();
                    }
                    else {
                        neighbor = e.getN1();
                    }

                    if (!discovered.contains(neighbor))
                    {
                        stack.push(neighbor);
                    }
                }
                prev = v;
            }
        }

        return tree;
    }


    public Graph dijkstra(Node s)
    {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            if (o1.getValue() == o2.getValue())
            {
                return 0;
            }
            else if(o1.getValue() > o2.getValue())
            {
                return 1;
            }
            else
            {
                return -1;
            }
        });
        Graph tree = new Graph();
        Hashtable<String,Node> visited = new Hashtable<>();
        for (Node n:getNodes()) {
            n.setValue(Integer.MAX_VALUE);
        }

        s.setValue(0);
        visited.put(s.getId(),s);
        priorityQueue.add(s);


        while(!priorityQueue.isEmpty())
        {
            Node n = priorityQueue.poll();
            visited.put(n.getId(),n);
            for(Edge e: getEdgesOfNode(getIndex(n)))
            {
                Node v;
                if (e.getN1() == n)
                {
                    v = e.getN2();
                }
                else
                {
                    v = e.getN1();
                }
                if ( !visited.containsKey(v.getId()) && v.getValue() > n.getValue() + e.getWeight())
                {
                    v.setValue(n.getValue()+e.getWeight());
                    tree.addNode(n);
                    tree.addNode(v);
                    tree.addEdge(tree.getIndex(n),tree.getIndex(v));
                    priorityQueue.add(v);
                    visited.put(v.getId(),v);
                }
            }
        }


        return  tree;
    }
}
