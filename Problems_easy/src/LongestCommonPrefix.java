public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        // if the length of the string array is zero, return "";
        if (strs.length == 0) {
            return "";
        }
        // Name the first element in string array as prefix;
        String prefix = strs[0];

        //Loop from the second element in "strs" to the last one
        for (int i = 1; i < strs.length; i++) {
            // If the current element contains the prefix, move to the
            // next element and do the comparison again with the prefix
            while (strs[i].indexOf(prefix) != 0) {
                // Chop down the tail character of prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                // Return "" when prefix is emply
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println("Engli".indexOf("Enga"));
        String[] res = {"English", "Engli", "EnE"};
        String result = longestCommonPrefix(res);
        System.out.println(result);
    }
}
