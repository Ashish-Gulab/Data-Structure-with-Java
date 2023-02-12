// Graph with connection
// 0----2---3
//       | /
//        1

import java.util.*;
class GraphUsingAdjacencyListWithoutWeights
{
    static class Edge
    {
        int src;
        int dest;

        Edge(int s,int d)
        {
            this.src=s;
            this.dest=d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,2));
    }

    public static void main(String[] args)
    {
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        // neighbours of node 2
        for(int i=0;i<graph[2].size();i++)
        {
            Edge e=graph[2].get(i);
            System.out.print(e.dest+" ");
        }
    }
}