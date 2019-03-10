package JKnowledge.net;

import static org.junit.Assert.*;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static java.lang.System.out;

public class InetAddressTestCase {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws UnknownHostException {
		
		InetAddress address=InetAddress.getByName("www.baidu.com");
		
		out.printf("Host name is:%s%n", address);
		
		
		InetAddress[] addressArr=InetAddress.getAllByName("www.baidu.com");
		
		List<InetAddress> addressList=new ArrayList<InetAddress>();
		Collections.addAll(addressList, addressArr);
	    displayInetAddress(addressList);
	    
	   out.printf("LocalHost: %s%n", InetAddress.getLocalHost());
	   
	   
	   out.println("");
		
	
	}

	private void displayInetAddress(List<InetAddress> addressList) {
		// TODO Auto-generated method stub
		
		addressList.forEach(e->out.printf("Host: %s%n", e));
		
	}

}
