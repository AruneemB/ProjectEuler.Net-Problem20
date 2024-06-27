import java.math.BigInteger;

public class FactorialDigitSum
{
    public static BigInteger bigIntegerFactorial(int n)
    {
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= n; i++) factorial = factorial.multiply(BigInteger.valueOf(i));
        return factorial;
    }

    public static int digitSum(BigInteger factorial)
    {
        String factorialString = factorial.toString();
        int sum = 0;

        for (int i = 0; i < factorialString.length(); i++)
        {
            char character = factorialString.charAt(i);
            int digit = Character.getNumericValue(character);
            sum += digit;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println(digitSum(bigIntegerFactorial(30)));
    }

}
