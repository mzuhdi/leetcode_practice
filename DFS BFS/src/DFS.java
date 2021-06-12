import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFS {
    public static void main (String[] args){

    }

    public static void dfsRecursive (Node start){

    }

    public static void dfsIterative (Node start){
        Stack<Integer> stack = new Stack<>();
        Set<Node> seen = new HashSet<>(); // To keep which node has been seen
        stack.push(start);

        while(!stack.isEmpty()){
            int curr = stack.pop(); // pull a node
            if (!seen.contains(curr)){ //Add to the hashset if is has hasn't been seen.
                seen.add(curr);
            }
            for(Node adjacent : curr.adjacents){ //Get the adjacent node
                if(!seen.contains(adjacent)){ //If the adjacent has not been seen
                    stack.push(adjacent); //add to the stack
                }
            }
        }
    }
}
