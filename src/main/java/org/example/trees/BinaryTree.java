package org.example.trees;

import java.util.Objects;

public class BinaryTree {
    private static class Node {
        String value;
        BinaryTree.Node left;
        BinaryTree.Node right;

        public Node(String value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BinaryTree.Node node = (BinaryTree.Node) o;
            return Objects.equals(value, node.value) && Objects.equals(left, node.left) && Objects.equals(right, node.right);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, left, right);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value='" + value + '\'' +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    private Node root = null;

    public void print() {
        traversePrint(root, 0, "");
    }

    private void traversePrint(Node node, int depth, String dir) {
        System.out.println("Depth: " + depth + ", Direction: " + dir + "   Value: " + node.value);
        if(node.left != null) {
            traversePrint(node.left, depth + 1, "L");
        }
        if(node.right != null) {
            traversePrint(node.right, depth + 1, "R");
        }
    }

    /*
        This will traverse the tree and return:
            - A parent node with a child equal to the passed node.
            - A node that is equal to the passed node.
            - A node that does not have a child to traverse to based on the passed node.
     */
    private Node traverseGet(Node t, Node n) {
        if(null == t || null == n) {
            return null;
        }

        if(n.value.compareTo(t.value) < 0) {
            if(null == t.left || n.value.equals(t.left.value)) {
                return t;
            }
            return traverseGet(t.left, n);
        } else if(n.value.compareTo(t.value) > 0) {
            if(null == t.right || n.value.equals(t.right.value)) {
                return t;
            }
            return traverseGet(t.right, n);
        } else {
            return t;
        }
    }

    public void add(String value) {
        addNode(root, new Node(value));
    }

    private void addNode(Node t, Node n) {
        Node f = traverseGet(t, n);
        if(null != f) {
            if(n.value.compareTo(f.value) < 0) {
                f.left = n;
            } else if(n.value.compareTo(f.value) > 0) {
                f.right = n;
            }
        } else {
            root = n;
        }
    }

    public void remove(String value) {
        Node n = new Node(value);
        Node f = traverseGet(root, n);
        if(null != f) {
            if(n.value.equals(f.value)) {
                if(null != f.left) {
                    addNode(root.left, root.right);
                    root = root.left;
                } else {
                    root = root.right;
                }
            }
            if(null != f.left && n.value.equals(f.left.value)) {
                if(null != f.left.left) {
                    addNode(f.left.left, f.left.right);
                    f.left = f.left.left;
                } else {
                    f.left = f.left.right;
                }
            } else if(null != f.right && n.value.equals(f.right.value)) {
                if(null != f.right.left) {
                    addNode(f.right.left, f.right.right);
                    f.right = f.right.left;
                } else {
                    f.left = f.right.right;
                }
            }
        }
    }
}
