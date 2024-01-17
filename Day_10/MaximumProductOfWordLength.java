package CP_Practice.Day_10;

public class MaximumProductOfWordLength {
    public static int maxProduct(String[] words) {
        int max = 0;
        int[] letters = new int[words.length];

        for (int j = 0; j < words.length; j++) {
            String s = words[j];
            for (int i = 0; i < s.length(); i++) {
                int x = (int) s.charAt(i) - 97;
                if (Integer.toBinaryString(letters[j]).length() <= x) {
                    letters[j] += Math.pow(2, x);
                } else if (Integer.toBinaryString(letters[j]).length() >= x
                        && Integer.toBinaryString(letters[j])
                                .charAt(Integer.toBinaryString(letters[j]).length() - 1 - x) != '1') {
                    // System.out.println(x);
                    letters[j] += Math.pow(2, x);
                    // System.out.println(Integer.parseInt(Integer.toBinaryString(letters[j])));
                }
            }
        }

        // for (int i : letters) {
        // System.out.println(i);
        // }
        // for (int j = 0; j < letters.length; j++) {
        // System.out.println(Integer.parseInt(Integer.toBinaryString(letters[j])));
        // }

        for (int i = 0; i < letters.length; i++) {
            for (int j = i + 1; j < letters.length; j++) {
                int b = letters[i] & letters[j];
                if (b == 0) {
                    if (max < words[i].length() * words[j].length()) {
                        // System.out.println(words[i] + " " + words[j]);
                        max = words[i].length() * words[j].length();
                    }
                }
            }
        }

        // System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        String[] words = { "edadc", "ebbfe", "aacdde", "dfe", "cb", "fddddff", "fabca", "adccac", "ece", "ccaf", "feba",
                "bcb", "edadc", "aea", "bacb", "acefa", "fcebffd", "dfeebca", "bedcbaa", "deaccc", "abedc", "dadff",
                "eef", "ddebbb", "abecab", "cd", "abdeee", "eedce", "deef", "dceaddd", "ced", "fbbf", "ba", "eefeda",
                "fb", "cddc", "adafbf", "dded", "aadbf", "caefbaf", "ccebf", "dbb", "ee", "dadcecc", "ddbcabb", "afeaa",
                "ec", "aad", "efde", "cbcda", "cdbdafd", "cddc", "ecaaa", "ae", "cfc", "bccac", "cdcc", "abbbf",
                "fcdface", "ddbcdc", "bfebb", "daed", "bc", "dc", "ecdfc", "eeb", "bb", "dad", "caecb", "fbe", "bbbc",
                "cacea", "dbc", "fbe", "bcfffbd", "aeda", "cff", "ddfc", "ea", "bdfd", "ccb", "cb", "ae", "ceabefa",
                "dcea", "cbaed", "bfedf", "fa", "ccd", "fece", "bceef", "acabca", "dafa", "fdeec", "dac", "cae",
                "adeeadb", "ecacc", "acfe", "de" };
        maxProduct(words);
    }
}
