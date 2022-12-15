class ASCIIstring {

    public static void SuperASCII(String s) {
        int b[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = (int) s.charAt(i) - 97 + 1;
            b[index - 1]++;
        }

        for (int i = 0; i < s.length(); i++) {
            int index = (int) s.charAt(i) - 97 + 1;
            if (b[index - 1] != index) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    public static void main(String args[]) {

        String s = "aab";
        SuperASCII(s);
    }
}
