//    1 ---3
//   /     | \
//  0      |  5 --6
//   \     | /  
//    2 ---4

import java.util.*;

class AllPathFromSourceToDestination
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

    public static void allPaths(ArrayList<Edge> graph[], boolean[] vist, int curr, int target, String path)
    {
        if(curr==target)
        {
            System.out.println(path);
            return;
        }

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(vist[e.dest]==false)
            {
                vist[curr]=true;
                allPaths(graph,vist,e.dest,target,path+e.dest);
                vist[curr]=false;
            }
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

    public static void main(String[] args)
    {
        int V=7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        // for(int i=0;i<graph[3].size();i++)
        // {
        //     Edge e=graph[3].get(i);
        //     System.out.println(e.dest);
        // }

        boolean[] vist=new boolean[V];
        String path;
        allPaths(graph,vist,0,5,"0");
    }
}