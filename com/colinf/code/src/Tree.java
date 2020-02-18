class Node {
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }

    public void insert (int value) {
        if (value < data) {
            if (left == null) {
                left = new Node(value);
            } else left.insert(value);
        } else {
            if (value > data) {
                if (right == null) {
                    right = new Node(value);
                } else right.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value == data){ return true; }
        if (value < data) {
            if (left == null) {
                return false;
            } else{
                left.contains(value);
            }
        } else if (value > data) {
            if (right == null) {
                return false;
            } else {
                right.contains(value);
            }
        } else {
            return false;
        }
    }
}