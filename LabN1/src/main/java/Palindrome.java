public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " : " + Boolean.toString(isPalindrome(s)));
        }
    }

    // Реверс строки
    public static String reverseString(String s) {
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

    // Проверка палиндрома через сравнение с реверсом
    public static boolean isPalindrome(String s) {
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (rev.equals(reverseString(rev))) {
            return true;
        } else {
            return false;
        }
    }
}