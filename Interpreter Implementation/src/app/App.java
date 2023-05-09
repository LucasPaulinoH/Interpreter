package app;

import utils.Divide;
import utils.Expression;
import utils.Number;
import utils.Sum;

public class App {
    public static void main(String[] args) throws Exception {
        Expression expression = new Sum(new Number(2), new Number(3));
        System.out.println(expression.interpret());

        Expression expression2 = new Divide(new Sum(new Number(2), new Number(3)), new Number(2));
        System.out.println(expression2.interpret());    
    }
}