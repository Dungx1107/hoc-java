
package tinhTrungTo;

import java.util.Scanner;
import java.util.Stack;

public class InfixEvaluator {

    // Hàm trả về độ ưu tiên của toán tử
    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }

    // Hàm thực hiện phép toán với hai toán hạng a và b
    private static double applyOp(double a, double b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return a / b;
            case '^':
                return Math.pow(a, b);
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    // Hàm chuyển đổi biểu thức trung tố thành biểu thức hậu tố
    private static String infixToPostfix(String expression) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // Bỏ qua khoảng trắng
            if (c == ' ')
                continue;

            // Nếu là số, thêm vào hậu tố
            if (Character.isDigit(c) || c == '.') {
                while (i < expression.length() &&
                        (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    postfix.append(expression.charAt(i++));
                }
                postfix.append(' ');
                i--; // Lùi lại để không bỏ qua ký tự hiện tại
            }
            // Nếu là dấu mở ngoặc, đẩy vào stack ops
            else if (c == '(') {
                ops.push(c);
            }
            // Nếu là dấu đóng ngoặc, xử lý các toán tử trong ngoặc
            else if (c == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    postfix.append(ops.pop()).append(' ');
                }
                ops.pop(); // Loại bỏ dấu '(' khỏi stack
            }
            // Nếu là toán tử, xử lý toán tử
            else {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(c)) {
                    postfix.append(ops.pop()).append(' ');
                }
                ops.push(c);
            }
        }

        // Đẩy các toán tử còn lại vào hậu tố
        while (!ops.isEmpty()) {
            postfix.append(ops.pop()).append(' ');
        }

        return postfix.toString();
    }

    // Hàm tính giá trị của biểu thức hậu tố
    private static double evaluatePostfix(String postfix) {
        Stack<Double> values = new Stack<>();
        String[] tokens = postfix.split("\\s+");

        for (String token : tokens) {
            if (token.isEmpty())
                continue;

            if (Character.isDigit(token.charAt(0)) || token.contains(".")) {
                values.push(Double.parseDouble(token));
            } else {
                double val2 = values.pop();
                double val1 = values.pop();
                char op = token.charAt(0);
                values.push(applyOp(val1, val2, op));
            }
        }

        return values.pop();
    }

    // Hàm tính giá trị của biểu thức trung tố
    public static double evaluateInfix(String expression) {
        String postfix = infixToPostfix(expression);
        return evaluatePostfix(postfix);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an infix expression:");
        String expression = scanner.nextLine();
        scanner.close();

        try {
            double result = evaluateInfix(expression);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


//package tinhTrungTo;
//
//import java.util.Scanner;
//import java.util.Stack;
//
//public class InfixEvaluator {
//
//    // Hàm trả về độ ưu tiên của toán tử
//    private static int precedence(char op) {
//        switch (op) {
//            case '+':
//            case '-':
//                return 1;
//            case '*':
//            case '/':
//                return 2;
//            default:
//                return 0;
//        }
//    }
//
//    // Hàm thực hiện phép toán với hai toán hạng a và b
//    private static double applyOp(double a, double b, char op) {
//        switch (op) {
//            case '+':
//                return a + b;
//            case '-':
//                return a - b;
//            case '*':
//                return a * b;
//            case '/':
//                if (b == 0) {
//                    throw new ArithmeticException("Division by zero");
//                }
//                return a / b;
//            default:
//                throw new IllegalArgumentException("Invalid operator");
//        }
//    }
//
//    // Hàm chuyển đổi biểu thức trung tố thành biểu thức hậu tố
//    private static String infixToPostfix(String expression) {
//        StringBuilder postfix = new StringBuilder();
//        Stack<Character> ops = new Stack<>();
//
//        for (int i = 0; i < expression.length(); i++) {
//            char c = expression.charAt(i);
//
//            // Bỏ qua khoảng trắng
//            if (c == ' ')
//                continue;
//
//            // Nếu là số, thêm vào hậu tố
//            if (Character.isDigit(c) || c == '.') {
//                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
//                    postfix.append(expression.charAt(i++));
//                }
//                postfix.append(' ');
//                i--; // Lùi lại để không bỏ qua ký tự hiện tại
//            }
//            // Nếu là dấu mở ngoặc, đẩy vào stack ops
//            else if (c == '(') {
//                ops.push(c);
//            }
//            // Nếu là dấu đóng ngoặc, xử lý các toán tử trong ngoặc
//            else if (c == ')') {
//                while (!ops.isEmpty() && ops.peek() != '(') {
//                    postfix.append(ops.pop()).append(' ');
//                }
//                ops.pop(); // Loại bỏ dấu '(' khỏi stack
//            }
//            // Nếu là toán tử, xử lý toán tử
//            else {
//                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(c)) {
//                    postfix.append(ops.pop()).append(' ');
//                }
//                ops.push(c);
//            }
//        }
//
//        // Đẩy các toán tử còn lại vào hậu tố
//        while (!ops.isEmpty()) {
//            postfix.append(ops.pop()).append(' ');
//        }
//
//        return postfix.toString();
//    }
//
//    // Hàm tính giá trị của biểu thức hậu tố
//    private static double evaluatePostfix(String postfix) {
//        Stack<Double> values = new Stack<>();
//        String[] tokens = postfix.split("\\s+");
//
//        for (String token : tokens) {
//            if (token.isEmpty())
//                continue;
//
//            if (Character.isDigit(token.charAt(0)) || token.contains(".")) {
//                values.push(Double.parseDouble(token));
//            } else {
//                double val2 = values.pop();
//                double val1 = values.pop();
//                char op = token.charAt(0);
//                values.push(applyOp(val1, val2, op));
//            }
//        }
//
//        return values.pop();
//    }
//
//    // Hàm tính giá trị của biểu thức trung tố
//    public static double evaluateInfix(String expression) {
//        String postfix = infixToPostfix(expression);
//        return evaluatePostfix(postfix);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an infix expression:");
//        String expression = scanner.nextLine();
//        scanner.close();
//
//        try {
//            double result = evaluateInfix(expression);
//            System.out.println("Result: " + result);
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//}
