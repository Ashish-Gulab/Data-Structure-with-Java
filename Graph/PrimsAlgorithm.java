import java.util.*;

class PrimsAlgorithm
{
    static class Edge
    {
        int src;
        int dest;
        int wt;

        Edge(int s,int d, int w)
        {
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    public static class Pair implements Comparable<Pair>
    {
        int node;
        int cost;

        public Pair(int n, int c)
        {
            this.node=n;
            this.cost=c;
        }

        @Override
        public int compareTo(Pair p2)
        {
            return this.cost-p2.cost;
        }
    }

    // TC:O(E logE)
    public static void prims(ArrayList<Edge>[] graph, int V)
    {
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        boolean[] vist=new boolean[V];

        int mstCost=0;
        pq.add(new Pair(0,0));

        while(!(pq.isEmpty()))
        {
            Pair curr=pq.remove();
            if(!vist[curr.node])
            {
                vist[curr.node]=true;
                mstCost=mstCost+curr.cost;
                for(int i=0;i<graph[curr.node].size();i++)
                {
                    Edge e=graph[curr.node].get(i);
                    if(!vist[e.dest])
                    {
                        pq.add(new Pair(e.dest,e.wt));
                    }
                }
            }
        }

        System.out.println("Minimum Spanning Tree Cost(MST):"+mstCost);
    }

    public static void createGraph(ArrayList<Edge>[] graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
    }

    public static void main(String[] args)
    {
        int V=4;
        ArrayList<Edge>[] graph=new ArrayList[V];

        createGraph(graph);

        // for(int i=0;i<graph[3].size();i++)
        // {
        //     Edge e=graph[3].get(i);
        //     System.out.println(e.dest+" "+e.wt);
        // }

        prims(graph,V);
    }
}