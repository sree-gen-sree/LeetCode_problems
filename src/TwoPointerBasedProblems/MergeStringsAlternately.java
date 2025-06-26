package TwoPointerBasedProblems;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqrstuv";
        String result = mergeAlternately(word1, word2);
        System.out.println(result); // Output: apbqcr
    }
//    public static String mergeAlternately(String word1, String word2) {
//        char[] w1 = word1.toCharArray();
//        char[] w2 = word2.toCharArray();
//        int totalLength = w1.length + w2.length;
//        char[] merged = new char[totalLength];
//        int i = 0, j = 0, k = 0;
//        while (i < w1.length || j < w2.length) {
//            if (i < w1.length) {
//                merged[k++] = w1[i];
//                i++;
//            }
//            if (j < w2.length) {
//                merged[k++] = w2[j];
//                j++;
//            }
//        }
//
//        return new String(merged);
//    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length())
                merged.append(word1.charAt(i++));
            if (j < word2.length())
                merged.append(word2.charAt(j++));
        }

        return merged.toString();
    }
}

