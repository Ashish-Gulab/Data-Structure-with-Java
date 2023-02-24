// A vertex in an undirected connected graph is an articulation point (or cut vertex) if removing it (and edges through it) disconnects the graph.

// 1----0----3
// |  /      |
// | /       |
// 2         4
// 0 is the articulation point
// 3 is the articulation point

// Ancester: A node A that was discovered before curr node in DFS, is the ancester of curr.

// The time complexity of tarjan,s algorithm is O(V+E). 
// We can use Naive Algorithm to find the articulation point(to disconnect every vertex one by one and then check the articulation point) but it has very high time complexity TC:O(V*(V+E)). So we prefer to use Tarjans Algorithm.
// Tarjan's Algorithm is based on DFS 

import java.util.*;

class ArticulationPointUsingTarjansAlgorithm
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
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
    }

    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean[] vist,int parent, int[] dt,int[] low,boolean[] ap,int time)
    {
        vist[curr]=true;
        dt[curr]=low[curr]=++time;
        int children=0;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(parent==e.dest)
            {
                continue;
            }
            else if(vist[e.dest])
            {
                low[curr]=Math.min(low[curr],dt[e.dest]);
            }
            else
            {
                dfs(graph,e.dest,vist,curr,dt,low,ap,time);
                low[curr]=Math.min(low[curr],low[e.dest]);
                if(dt[curr]<=low[e.dest] && parent!=-1)
                {
                    ap[curr]=true;
                }
            }
            children++;
        }
        if(parent==-1 && children>1)
        {
            ap[curr]=true;
        }
    }

    public static void articulation(ArrayList<Edge>[] graph, int V)
    {
        int[] dt=new int[V];
        int[] low=new int[V];
        int time=0;
        boolean[] vist=new boolean[V];
        boolean[] ap=new boolean[V];

        for(int i=0;i<V;i++)
        {
            if(!vist[i])
            {
                dfs(graph,i,vist,-1,dt,low,ap,time);
            }
        }

        for(int i=0;i<V;i++)
        {
            if(ap[i])
            {
                System.out.println("Articultion Point:"+i);
            }
        }
    }

    public static void main(String[] args)
    {
        int V=5;
        ArrayList<Edge>[] graph=new ArrayList[V];

        createGraph(graph);

        // for(int i=0;i<graph[3].size();i++)
        // {
        //     Edge e=graph[3].get(i);
        //     System.out.println(e.dest);
        // }

        articulation(graph,V);
    }
}