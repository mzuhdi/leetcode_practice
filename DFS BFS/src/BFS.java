import java.util.*;

public class BFS {

    public static void main (String[] args){

    }

    public static void bfsIterative (Node start){
        Queue<Integer> queue = new LinkedList<>();
        Set<Node> seen = new HashSet<>(); // To keep which node has been seen
        queue.add(start);

        while(!queue.isEmpty()){
            int curr = queue.poll(); // pull a node
            if (!seen.contains(curr)){ //Add to the hashset if is has hasn't been seen.
                seen.add(curr);
            }
            for(Node adjacent : curr.adjacents){ //Get the adjacent node
                if(!seen.contains(adjacent)){ //If the adjacent has not been seen
                    queue.add(adjacent); //add to the stack
                }
            }
        }
    }
}
