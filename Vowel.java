import java.util.*;

class Vowel {
    static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' ||
                c == 'i' || c == 'o' || c == 'u');
    }

    static int countSubstringsUtil(char[] s) {
        int count = 0;

        Map<Character, Integer> mp = new HashMap<>();

        int n = s.length;

        int start = 0;

        for (int i = 0; i < n; i++) {
            if (mp.containsKey(s[i])) {
                mp.put(s[i], mp.get(s[i]) + 1);
            } else {
                mp.put(s[i], 1);
            }

            while (mp.containsKey('a') && mp.containsKey('e') &&
                    mp.containsKey('i') && mp.containsKey('o') &&
                    mp.containsKey('u') && mp.get('a') > 0 &&
                    mp.get('e') > 0 && mp.get('i') > 0 &&
                    mp.get('o') > 0 && mp.get('u') > 0) {
                count += n - i;
                mp.put(s[start], mp.get(s[start]) - 1);

                start++;
            }
        }
        return count;
    }

    static int countSubstrings(String s) {
        int count = 0;
        String temp = "";

        for (int i = 0; i < s.length(); i++) {

            if (isVowel(s.charAt(i))) {
                temp += s.charAt(i);
            } else {
                if (temp.length() > 0)
                    count += countSubstringsUtil(temp.toCharArray());
                temp = "";
            }
        }

        if (temp.length() > 0)
            count += countSubstringsUtil(temp.toCharArray());

        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.close();
        String str = s.nextLine();
        System.out.println(countSubstrings(str));
    }
}