Shifting Letters says that we have given a string s and an array shifts.

Now for each shifts[i] = x, we want to shift the first i + 1 letters of s, x times. We have to return the final string after all shifts are applied.

Example 1:

Input:

 s = "abc", shifts = [3,5,9]
Output:


 "rpl"
Explanation:

We start with “abc”.
After Shifting the first 1 letter of s by 3, we have “dbc”.
After shifting the first 2 letters of s by 5, we have “igc”.
After shifting the first 3 letters of s by 9, we have “rpl”.
Hence “rpl” is our final answer.
Example 2:

Input:

 s = "aaa", shifts = [1,2,3]
Output:


 "gfd"
Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
shifts.length == s.length
0 <= shifts[i] <= 109
Approach
Idea
We have to calculate how many times i-th character is shifted.

So just calculate the number of shifts on each position, by shifts[i] += shift[i+1].
We will do the task in reverse order.
We have to maintain a  reverse prefix sum of the shift array and this will be equal to the number of shifts for each character.
One thing we should focus if we found that our character ASCII score exceeds the value of the ASCII score of ‘z’ we should start counting from ‘a.
