package L10xStrings;

public class xStringBuilder {

    public static void main(String[] args) {

        String str = "hello";
        StringBuilder sb = new StringBuilder("abc");
        StringBuilder sb1 = new StringBuilder(str);

        //length
        System.out.println(sb1);
        System.out.println(sb1.length());

        //append
        sb1.append("abc");
        System.out.println(sb1);
        sb1.append("def");
        System.out.println(sb1);

        //insert
        sb.insert(sb.length(),'z');
        System.out.println(sb);

        //setCharAt

        sb.setCharAt(2,'q');
        System.out.println(sb);

        String str1 = sb.toString();

    }
}
