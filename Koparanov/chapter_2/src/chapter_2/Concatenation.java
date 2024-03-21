package chapter_2;

public class Concatenation {

	public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        Object concatenated = str1 + " " + str2;

        System.out.println(concatenated);

        String result = (String) concatenated;
        
        System.out.println(result);
    }

}
