//Reverse a String (using StringBuilder class)

public class ReverseStringSB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tamal Barman");

        for(int i = 0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length() - i-1;

            char forntChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, forntChar);
        }
        System.out.println(sb);
    }
}
