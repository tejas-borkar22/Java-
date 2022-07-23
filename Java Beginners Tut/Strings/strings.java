
class strings {
  public static void main(String[] args) {
    System.out.println("Hello World in the JAVA !!");

    /*
     * Strings : Strings are immutable & reference type in JAVA.
     */
    String name = "Rashad Wapar";
    int age = 76;
    long phone = 9850752398L;
    boolean isAdult;

    System.out.println("--- Personal Details ---");
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
    System.out.println("Phone num : " + phone);
    if (age > 18) {
      isAdult = true;
      System.out.println("Adult : " + "Yes");
    } else {
      isAdult = false;
      System.out.println("Adult : " + "No");
    }
    // new keyord : new is redundant and we can use the short hand.
    String name2 = new String("Xanjay Pout");

    // Inbuilt String Functions : 1. Length
    System.out.println("Length of name : " + name.length());

    // 2. Concatenation
    String besties = name + " & " + name2;
    System.out.println("Besties : " + besties);

    // 3. Char at
    System.out.println("Char at 1st :" + name2.charAt(0));
    System.out.println("Char at 8th :" + name.charAt(7));

    // 4. Replace : Repalces a particular character with other character passed as
    // argument.
    String name3 = name2.replace("j", "z");
    System.out.println("  Original : " + name2 + "\n  After Replacing : " + name3);

    // 5.substring : Includes the beginIndex but excludes the end Index.
    System.out.println("Substring : " + besties.substring(7, 21));

    // 6. endsWith
    System.out.println(name2.endsWith("ut"));

    // for each loop in case of string arrays. for each loop is always forward only.

    String fruits[] = { "Mango", "Apple", "Banana", "Lemon" };
    System.out.println("---Iterating over an string array using for each loop.---");
    for (String fruit : fruits)
      System.out.println(fruit);

  }
}