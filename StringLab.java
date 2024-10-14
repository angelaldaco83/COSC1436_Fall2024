public class StringLab
{
    public static void main(String[] args)
    {
        String str = "Welcome to the Java String Lab!";
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Extracted substring: " + str.substring(15, 20));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
        System.out.println("Contains 'Lab': " + str.contains("Lab"));
        System.out.println("Replaced String: " + str.replace("Java", "Java Programming"));

        System.out.println("Split Words:");
        for (String word : str.trim().split(" "))
        {
            System.out.println(word);
        }
        String compareStr = "java string lab!";
        System.out.println("Equals: " + str.equals(compareStr));
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(compareStr));

        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.append(" - Learning Java");
        sb.insert(16, " is fun");
        sb.delete(sb.indexOf("Learning"), sb.indexOf("Learning") + "Learning".length());
        System.out.println("StringBuilder: " + sb.reverse());StringBuffer sbf = new StringBuffer("Multithreading Lab");
        sbf.append(" - Learning Java");
        sbf.insert(19, " is fun");
        sbf.delete(sbf.indexOf("Learning"), sbf.indexOf("Learning") + "Learning".length());
        System.out.println("StringBuffer: " + sbf.reverse());
    }
}