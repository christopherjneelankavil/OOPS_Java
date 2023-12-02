class Prime {
    public static void main(String[] args) {
        int n = 7;
        boolean flag = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag == false && n != 1) {
            System.out.println("It is prime");
        } 
        else {
            System.out.println("Not a prime");
        }
    }

}
