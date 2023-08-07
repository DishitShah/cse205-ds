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

        Solution solution = new Solution();
        System.out.println(solution.smallestEvenMultiple(n));
    }
}