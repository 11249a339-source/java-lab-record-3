AIM

To write a Java program to perform various String handling operations such as trim(), length(), charAt(), toUpperCase(), substring(), contains(), and equals().

ALGORITHM
Start the program.
Declare and initialize the string greeting.
Use trim() to remove the extra space at the end.
Find the length of the cleaned string using length().
Find the character at index 7 using charAt().
Convert the string to uppercase using toUpperCase().
Extract the word "Java" using substring(7,11).
Check whether the string contains "Java" using contains().
Compare the extracted word with "Java" using equals().
Display all the results.
Stop the program.
public class StringDemo {
    public static void main(String[] args) {
    String greeting = "Hello, Java World! ";
    
    // FIX: Declare and initialize cleanGreeting
    String cleanGreeting = greeting.trim(); 
    
    System.out.println("Cleaned Length: " + cleanGreeting.length());
    System.out.println("Character at index: " + cleanGreeting.charAt(7));
    String upper = cleanGreeting.toUpperCase();
    System.out.println("Uppercase: " + upper);
    String lang = cleanGreeting.substring(7,11);
    System.out.println("Extracted language:" + lang);
    boolean hasJava = cleanGreeting.contains("Java");
    System.out.println("conains 'Java' ?:" + hasJava);
    String original = "Java";
    System.out.println("Case Match: " + lang.equals(original));
}
}
OUTPUT
Cleaned Length: 18
Character at index: J
Uppercase: HELLO, JAVA WORLD!
Extracted language:Java
conains 'Java' ?:true
Case Match: true
RESULT
Thus, the Java program to perform various String handling operations was executed successfully and the desired output was obtained.
