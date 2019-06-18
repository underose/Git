package LifeGame;

import static org.junit.Assert.*;


import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class WorldTest {
 
	private static World world=new World(); 
	@Before
	public void setUp()throws Exception{
		world.clear();
	}
	

	@BeforeClass
	
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testNeighborsCount() { 
     	assertEquals(3, world.neighborsCount(5, 6));
		assertEquals( 'N',world.tempStatus[5][6] );
		
	}
	
	@Test
	public void testchangeCellStatus() {
		world.changeCellStatus();  
		assertEquals(3, world.neighborsCount(5, 6));
		assertEquals( 'A',world.tempStatus[5][6] );
	}
	


}
