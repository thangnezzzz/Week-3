import junit.framework.TestCase;

public class TestConstructor extends TestCase {
    public void testConstructor(){
        Address a1 = new Address(23, "Maple Street", "Brookline");
        AHouse h1 = new AHouse("Ranch", 7, a1, 375.000 );
        AList l1 = new Empty();
        AList l2 = new ConsList(h1, l1);
    }
}
