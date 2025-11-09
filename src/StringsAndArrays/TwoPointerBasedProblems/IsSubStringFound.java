package StringsAndArrays.TwoPointerBasedProblems;

public class IsSubStringFound {
    public static void main(String[] args) {
        String t = "ahbgdc";
        String s = "axc";
        System.out.println(IsStringFoundInMainString(s, t));
    }

    public static boolean IsStringFoundInMainString(String s, String t) {
        int previousIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = previousIndex; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    found = true;
                    previousIndex = j + 1;
                    break; //exits j loop and go to i
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
}
