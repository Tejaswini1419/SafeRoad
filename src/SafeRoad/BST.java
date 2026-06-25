package SafeRoad;

public class BST {

    Node root;

    public Node insert(Node root, Accident accident) {

        if (root == null)
            return new Node(accident);

        if (accident.id < root.data.id)
            root.left = insert(root.left, accident);

        else if (accident.id > root.data.id)
            root.right = insert(root.right, accident);

        return root;
    }

    public void addAccident(Accident accident) {
        root = insert(root, accident);
    }

    public Accident search(Node root, int id) {

        if (root == null)
            return null;

        if (root.data.id == id)
            return root.data;

        if (id < root.data.id)
            return search(root.left, id);

        return search(root.right, id);
    }

    public void inorder(Node root) {

        if (root != null) {

            inorder(root.left);

            System.out.println(root.data);

            inorder(root.right);
        }
    }
}