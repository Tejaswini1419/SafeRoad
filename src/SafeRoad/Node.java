package SafeRoad;

public class Node {

    Accident data;
    Node left, right;

    public Node(Accident data) {
        this.data = data;
        left = right = null;
    }
}