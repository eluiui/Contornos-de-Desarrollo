package exercicio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RootUserSingletonTest {
    
    public RootUserSingletonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testUniqueInstance() {
        System.out.println("uniqueInstance");
        RootUserSingleton instance1 = RootUserSingleton.getInstance();
        RootUserSingleton instance2 = RootUserSingleton.getInstance();
        assertSame(instance1, instance2);
    }
    
}
