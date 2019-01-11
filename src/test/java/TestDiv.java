import org.junit.Test;

public class TestDiv extends OperationTest
{
    @Test
    public void testDec()
    {
        for ( Array array : arrays )
        {
            switch ( array.getOp( ))
            {
                case ('/'):
                    testDiv( array.getI(), array.getS(), array.getRes() );
                    break;

            }
        }
    }
}
