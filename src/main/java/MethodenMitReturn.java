public class MethodenMitReturn {
    public static void main(String[] args) {
        int lala = calculator(4, 3, '+');
        System.out.println(lala);
    }

    public static int calculator(int num1, int num2, char operator) {
        int sum;
        if (operator == '+') {
            sum = num1 + num2;
        } else {
            sum = num1 - num2;
        }
        return sum;
    }
}

