class Rotate{
    
    /*  Function to check if two strings are rotations of each other
    *   s1, s2: are the input strings
    */
    public static boolean areRotations(String str1, String str2 )
    {  // a substring of str1 concatenated with str1.   
        return (str1.length() == str2.length()) && 
               ((str1 + str1).indexOf(str2) != -1); 
        
    }
    
}