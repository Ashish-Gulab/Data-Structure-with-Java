import java.util.*;

class BellmanFordAlgorithm
{
    static class Edge
    {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w)
        {
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));
    }

    // TC:(E*V)
    public static void bellmanFord(ArrayList<Edge>[] graph, int src, int V)
    {
        int[] dist=new int[V];
        for(int i=0;i<V;i++)
        {
            if(i!=src)
            {
                dist[i]=Integer.MAX_VALUE;
            }
        }

        // perform updation of weights V-1 Steps
        // TC:O(V)
        for(int i=0;i<(V-1);i++)
        {
            // TC:O(E)
            for(int j=0;j<V;j++)
            {
                for(int k=0;k<graph[j].size();k++)
                {
                    Edge e=graph[j].get(k);
                    int u=e.src;
                    int v=e.dest;
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+e.wt<dist[v])
                    {
                        dist[v]=dist[u]+e.wt;
                    }
                }
            }
        }
        for(int i=0;i<V;i++)
        {
            System.out.print(dist[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        int V=5;
        ArrayList<Edge>[] graph=new ArrayList[V];

        createGraph(graph);

        bellmanFord(graph,0,V);
    }
}