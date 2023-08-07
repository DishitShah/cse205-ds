import java.util.Scanner;
class Sum_Multiples {
    public int sumOfMultiples(int n) {
        int totalSum = 0;
        for (int num = 1; num <= n; num++) {
            if (num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
                totalSum += num;
            }
        }
        return totalSum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Sum_Multiples solution = new Sum_Multiples();
        System.out.println(solution.sumOfMultiples(n));
    }
}