import org.junit.Test;

public class TestDec extends OperationTest
{
    @Test
    public void testDec()
    {
        for ( Array array : arrays )
        {
            switch ( array.getOp() )
            {
                case ('-'):
                    testDec( array.getI(), array.getS(), array.getRes() );
                    break;

            }
        }
    }
}
