package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */


    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        for (char ch : str.toCharArray()) {
            int leftBracketIndex = str.indexOf('[');
            int rightBracketIndex = str.indexOf(']');
            if (ch == '[') {
                brackets++;
            } else if (ch == ']' && leftBracketIndex < rightBracketIndex) {
                brackets--;
            }
        }
        return brackets == 0;
    }

    //index of ] must be after index of [
    //set index of each to a variable to compare in else if



//    public static boolean hasBalancedBrackets(String str) {
//        int brackets = 0;
//
//        for (char ch : str.toCharArray()) {
//           // int leftBracketIndex =
//            if (ch == '[' || ch == ']') {
//         //       brackets++;
//          //  } else if (ch == ']') {
//                brackets--;
//            }
//        }
//        return brackets == 0;
//    }



    // original unedited code
//    public static boolean hasBalancedBrackets(String str) {
//        int brackets = 0;
//        for (char ch : str.toCharArray()) {
//            if (ch == '[') {
//                brackets++;
//            } else if (ch == ']') {
//                brackets--;
//            }
//        }
//        return brackets == 0;
//    }
}
