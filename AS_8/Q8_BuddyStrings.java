/*<aside>
💡 **Question 8**

Given two strings s and goal, return true *if you can swap two letters in* s *so the result is equal to* goal*, otherwise, return* false*.*

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

- For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

**Example 1:**

**Input:** s = "ab", goal = "ba"

**Output:** true

**Explanation:** You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.

</aside> */

package PPT.AS_8;

public class Q8_BuddyStrings {

    static boolean buddyStrings(String s, String goal) {
        if(s == null || goal == null || s.length() != goal.length() || s.length() < 2){
            return false;
        }
        if(s.equals(goal)){
            int[] map = new int[26];
            for(int i = 0; i < s.length(); i++){
                if(map[s.charAt(i) - 'a'] == 1){
                    return true;
                }else{
                    map[s.charAt(i) - 'a'] = 1;
                }
            }
        }
        char[] s1 = s.toCharArray();
        char[] s2 = goal.toCharArray();
        char s1_1 = '1', s1_2 = '2', s2_1 = '3', s2_2 = '4';
        boolean found1stDiff = false;
        boolean found2ndDiff = false;

        for(int i = 0; i < s1.length; i++){
            if(s1[i] != s2[i]){
                if(!found1stDiff){
                    found1stDiff = true;
                    s1_1 = s1[i];
                    s2_1 = s2[i];
                }else if(!found2ndDiff){
                    found2ndDiff = true;
                    s1_2 = s1[i];
                    s2_2 = s2[i];
                    if(s1_2 != s2_1 || s1_1 != s2_2){
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        return found1stDiff && found2ndDiff;
    }
    
    public static void main(String[] args) {
        String s = "ab", goal = "ba";
        System.out.println(buddyStrings(s, goal));
    }
    
}
