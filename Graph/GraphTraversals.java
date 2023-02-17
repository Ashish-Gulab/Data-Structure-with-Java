//    1 ---3
//   /     | \
//  0      |  5 --6
//   \     | /  
//    2 ---4

import java.util.*;
class GraphTraversals
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

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
    
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }

    // BFS for connected Graph   TC:(V+E)
    // public static void bfs(ArrayList<Edge> graph[], int V)
    // {
    //     Queue<Integer> q=new LinkedList<>();
    //     boolean[] vist=new boolean[V];
    //     q.add(0);
    //     while(!q.isEmpty())
    //     {
    //         int curr=q.remove();
    //         if(vist[curr]==false)
    //         {
    //             System.out.print(curr+" ");
    //             vist[curr]=true;
    //         }
    //         for(int i=0;i<graph[curr].size();i++)
    //         {
    //             Edge e=graph[curr].get(i);
    //             q.add(e.dest);
    //         }
    //     }
    // }

    // BFS for connected Graph and Disconnected graph  TC:(V+E)
    public static void bfs(ArrayList<Edge> graph[], int V,int start, boolean[] vist)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        while(!q.isEmpty())
        {
            int curr=q.remove();
            if(vist[curr]==false)
            {
                System.out.print(curr+" ");
                vist[curr]=true;
            }
            for(int i=0;i<graph[curr].size();i++)
            {
                Edge e=graph[curr].get(i);
                q.add(e.dest);
            }
        }
    }

    // DFS call for connected and disconnected graph   TC:O(V+E)
    public static void dfs(ArrayList<Edge> graph[], boolean[] vist, int curr)
    {
        System.out.print(curr+" ");
        vist[curr]=true;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(vist[e.dest]==false)
            {
                dfs(graph,vist,e.dest);
            }
        }
    }

    public static void main(String[] args)
    {
        int V=7;
        ArrayList<Edge> graph[]=new ArrayList[V];

        createGraph(graph);

        // Neighbours Of 2
        // for(int i=0;i<graph[3].size();i++)
        // {
        //     Edge e=graph[3].get(i);
        //     System.out.println(e.dest);
        // }

        // BFS call for connected Graph   TC:(V+E)
        // bfs(graph,V);
        
        // BFS call for connected Graph and Disconnected graph  TC:(V+E)
        boolean[] vist=new boolean[V];
        // for(int i=0;i<V;i++)
        // {
        //     if(vist[i]==false)
        //     {
        //         bfs(graph,V,i,vist);
        //     }
        // }
        System.out.println();

        // DFS call for connected and disconnected graph   TC:O(V+E)
        for(int i=0;i<V;i++)
        {
            if(vist[i]==false)
            {
                dfs(graph,vist,i);
            }
        }
    }
}