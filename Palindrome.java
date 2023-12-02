class Palindrome {
    public static void main(String[] args) {
        int num = 55;
        int r = 0; // Initialize r to 0
        int n = num;
        
        while (num > 0) {
            int digit = num % 10;
            r = r * 10 + digit;
            num /= 10;
        }

        if (n == r) {
            System.out.println("It is a palindrome");
        } 
        else {
            System.out.println("Not a palindrome");
        }
    }
}
