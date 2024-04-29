public class Similarity_Checker {
    String str1;
    String str2;

    public Similarity_Checker(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public double getlengthScore() {
        int len1 = str1.length();
        int len2 = str2.length();

        if (isTwiceMoreLengthDifference(len1, len2)) return 0;

        int gap = Math.abs(len1-len2);
        int denominator = Math.min(len1, len2);

        return getLengthSimilarityScore((double) gap, denominator);
    }

    private double getLengthSimilarityScore(double gap, int denominator) {
        return  Math.round((1 - gap / denominator) * 60);
    }

    private boolean isTwiceMoreLengthDifference(int len1, int len2) {
        return len1 >= 2 * len2 || len2 >= 2 * len1;
    }
}
