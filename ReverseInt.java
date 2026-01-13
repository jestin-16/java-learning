public class ReverseInt {
    private int number;

    public ReverseInt(int number) {
        this.number = number;
    }

    public int reverse() {
        int reversed = 0;
        int num = Math.abs(number);

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return number < 0 ? -reversed : reversed;
    }

    public static void main(String[] args) {
        ReverseInt reverseInt = new ReverseInt(-12345);
        System.out.println("Original number: " + reverseInt.number);
        System.out.println("Reversed number: " + reverseInt.reverse());
    }
}