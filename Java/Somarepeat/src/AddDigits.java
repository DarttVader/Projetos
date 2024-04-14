public class AddDigits {
    public int addDigits(int num) {
        while (num >= 10) {
            num = sumOfDigits(num);
        }
        return num;
    }

    private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();

        int num1 = 38;
        System.out.println("Output para o exemplo 1: " + addDigits.addDigits(num1));

        int num2 = 0;
        System.out.println("Output para o exemplo 2: " + addDigits.addDigits(num2));
    }
}
