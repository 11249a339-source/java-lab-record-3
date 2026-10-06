
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