public class Armstrong {
    private int number;

    public Armstrong(int number) {
        this.number = number;
    }

    public boolean isArmstrong() {
        int sum = 0;
        int temp = number;
        int digits = String.valueOf(number).length();

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Armstrong armstrong = new Armstrong(153);
        if (armstrong.isArmstrong()) {
            System.out.println(armstrong.number + " is an Armstrong number.");
        } else {
            System.out.println(armstrong.number + " is not an Armstrong number.");
        }
    }
}
