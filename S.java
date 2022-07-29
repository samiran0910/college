
public class S {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Samiran");
        System.out.println("Before setCharAt: " + sb);
        System.out.println();
        sb.setCharAt(1, 'o');
        System.out.println("After setCharAt at index 1: " + sb);
        System.out.println();
        System.out.println("Before append: " + sb);
        System.out.println();
        sb.append(" Baishya");
        System.out.println("After append: " + sb);
        System.out.println();
        System.out.println("before setLength:  " + sb.length() + " " + sb);
        sb.setLength(7);
        System.out.println();
        System.out.println("after setLength: " + sb.length() + " " + sb);
        System.out.println();
        StringBuffer sb1 = new StringBuffer("hello world");
        System.out.println("Before insert: " + sb1);
        System.out.println();
        sb1.insert(2, "air");
        System.out.println("After insert: " + sb1);
        System.out.println();
        String str = "Hello";
        System.out.println(str.concat(" world"));
        System.out.println();
        String str1 = "Hello";
        System.out.println("String using equals(): " + "[ " + str + " " + str1 + " ] " + str.equals(str1));
        StringBuffer eq = new StringBuffer("Samiran");
        StringBuffer eq1 = new StringBuffer("Samiran");
        System.out.println();
        System.out.println("StringBuffer using equals(): " + "[ " + eq + " " + eq1 + " ] " + eq.equals(eq1));
        System.out.println();

    }

}
