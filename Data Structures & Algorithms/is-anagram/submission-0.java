class Solution {
    public boolean isAnagram(String s, String t) {
        String[] s1=s.split("");
        String[] s2=t.split("");
        Arrays.sort(s1);
        Arrays.sort(s2);
        String s_1=String.join("",s1);
        String s_2=String.join("",s2);
        if(s_1.equals(s_2)){
            return true;
        }
        return false;
    }
}
