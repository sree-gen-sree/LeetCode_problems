package TwoPointerBasedProblems;

public class ReverseAlphabets {
    public static void main(String[] args) {
        String name = "-abcdhjfkh*";
        System.out.println(ReverseLogic(name));
    }
    public static String ReverseLogic(String s){
        char[] ch = s.toCharArray();
        int l = 0;
        int r = ch.length-1;
        while (l < r){
            char temp =  ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }
        return new String(ch);
    }
}
