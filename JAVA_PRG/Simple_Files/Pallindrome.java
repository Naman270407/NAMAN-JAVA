class Pallindrome {
    public static void main(String[] args) {
        int sum = 0;
        int n = 121;
        int num = n;
        int r;
        while (n != 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (sum == num)
            System.out.println("Pallindrome yes");
        else
            System.out.println("Not");
    }
}
