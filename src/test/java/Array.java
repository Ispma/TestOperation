public class Array
{
    public Double operand1;
    public Double operand2;
    public char operation;
    public Double result;

    Array( Double i, Double s, char op, Double res ) {
        this.operand1= i;
        this.operand2= s;
        this.operation= op;
        this.result= res;
    }

    Double getI()
    {
        return operand1;
    }

    Double getS()
    {
        return operand2;
    }

    public char getOp()
    {
        return operation;
    }

    Double getRes()
    {
        return result;
    }
}
