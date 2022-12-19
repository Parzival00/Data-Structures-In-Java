// Name: Ben Hedges
// Class: CS 3305/W03
// Term: Spring 2022
// Instructor: Betty Kretlow
// Assignment: 11-Part-1-DFS

import java.util.Stack;
import java.util.ArrayList;

public class UnweightedGraphWithNonrecursiveDFS<V> extends UnweightedGraph{
    @Override
    public AbstractGraph.Tree dfs(int v){
        Stack<Integer> stack = new Stack<>();
        boolean[] isVisited = new boolean[getSize()];

        for (int i=0; i < isVisited.length; i++) {
            isVisited[i] = false;
        }

        stack.push(v);

        while(stack.size() != 0){
            v = stack.pop();

            if(isVisited[v] == false){
                System.out.print(v + " ");
                isVisited[v] = true;
            }
            ArrayList<Integer> neighbors = (ArrayList<Integer>) getNeighbors(v);
            for (int neighbor : neighbors) {
                v = neighbor;
                if(isVisited[v] == false){
                    stack.push(neighbor);
                }
            }
        }
        return null;
    }
}
