import java.util.*;

class DijkstraAlgorithm
{
    static class Edge
    {
        int src;
        int dest;
        int wt;

        Edge(int s, int d,int w)
        {
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    static class Pair implements Comparable<Pair>
    {
        int node;
        int dist;

        Pair(int n, int dist)
        {
            this.node=n;
            this.dist=dist;
        }

        @Override
        public int compareTo(Pair p2)
        {
            // if this.dist is greater then it return positive value , if this.dist is smaller then it return negative value , if this.dist is equal then it return 0; 
            return this.dist-p2.dist;  // ascending order
            // return p2.dist-this.dist;  // descending order
        }
    }

    // TC:O(E + E logV)     E Logv(PriorityQueue for arranging in ascending order) and E(for traversing every edge)

    public static void dijkstra(ArrayList<Edge>[] graph, int src, int V)
    {
        PriorityQueue<Pair> pq=new PriorityQueue<>();

        int[] dist=new int[V];
        for(int i=0;i<V;i++)
        {
            if(i!=src)
            {
                dist[i]=Integer.MAX_VALUE;
            }
        }

        boolean[] vist=new boolean[V];
        pq.add(new Pair(0,0));

        while(!(pq.isEmpty()))
        {
            Pair curr=pq.remove();
            if(!vist[curr.node])
            {
                for(int i=0;i<graph[curr.node].size();i++)
                {
                    Edge e=graph[curr.node].get(i);
                    int u=e.src;
                    int v=e.dest;

                    if((dist[u]+e.wt)<dist[v])
                    {
                        dist[v]=dist[u]+e.wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
        for(int i=0;i<V;i++)
        {
            System.out.print(dist[i]+" ");
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

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }

    public static void main(String[] args)
    {
        int V=6;
        ArrayList<Edge>[] graph=new ArrayList[V];

        createGraph(graph);

        // Code of neighbours of node 3 with weight
        // for(int i=0;i<graph[3].size();i++)
        // {
        //     Edge e=graph[3].get(i);
        //     System.out.println(e.dest +" "+e.wt);
        // }

        dijkstra(graph,0,V);
    }
}