package L8ArrayList;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {

        // ArrayList <Type> arraylist = new ArrayList <>();
        ArrayList<Integer> arrayLis = new ArrayList<>();
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Swift");
        languages.add(1,"C++");

        System.out.println(languages);

        String str = languages.get(1);
        System.out.println(str);

        languages.set(1,"C++");
        System.out.println(languages);

        System.out.println(languages.size());
        languages.remove(2);
        System.out.println(languages);
        System.out.println(languages.size());

        for(String language : languages){
            System.out.println(language);
        }

    }

}
