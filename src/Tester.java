
public class Tester {
    public static void main(String[] args) {
        System.out.println(abcTest("abc.abc"));
        System.out.println(alternateStrings("Thereee", "xxxx"));
    }

    public static String alternateStrings(String str1, String str2) {
        String output = "";

        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            output += str1.substring(i,i+1) + str2.substring(i,i+1);
        }

        if(str1.length()>str2.length()){
            output+= str1.substring(str2.length());
        }else{
            output+= str2.substring(str1.length());
        }

        return output;

    }

    public static boolean abcTest(String s) {
        if(s.contains(".abc")) return false;
        if(s.contains("abc")) return true;
        return false;
    }




}
