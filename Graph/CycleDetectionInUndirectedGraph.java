import java.util.*;

class CycleDetectionInUndirectedGraph
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

    public static void createGraph(ArrayList<Edge>[] graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,4));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,4));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,2));

        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,4));
    }

    public static boolean isCycle(ArrayList<Edge>[] graph,int curr,boolean[] vist,int parent)
    {
        vist[curr]=true;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(vist[e.dest] && parent!=e.dest)
            {
                return true;
            }
            if(!vist[e.dest])
            {
                if(isCycle(graph,e.dest,vist,curr))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int V=6;
        ArrayList<Edge>[] graph=new ArrayList[V];

        createGraph(graph);

        //code for Neighbours of node 3
        // for(int i=0;i<graph[3].size();i++)
        // {
        //     Edge e=graph[3].get(i);
        //     System.out.println(e.dest);
        // }

        System.out.println(isCycle(graph,0,new boolean[V],-1));
    }
}