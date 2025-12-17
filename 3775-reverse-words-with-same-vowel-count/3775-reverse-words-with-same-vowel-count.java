class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int countVowel = countVowel(words[0]);
        for(int i = 1 ; i < words.length ; i++){
            int currCount = countVowel(words[i]);
            if(currCount==countVowel){
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        StringBuilder res = new StringBuilder();
    for(String str : words){
        res.append(str);
        res.append(" ");
    }    
    res.deleteCharAt(res.length()-1);
    return res.toString();
    }

    public int countVowel(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }
        return count;
    }
}