//Print Length of String

public class StringBuilderLength {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tamal");
        sb.append("Barman");
        System.out.println(sb);
        //for counting we used .length();
        System.out.println(sb.length());
    }
}
