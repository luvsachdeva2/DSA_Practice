//leetcode 242 Valid anagram
// idea:

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
            for (int x=0;x<s.length();x++)
            {char ch=s.charAt(x);
                int count=1;
             if (mp.containsKey(ch))
                mp.put(ch,mp.get(ch)+1);
             else
             mp.put(ch,count);
            }
        for (int x=0;x<t.length();x++)
            {   char ch=t.charAt(x);
                if(mp.containsKey(ch)&&(mp.get(ch)>0)&&s.length()==t.length())
                    mp.put(ch,mp.get(ch)-1);
                else
                return false; 
            }
        return true;
        
    }
}
/* 
Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
*/