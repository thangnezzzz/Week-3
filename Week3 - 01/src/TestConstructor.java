import junit.framework.TestCase;

public class TestConstructor extends TestCase {
    public void testConstructor(){
        Date d1 = new Date(4, 9, 2026);
        Entry e1 = new Entry(d1, 5, 10, "happy");
        ALog a1 = new EmptyLog();
        ALog a2 = new ConsLog(e1, a1);

        Date d2 = new Date(5, 9, 2026);
        Entry e2 = new Entry(d2, 10, 15, "tired");
        ALog a3 = new ConsLog(e2, a2);

        Date d3 = new Date(6, 9, 2026);
        Entry e3 = new Entry(d3, 20, 30, "sad");
        ALog a4 = new ConsLog(e3, a3);

        Date d4 = new Date(5, 6, 2004);
        Entry e4 = new Entry(d4, 15.3, 87, "great");
        ALog a5 = new ConsLog(e4, a4);

        Date d5 = new Date(6, 6, 2004);
        Entry e5 = new Entry(d4, 12.8, 84, "good");
        ALog a6 = new ConsLog(e5, a5);
    }
}
