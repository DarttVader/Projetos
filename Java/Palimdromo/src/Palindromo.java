public class Palindromo {
    public boolean isPalindromo(int x) {
        if (x < 0) {
            return false;
        }

        String original = String.valueOf(x);
        String reversed = new StringBuilder(original).reverse().toString();

        return original.equals(reversed);
    }

    public static void main(String[] args) {
        Palindromo palindromo = new Palindromo();
        int x1 = 121;
        System.out.println("Output para o exemplo 1: " + palindromo.isPalindromo(x1));
        int x2 = -121;
        System.out.println("Output para o exemplo 2: " + palindromo.isPalindromo(x2));
        int x3 = 10;
        System.out.println("Output para o exemplo 3: " + palindromo.isPalindromo(x3));
    }
}
