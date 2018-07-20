package _01_introduction_to_encapsulation;

import org.junit.Test;

import junit.framework.TestCase;

public class EncapsulateTest extends TestCase {
	EncapsulateTheData d = new EncapsulateTheData();
	@Test
	
	public void testSetItemsReceived() {
		d.setItemsReceived(-3);
		assertEquals(0,d.getItemsReceived());
	}
	public void testSetDegreesTurned() {
		d.setDegreesTurned(719);
		assertEquals(359.0,d.getDegreesTurned(),.0001);

	}
	public void testGetNomenclature() {
		d.setNomenclature("urmom");
		assertEquals("urmom",d.getNomenclature());
		d.setNomenclature("");
		assertEquals(" ", d.getNomenclature());
	}

}
