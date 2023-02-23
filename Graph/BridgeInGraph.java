// Bridge is the Edge that separate the two graph into two disconnected graph 

import java.util.*;

class BridgeInGraph
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

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,0));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
    }

    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean[] vist,int[] dt, int[] low,int time, int parent)
    {
        vist[curr]=true;
        dt[curr]=low[curr]=++time;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(e.dest==parent)
            {
                continue;
            }
            else if(vist[e.dest])
            {
                low[curr]=Math.min(low[curr],dt[e.dest]);
            }
            else
            {
                dfs(graph,e.dest,vist,dt,low,time,curr);
                low[curr]=Math.min(low[curr],low[e.dest]);
                if(dt[curr]<low[e.dest])
                {
                    System.out.println("Bridge is :"+curr+"---"+e.dest);
                }
            }
        }
    }

    public static void bridge(ArrayList<Edge>[] graph,int V)
    {
        // dt is discovery time
        int[] dt=new int[V];
        // low id low discovery time
        int[] low=new int[V];
        int time=0;

        boolean[] vist=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(!vist[i])
            {
                dfs(graph,i,vist,dt,low,time,-1);
            }
        }

    }

    public static void main(String[] args)
    {
        int V=6;
        ArrayList<Edge>[] graph=new ArrayList[V];

        createGraph(graph);
        
        // for(int i=0;i<graph[3].size();i++)
        // {
        //     Edge e=graph[3].get(i);
        //     System.out.println(e.dest);
        // }

        bridge(graph,V);


    }
}