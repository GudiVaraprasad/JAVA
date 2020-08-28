
/* Implement a Graph data structure in Java using adjacency List */

import java.util.*;
import java.io.*;
public class Graph 
{
	int vertices;
	LinkedList<Integer> adjList[];

	public Graph(int vertices)
	{
		this.vertices=vertices;
		adjList = new LinkedList[vertices];

		for(int i=0;i<vertices;i++)
		{
			adjList[i] = new LinkedList<>();
		}
	}

	void addEdge(int source, int destination)
	{
		adjList[source].add(destination);
		adjList[destination].add(source);
	}

	void displayGraph()
	{
		for(int i=0;i<vertices;i++)
		{
			if(adjList[i].size()>0)
			{
				System.out.println("Vertex "+i+" is connected to : ");
				for(int j=0;j<adjList[i].size();j++)
				{
					System.out.println(adjList[i].get(j)+" ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no. of vertices : ");
		int V = in.nextInt();
		Graph graphObj = new Graph(V);

		for(int i=0;i<V;i++)
		{
			System.out.println("Enter the source and destination for vertex "+(i+1)+" :");
			int source = in.nextInt();
			int destination = in.nextInt();
			graphObj.addEdge(source,destination);
		}
		graphObj.displayGraph();
	}
}

/*
Contributed by GVP
*/
