public class ReverseAString {
    public static void main(String args[])
    {
        /*(StringBuffer r = new StringBuffer("Tamal Barman");
        System.out.println(r.reverse());

        StringBuilder r2 = new StringBuilder("Gopal Chandra Barman");
        System.out.println(r2.reverse());*/

        int l;
        String r ="Tamal";
        String r2 ="";
        l=r.length();
        for(int i=l-1;i>=0;i--)
        {
            r2=r2+r.charAt(i);
        }
        System.out.println(r2);
    }
}
