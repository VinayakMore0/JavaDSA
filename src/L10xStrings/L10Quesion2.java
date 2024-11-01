package L10xStrings;

public class L10Quesion2 {

    public static void main(String[] args){

        System.out.println(replaceAcsiiFunc("cdEfG"));

        subString("code");



    }

    public static void subString(String str){
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
                System.out.println(str.substring(i, j));
            }
        }
    }


    public static String replaceAcsiiFunc(String str){

        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < sb.length(); i++){

            char ch = sb.charAt(i);

            if(i % 2 == 0){

                ch = (char)(ch + 1);
                sb.setCharAt(i,ch);
            }else{

                ch = (char)(ch - 1);
                sb.setCharAt(i, ch);
            }
        }
        return sb.toString();
    }
}
