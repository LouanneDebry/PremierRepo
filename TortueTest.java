

/**
 * The test class TortueTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TortueTest extends junit.framework.TestCase
{
	private Tortue tortue1;
	private Tortue tortue2;

	

    /**
     * Default constructor for test class TortueTest
     */
    public TortueTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
		tortue1 = new Tortue();
		tortue2 = new Tortue();
		tortue2.avancer();
		tortue2.avancer();
	}

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }

	public void testTestTourner()
	{
		tortue1.tourner();
		assertEquals(0, tortue1.getDirection());
	}

	public void testAvancer()
	{
		tortue1.avancer();
		tortue1.afficherEtat();
		assertEquals(3, tortue1.getDirection());
	}

	public void testIntegration()
	{
		Tortue tortue2 = new Tortue();
		tortue2.avancer();
		tortue2.avancer();
		tortue2.tourner();
		assertEquals(0, tortue2.getDirection());
	}
}



