// 1-->0<
//     | \
//     |  3
//    >2 />

import java.util.*;

class CycleDetectionInDirectedGraph
{
    static class Edge
    {
        int src;
        int dest;

        Edge(int s, int d)
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

        graph[1].add(new Edge(1,0));
        graph[0].add(new Edge(0,2));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));
    }

    // TC:O(V+E)
    public static boolean isCycle(ArrayList<Edge> graph[], boolean[] vist, boolean[] rec, int curr)
    {
        vist[curr]=true;
        rec[curr]=true;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(rec[e.dest])
            {
                return true;
            }
            if(!vist[e.dest])
            {
                if(isCycle(graph,vist,rec,e.dest))
                {
                    return true;
                }
            }
        }
        rec[curr]=false;
        return false;
    }

    public static void main(String[] args)
    {
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        boolean[] vist=new boolean[V];
        boolean[] rec=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(!vist[i])
            {
                boolean cycle=isCycle(graph,vist,rec,i);
                if(cycle)
                {
                    System.out.println(cycle);
                    break;
                }
            }
        }
    }
}