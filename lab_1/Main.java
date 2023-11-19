public class Main{
    public static void main(String[] args){
        String str_0 = "String example";
        System.out.println(str_0);
        //String length
        System.out.println(str_0.length());

        //Substring
        String substring = str_0.substring(1, 4);
        System.out.println(substring.length());

        //translating characters to lowercase
        String lowercaseStr = str_0.toLowerCase();
        System.out.println(lowercaseStr.length());

        //translating characters to uppercase
        String uppercaseStr = str_0.toUpperCase();
        System.out.println(uppercaseStr.length());

        //concatination
        String str1 = "Hello";
        String str2 = " World";
        String result = str1.concat(str2);
        System.out.println(result.length());
    }
}