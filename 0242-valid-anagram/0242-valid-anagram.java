class Solution {
    public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;

    int[] counts = new int[26]; // for 'a' to 'z'

    for (char c : s.toCharArray()) {
        counts[c - 'a']++; // increment for s
    }

    for (char c : t.toCharArray()) {
        counts[c - 'a']--; // decrement for t
        if (counts[c - 'a'] < 0) {
            return false; // more of this char in t than in s
        }
    }

    return true; // all counts balanced
}

    // public boolean isAnagram(String s, String t) {
    //     if (s.length() != t.length())
    //         return false;

    //     char[] a = s.toCharArray();
    //     char[] b = t.toCharArray();
    //     Arrays.sort(a);
    //     Arrays.sort(b);
    //     return Arrays.equals(a, b);
    // }
}