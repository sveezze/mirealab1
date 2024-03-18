import java.util.*;

public class Main {
    Scanner scanner = new Scanner(System.in);
    class  Node {
        Node next;
        int value;
        public Node(int val){
            value = val;
            next = null;
        }
        class Tree{
            int value;
            List<Tree> trees= new ArrayList<>();
            public Tree(int val){
                value = val;
            }
            public Tree createTree(Tree tree, int val){
                if(tree.trees != null){
                    trees.add(new Tree(val));
                    return tree;                }
                trees = new ArrayList<>(val);
                return tree;
            }
        }
        public void createList(int val, Node list) {
            val = list.value;
        }
        public int appendEl(Node list, int val){
            if(list.next != null){
                appendEl(list.next, val);
            }
            list.next = new Node(val);
            return 1;
        }
    }
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();

        capitals.put("Russia", "Moscow");
        capitals.put("Germany", "Berlin");
        capitals.put("France", "Paris");

        String capitalOfRussia = capitals.get("Russia");
        System.out.println("Столица России: " + capitalOfRussia);

        if (capitals.containsKey("Germany")) {
            System.out.println("Столица Германии: " + capitals.get("Germany"));
        }

        System.out.println("Все страны и их столицы:");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}