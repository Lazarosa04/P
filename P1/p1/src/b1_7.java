import java.util.Scanner;

public class b1_7 {
    public static void main(String[] args) {
        if (args.length == 0 || args[0].isEmpty()) {
            System.out.println("No expression provided.");
            return;
        }
        String expression = args[0];
        Scanner scan = new Scanner(expression);
        Node root = createPrefix(scan);
        printTree(root);
        System.out.println();
        printInfix(root);
        System.out.println();
        double result = eval(root);
        System.out.println("Result: " + result);
    }

    public static Node createPrefix(Scanner scan) {
        if (!scan.hasNext()) {
            return null;
        }
        String token = null;
        if (scan.hasNextDouble()) {   // next word is a number
            // leaf tree with the number
            token = scan.next();
            System.out.println("Creating leaf node with value: " + token);
            return new Node(token);
        } else {                      // next word is an operator
            // tree with the form: operator leftExpression rightExpression
            // leftExpression and rightExpression can also be created with createPrefix

            token = scan.next();
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                System.out.println("Creating operator node with value: " + token);
            } else {
                System.out.println("Invalid operator: " + token);
                return null;
            }
            Node node = new Node(token);
            node.left = createPrefix(scan);
            node.right = createPrefix(scan);
            return node;
        }
    }

    public static void printTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void printInfix(Node root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            System.out.print("(");
            printInfix(root.left);
        }
        System.out.print(root.value);
        if (root.right != null) {
            printInfix(root.right);
            System.out.print(")");
        }
    }

    public static double eval(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return Double.parseDouble(root.value);
        }
        double leftValue = eval(root.left);
        double rightValue = eval(root.right);
        switch (root.value) {
            case "+":
                return leftValue + rightValue;
            case "-":
                return leftValue - rightValue;
            case "*":
                return leftValue * rightValue;
            case "/":
                return leftValue / rightValue;
            default:
                throw new IllegalArgumentException("Invalid operator: " + root.value);
        }
    }
}

class Node {
    String value;
    Node left, right;

    Node(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
