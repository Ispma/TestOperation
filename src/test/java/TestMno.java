import org.junit.Test;

public class TestMno extends OperationTest
{
    @Test
    public void testMno()
    {
        for ( Array array : arrays )
        {
            switch ( array.getOp() )
            {
                case ('*'):
                    testMno( array.getI(), array.getS(), array.getRes() );
                    break;

            }
        }
    }
}
