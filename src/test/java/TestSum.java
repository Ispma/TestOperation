import org.junit.Test;

public class TestSum extends OperationTest
{


    @Test
    public void testSum()
    {
        for ( Array array : arrays )
        {
            switch ( array.getOp() )
            {
                case ('+'):
                    testSum( array.getI(), array.getS(), array.getRes() );
                    break;

            }
        }
    }
}
