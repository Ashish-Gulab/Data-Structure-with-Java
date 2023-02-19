// Topological Sorting is applicable only for the DAG(Directed Acyclic Graph)
// DAG is directed graph with no cycle
// It is a linear order of vertices such that every directed edge u->v, the vertex u always comes before the vertex v in the order

import java.util.*;

class TopologicalSorting
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

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
    }

    public static void topologicalSort(ArrayList<Edge> graph[], int curr,boolean[] vist,Stack<Integer> stack)
    {
        vist[curr]=true;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(!vist[e.dest])
            {
                topologicalSort(graph, e.dest, vist, stack);
            }
        }
        stack.push(curr);
    }

    public static void main(String[] args)
    {
        int V=6;
        ArrayList<Edge> graph[]=new ArrayList[V];

        createGraph(graph);

        // for(int i=0;i<graph[3].size();i++)
        // {
        //     Edge e=graph[3].get(i);
        //     System.out.println(e.dest);
        // }

        // Time Complexity is same as dfs
        boolean[] vist=new boolean[V];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<V;i++)
        {
            if(!vist[i])
            {
                topologicalSort(graph,i,vist,stack);
            }
        }
        while(!(stack.isEmpty()))
        {
            System.out.print(stack.pop()+" ");
        }
    }
}