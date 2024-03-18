public class Main {
    public static void main(String[] args) {
        class Node{
            int value;
            Node left;
            Node right;
            public Node(int value, Node left, Node right){
                this.value = value;
                this.left = left;
                this.right = right;
            }
            public Node(int value){
                this.value = value;
            }
            public int Sum(){
                int sum = value;
                if (left != null){
                    sum += left.Sum();
                }
                if (right != null){
                    sum += right.Sum();
                }
                return  sum;
            }
            public Node FindMax(Node max){
                if (right == null){
                    System.out.println(max.value);
                    return max;
                }
                return max.FindMax(right);
            }
            public Node FindMin(Node min){
                if (min.left == null){
                    System.out.println(min.value);
                    return min;
                }
                return min.FindMin(min.left);
            }
            public void printTree(Node tree){
                if(tree.left != null){
                    tree.left.printTree(tree.left);
                }
                System.out.println(tree.value);
                if(tree.right != null){
                    tree.right.printTree(tree.right);
                }
            }
            public void InsertNode(Node mainTree, Node add){
                if(add.value < mainTree.value){
                    if(mainTree.left == null){
                        mainTree.left = add;
                    }
                    else mainTree.left.InsertNode(mainTree.left, add);
                }
                if(mainTree.value <= add.value){
                    if(mainTree.right == null){
                        mainTree.right = add;
                    }
                    else {
                        mainTree.right.InsertNode(mainTree.right, add);
                    }
                }
            }
            public  void DeleteNode(Node deleteNode){
                if(deleteNode.left == null && deleteNode.right == null){
                    deleteNode = null;
                }
                if(deleteNode.left != null) {
                    deleteNode = deleteNode.left.FindMax(deleteNode.left);
                }
                if(deleteNode.right != null){
                }
            }
        }
        Node root = new Node(20,
                new Node(7,
                        new Node(4,
                                null,
                                new Node(6)),
                        new Node(9)),
                new Node(35,
                        new Node(31,
                                new Node(28),
                                null),
                        new Node(40,
                                new Node(38),
                                new Node(52))));
        Node add = new Node(13);
        root.InsertNode(root, add);
        root.printTree(root);
    }
}