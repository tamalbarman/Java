//Delete char at some Index
public class StringBuilderDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("AMAL");
        //INSET CHAR
        sb.insert(0,'T');
        System.out.println(sb);

        //delete
        sb.delete(0, 1);
        System.out.println(sb);
    }
}
