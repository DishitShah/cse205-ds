import java.util.Scanner;

class Smallest_Even_Multiple{
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0)
            return n;
        else
            return 2 * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Smallest_Even_Multiple solution = new Smallest_Even_Multiple();
        System.out.println(solution.smallestEvenMultiple(n));
    }
}