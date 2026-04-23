import java.util.*;
public class BFS{
    static Map<Character , List<Character>> graph=new HashMap<>();
    public static void main(String args[])
    {
        graph.put('A',Arrays.asList('B','D','E'));
        graph.put('B',Arrays.asList('A','C'));
        graph.put('C',Arrays.asList('B','G'));
        graph.put('D' ,Arrays.asList('A','E'));
        graph.put('E' ,Arrays.asList('A','D','F'));
        graph.put('F',Arrays.asList('E','G'));
        graph.put('G',Arrays.asList('C','F'));
        bfs('A');
    }
    public static void bfs(char start){
        Set<Character>visited =new HashSet<>();
        Queue<Character>queue = new LinkedList<>();
        visited.add(start);
        queue.add(start);
        while(!queue.isEmpty()){
            char node=queue.poll();
        System.out.print(node+" ");
        for(char neighbor: graph.get(node))
        {
          if(!visited.contains(neighbor)){
            visited.add(neighbor);
            queue.add(neighbor);
          }
        }
        }
    }
}