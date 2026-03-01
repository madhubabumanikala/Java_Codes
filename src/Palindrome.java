public class Palindrome {

    public static void main(String[] args) {

        String str = "madam";

        int i = 0; int j= str.length()-1;

        boolean isPalindrome = true;

        while(i<j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

            if (isPalindrome) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }

    }
}
