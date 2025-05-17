
//ACCEPTED Solution

class Solution {

    public int lengthOfLongestSubstring(String s) {
//         //while(left pointer has not reached last)
//         //include maadbahuda window li,{ add to hashset,len increment madu, move maadu}
//         //ida break character, move and calculate length


//         Set<Character> set = new HashSet<>();

//         if(s.length()==0)
//             return 0;

//         int maxlen = 1;
//         int left = 0, right = 1;

//         set.add(s.charAt(left));

//         while(left<s.length()-1){
//             while(right<s.length()&&!set.contains(s.charAt(right))){
//                 set.add(s.charAt(right));
//                 maxlen = right-left+1>maxlen?right-left+1:maxlen;
//                 right++;
//             }

//             while(left<s.length()&&s.charAt(left)!=s.charAt(right)){
//                 set.remove(s.charAt(left));
//                 left++;
//             }

//             set.remove(s.charAt(left));
//             left++;
//         }

//         return maxlen;


//     }
    //     //set declare
    //     //l start with ind 0, add ind 0 ele to set
    //     //r start from l
        //while(l<n)
        //while(r<n&&!set.contains(s.charAt(r+1))) r++;
        //l++;

        if(s.length()==0)
        return 0;
        Set<Character> set = new HashSet<Character>();
        set.add(s.charAt(0));
        int left = 0, right = left+1, max=0;
        int n = s.length();
        while(left<n){
            
            while(right<n&&!set.contains(s.charAt(right))) {set.add(s.charAt(right));right++;}
            int lenOfsubStr = right-left;
            max = lenOfsubStr>max?lenOfsubStr: max;
            set.remove(s.charAt(left));
            left++;
        }
        
        return max;
    }
}
//MISTAKES IN THE PROCESS(MY PROCESS)

1. Not checking for length 0 string
			 if(s.length()==0)
        return 0;
2. Index Out Of Bounds Exception
		TRYING TO ACCESS right+1 ele, when right can go till last ele of string
		while(right<n&&!set.contains(**s.charAt(right+1)**)) {right++;set.add(s.charAt(right));}



//Old solution

class Solution {

    public int lengthOfLongestSubstring(String s) {

        int l = 0;
        int r = l;
        int max = 0;
        int cur = 0;

        Set<Character> set = new HashSet<>();

        while(l<s.length()){
            cur = 0;
            r=l;
            while(!set.contains(s.charAt(r))){

                set.add(s.charAt(r));
                r++;
                
            }

            cur = r-l;
            if(cur>max) max = cur;

            while(s.charAt(l)!=s.charAt(r)){
                l++;
            }
            l++;

        }
        //SLIDING WINDOW - First window left pointer starting from 1st index

        // Window r pointer going as far as possible
        // When encounter duplicate, move left pointer as much to right as needed to remove duplicate in set

        return max;
    }

}

//OBSERVATIONS(PLAY)
/**String given

Substring to find out 
SLIDING WINDOW - First window left pointer starting from 1st index
Window r pointer going as far as possible
When encounter duplicate, move left pointer as much to right as needed to remove duplicate in set


*/

