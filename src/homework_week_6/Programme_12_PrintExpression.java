package homework_week_6;

/* write a java program to compute the specified expressions and print the
output
test data :
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected output : 2.138888888888889
 *
 */
public class Programme_12_PrintExpression {
    public static void main(String[] args) {
        Programme_12_PrintExpression t = new Programme_12_PrintExpression();
        t.printExpressions();
    }
    //Printing expression
    public void printExpressions() {
        double a = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(a);
    }
}
