class Main
{
    public static String expand(String str, int low, int high)
    {
        
        while (low >= 0 && high < str.length() &&
                (str.charAt(low) == str.charAt(high))) {
            low--;
            high++;
        }
 
        // return palindromic substring
        return str.substring(low + 1, high);
    }
 
    public static String findLongestPalindromicSubstring(String str)
    {

        if (str == null || str.length() == 0) {
            return str;
        }
 
        // `max_str` stores the maximum length palindromic substring
 
        String max_str = "", curr_str;
 
        // `max_length` stores the maximum length of palindromic
 
        int max_length = 0, curr_length;
 
        // consider every character of the given string as a midpoint and expand
        // in both directions to find maximum length palindrome
 
        for (int i = 0; i < str.length(); i++)
        {
            // find the longest odd length palindrome with `str[i]` as a midpoint
 
            curr_str = expand(str, i, i);
            curr_length = curr_str.length();
 
 
            // update maximum length palindromic substring if odd length palindrome has a greater length
 
            if (curr_length > max_length)
            {
                max_length = curr_length;
                max_str = curr_str;
            }
 
            curr_str = expand(str, i, i + 1);
            curr_length = curr_str.length();
 
            // update maximum length palindromic substring if even length palindrome has a greater length
 
            if (curr_length > max_length)
            {
                max_length = curr_length;
                max_str = curr_str;
            }
        }
 
        return max_str;
    }
 
    public static void main(String[] args)
    {
        String str = "RADAR";
 
        System.out.println("The longest palindromic substring of " + str + " is "
                + findLongestPalindromicSubstring(str));
    }
}