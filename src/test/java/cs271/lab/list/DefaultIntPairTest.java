package cs271.lab.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class DefaultIntPairTest {

	//final IntPair p = new DefaultIntPair(3,5);
	//final IntPair q = new DefaultIntPair(5,3);

	final Pair<Integer, Integer> p = new DefaultIntPair(3,5);
	final Pair<Integer, Integer> q = new DefaultIntPair(5,3);

	@Test
	public void TestEquals()
	{

		assertEquals(3,(int)p.first());
		assertEquals(5,(int)p.second());
		assertTrue(p.equals(p));
		assertFalse(p.equals(q));
		assertFalse(q.equals(p));
		assertFalse(p.equals(null));
	}
	@Test
	public void TestString()
	{
		assertEquals("<3, 5>",p.toString());
	}
	@Test
	public void TestReverse()
	{
		assertTrue(p.equals(q.reverse()));
	}
}
