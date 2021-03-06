package bfs.algorithm;

import graph.components.Vertex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * List based implementation of the queue data structure.
 * @author Rahul Choubey
 */
public class Queue<T>
{
	private List<Vertex> vertices=Collections.emptyList();
	
	public void enqueue(Vertex vertex)
	{
		if(vertices.isEmpty())
		{
			vertices = new ArrayList<>();
		}
		vertices.add(vertex);
	}
	
	/**
	 * The dequeue operation keeps track of unused space and shifts the elements left if unused space is available.
	 * @return An Optional of {@link Vertex}.
	 */
	public Optional<Vertex> dequeue()
	{
		return Optional.ofNullable(vertices.remove(0));
	}
	
	public boolean isQueueEmpty()
	{
		if(vertices.isEmpty())
		{
			return true;
		}
		
		return false;
	}
}
