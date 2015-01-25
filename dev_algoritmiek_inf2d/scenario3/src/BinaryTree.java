/**
 * Created by Fabian on 25-1-2015.
 */
public class BinaryTree {

    Klant klant2  = new Klant(23, "Boe", "Jon", 89, "v", "Amsterdam", "hallo1@live.nl");
    Node root = new Node(klant2.getKlantid());

    public static void main(String[] args) {
        new BinaryTree().run();
    }

    static class Node {
        Node left;

        Node right;

        int value;

        public Node getRight(){
            return this.right;
        }

        public Node getLeft(){
            return this.left;
        }

        public void setRight(Node n){
            this.right = n;
        }

        public void setLeft(Node n){
            this.left = n;
        }

        public void setValue(int value){
            this.value = value;
        }

        public Node(int value) {
            this.value = value;
        }
    }

    public void run() {
        Klant klant1  = new Klant(80, "Amon", "Jon", 32, "m", "Amsterdam", "hallo1@live.nl");
        Klant klant3  = new Klant(56, "Doe", "Joh", 44, "m", "Leiden", "hallo2@live.nl");
        Klant klant4  = new Klant(1, "Maeyer", "Bram", 8, "m", "Brabant", "hallo3@live.nl");
        // build the simple tree from chapter 11.
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.value);
        insert(root, klant1);
        insert(root, klant2);
        insert(root, klant3);
        insert(root, klant4);

        System.out.println("Traversing tree in order");
        printInOrder(root);
        System.out.println("Traversing tree front-to-back from location 7");
        printFrontToBack(root, 7);

        System.out.println("Deleterino");
        delete(root, 1);
        printInOrder(root);

    }

    public void insert(Node node, Klant klant) {
        if (klant.getKlantid() < node.value) {
            if (node.left != null) {
                insert(node.left, klant);
            } else {
                System.out.println("  Inserted " + klant.getAchternaam() + " to left of "
                        + node.value);
                node.left = new Node(klant.getKlantid());
            }
        } else if (klant.getKlantid() > node.value) {
            if (node.right != null) {
                insert(node.right, klant);
            } else {
                System.out.println("  Inserted " + klant.getAchternaam() + " to right of "
                        + node.value);
                node.right = new Node(klant.getKlantid());
            }
        }
    }

    private static Node delete(Node n, int klantid) {
        if (n == null) {
            return null;
        }

        if (klantid == n.value) {
            // n is the node to be removed
            if (n.getLeft() == null && n.getRight() == null) {
                return null;
            }
            if (n.getLeft() == null) {
                return n.getRight();
            }
            if (n.getRight() == null) {
                return n.getLeft();
            }

            // if we get here, then n has 2 children
            Node smallVal = n.getRight();

            n.setValue(smallVal.value);
            n.setRight(delete(n.getRight(), smallVal.value));
            return n;
        }

        else if (klantid < n.value) {
            n.setLeft( delete(n.getLeft(), klantid) );
            return n;
        }

        else {
            n.setRight( delete(n.getRight(), klantid) );
            return n;
        }
    }

    public void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.println("  Traversed " + node.value);
            printInOrder(node.right);
        }
    }

    /**
     * uses in-order traversal when the origin is less than the node's value
     *
     * uses reverse-order traversal when the origin is greater than the node's
     * order
     */
    public void printFrontToBack(Node node, int camera) {
        if (node == null)
            return;
        if (node.value > camera) {
            // print in order
            printFrontToBack(node.left, camera);
            System.out.println("  Traversed " + node.value);
            printFrontToBack(node.right, camera);
        } else if (node.value < camera) {
            // print reverse order
            printFrontToBack(node.right, camera);
            System.out.println("  Traversed " + node.value);
            printFrontToBack(node.left, camera);
        } else {
            // order doesn't matter
            printFrontToBack(node.left, camera);
            printFrontToBack(node.right, camera);
        }
    }
}
