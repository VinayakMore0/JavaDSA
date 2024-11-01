package L2ExperationBlocks;

public class LogicalOperators {

    public static void main(String[] args) {

        // Logical Operators are used to check whether an expression is true or false
        // They are used in Decision making

        // 1. && (Logical AND) expression1 && expression2
        // true only if both exp1 and exp2 are true

        System.out.println((5 > 3) && (8 > 5));
        System.out.println((5 < 3) && (8 > 5));

        // 2. || (Logical OR) exp1 || exp2
        // true if exp1 or exp2 are true

        System.out.println((5 > 3) || (8 > 5));
        System.out.println((5 < 3) || (8 > 5));
        System.out.println((5 < 3) || (8 < 5));

        // 3. ! (Logical NOT) !expression
        // true if exp is false and vice versa

        System.out.println(!(5 == 3));
        System.out.println(!(5 > 3));

    }
}
