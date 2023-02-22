// 1--->0---->3
// ^  /       |
// | /        |
// 2<        >4
// 1 0 2  is SSC1
// 3 is SSC2
// 4 is SSC3

// SSC(Strongly Connected Components) is a Component in which we can reach every vertex of the component from every vertex in that component.

// Kosaraju's Algorithm( TC: O(V+E)) is based on reverse dfs. It is based on the topological sorting. It is used to find the Strongly Connected Components. It is applicable on the directed graph.

// Steps of Kosaraju's Algorthm:
// a. Get nodes in stack(topological Sort). TC: O(V+E)
// b. Transpose the graph.  TC: O(V+E)
// c. Do dfs according to stack nodes on the transpose graph.  TC: O(V+E)

import java.util.*;

class KosarajusAlgorithm
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

    public static void topologicalSort(ArrayList<Edge>[]graph, int curr, boolean[] vist, Stack<Integer> s)
    {
        vist[curr]=true;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(!vist[e.dest])
            {
                topologicalSort(graph,e.dest,vist,s);
            }
        }

        s.push(curr);
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vist)
    {
        vist[curr]=true;
        System.out.print(curr+" ");

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(!vist[e.dest])
            {
                dfs(graph,e.dest,vist);
            }
        }
    }

    public static void kosaraju(ArrayList<Edge>[] graph,int V)
    {
        // Step:1
        Stack<Integer> s=new Stack<>();
        boolean[] vist=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(!vist[i])
            {
                topologicalSort(graph,i,vist,s);
            }
        }

        // Step:2
        ArrayList<Edge>[] transpose=new ArrayList[V];

        for(int i=0;i<V;i++)
        {
            vist[i]=false;
            transpose[i]=new ArrayList<Edge>();
        }

        for(int i=0;i<V;i++)
        {
            for(int j=0;j<graph[i].size();j++)
            {
                Edge e=graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest,e.src));
            }
        }

        // Step:3
        while(!s.isEmpty())
        {
            int curr=s.pop();
            if(!vist[curr])
            {
                dfs(transpose,curr,vist);
                System.out.println();
            }
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));
    }

    public static void main(String[] args)
    {
        int V=5;
        ArrayList<Edge>[] graph=new ArrayList[V];

        createGraph(graph);

        kosaraju(graph,V);
    }
}