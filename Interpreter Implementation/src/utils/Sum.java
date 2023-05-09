package utils;

public class Sum implements Expression{
    private Expression left;
    private Expression right;

    public Sum(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret() {
        return left.interpret() + right.interpret();
    }
}