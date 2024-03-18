import java.util.ArrayList;
import java.util.List;

public class Main {
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
    }
}