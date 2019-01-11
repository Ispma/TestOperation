import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;




public class OperationTest
{
   public static final ArrayList < Array > arrays= new ArrayList();

    @BeforeClass
    public static void start() throws Exception
    {
        System.out.println( "Начало работы" );
        File data= new File("src/main/resources/data.txt" );

        BufferedReader bufferedReader= new BufferedReader( new FileReader(data) );
        String main;
        while ( ( main= bufferedReader.readLine( )) != null )
        {
            String[] stringArray= main.split(";" );

            Array arr= new Array
                    (
                    Double.parseDouble(stringArray[0]),
                    Double.parseDouble(stringArray[1]),
                    stringArray[2].charAt(0),
                    Double.parseDouble(stringArray[3])
                    );

            arrays.add(arr);
        }
    }


    @AfterClass
    public static void Endl()
    {
        arrays.clear();
        System.out.println("Завершение работы");
    }


    public static void testSum( Double operand1, Double operand2, Double result )
    {
        Double newRes= operand1 + operand2;
        System.out.println( operand1 + " + " + operand2 + " = " + newRes );
        Assert.assertEquals( result, newRes, 0.0 );
    }


   public static void testDec( Double operand1, Double operand2, Double result )
   {
        Double newRes= operand1 - operand2;
        System.out.println( operand1 + " - " + operand2 + " = " + newRes );
        Assert.assertEquals( result, newRes, 0.0 );
    }

    public static void testMno( Double operand1, Double operand2, Double result )
    {
        Double newRes= operand1 * operand2;
        System.out.println( operand1 + " * " + operand2 + " = " + newRes );
        Assert.assertEquals( result, newRes, 0.0 );
    }

    public static void testDiv( Double operand1, Double operand2, Double result )
    {
        Double newRes= operand1 / operand2;
        System.out.println( operand1 + " / " + operand2 + " = " + newRes );
        Assert.assertEquals( result, newRes, 0.0 );
    }
}