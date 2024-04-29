public class Similarity_Checker {
    String str1;
    String str2;

    public Similarity_Checker(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public int getlengthScore() {
        int len1 = str1.length();
        int len2 = str2.length();
        int gap, denominator;

        if (isTwiceMoreLength(len1, len2)) return 0;

        if (len1 > len2) {
            gap = len1 - len2;
            denominator = len2;
        } else {
            gap = len2 - len1;
            denominator = len1;
        }

        return (int) ((1 - (double) gap / denominator) * 60);
    }

    private boolean isTwiceMoreLength(int len1, int len2) {
        return len1 >= 2 * len2 || len2 >= 2 * len1;
    }
}
