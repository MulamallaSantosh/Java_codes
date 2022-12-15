class miniumnum {

    // code to make 'ab' free string
    static int abFree(char[] s) {

        // Traverse from end. Keep track of count
        // b's. For every 'a' encountered, add b_count
        // to result and double b_count.
        int b_count = 0;
        int res = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[s.length - i - 1] == 'a') {
                res = (res + b_count);
                b_count = (b_count * 2);
            } else {
                b_count += 1;
            }
        }
        return res;
    }

    // Driver code
    public static void main(String[] args) {
        String s = "aba/bab/";
        System.out.println(abFree(s.toCharArray()));

        s = "aba/bab/";
        System.out.println(abFree(s.toCharArray()));

        s = "aba/bab/";
        System.out.println(abFree(s.toCharArray()));
    }
}
