public class StringOps {
    ////////////////////////////////////////////////////////////
    ////// ///////
    ////// Reminder: ///////
    ////// allowed methods ///////
    ////// ///////
    ////// 1.charAt(int index) ///////
    ////// 2.length() ///////
    ////// 3.substring(int start) ///////
    ////// 4.substring(int start,int ends) ///////
    ////// 5.indexOf(String str) ///////
    ////// ///////
    ////// The rest are not allowed ! ///////
    ////// if you want to use a different ///////
    ////// method, and you can implement ///////
    ////// it using material from the course ///////
    ////// you need to implement a version of ///////
    ////// the function by yourself. ///////
    ////// ///////
    ////// see example for substring ///////
    ////// in Recitation 3 question 5 ///////
    ////// ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {

    }

    public static String capVowelsLowRest(String str) {
        // Write your code here:
        String newstr = "";
        String renewstr = "";
        for (int i = 0; i < str.length(); i++) {
            if ((65 <= ((int) (str.charAt(i)))) && (((int) (str.charAt(i))) <= 90)) {
                newstr = newstr + ((char) (str.charAt(i) + 32));
            } else
                newstr = newstr + ((char) (str.charAt(i)));
        }
        for (int i = 0; i < newstr.length(); i++) {
            if (newstr.charAt(i) == 'a')
                renewstr = renewstr + ((char) (newstr.charAt(i) - 32));
            else if (newstr.charAt(i) == 'e')
                renewstr = renewstr + ((char) (newstr.charAt(i) - 32));
            else if (newstr.charAt(i) == 'i')
                renewstr = renewstr + ((char) (newstr.charAt(i) - 32));
            else if (newstr.charAt(i) == 'o')
                renewstr = renewstr + ((char) (newstr.charAt(i) - 32));
            else if (newstr.charAt(i) == 'u')
                renewstr = renewstr + ((char) (newstr.charAt(i) - 32));
            else
                renewstr = renewstr + newstr.charAt(i);
        }
        return renewstr;
    }

    public static String camelCase(String string) {
        return "";

    }

    public static int[] allIndexOf(String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
