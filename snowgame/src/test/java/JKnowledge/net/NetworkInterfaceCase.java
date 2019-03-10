package JKnowledge;

import static org.junit.Assert.*;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.util.Assert;
import static java.lang.System.out;

public class NetworkInterfaceCase {

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
	public void test() throws SocketException {
		// fail("Not yet implemented");
		List<String> list = new ArrayList<String>();
		list.add("Test Cast");

		Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
		int index = 0;
		while (nets.hasMoreElements()) {

			index += 1;
			NetworkInterface e = nets.nextElement();
			out.printf("index: %s%n", String.valueOf(index));
			out.printf(" : %s%n", e.getDisplayName());
			out.printf(" : %s%n", e.getName());
			out.printf(" e.isLoopback() :%s%n", e.isLoopback());
			out.printf(" e.isPointToPoint() :%s%n", e.isPointToPoint());
			out.printf(" e.isUp() :%s%n", e.isUp());
			out.printf(" e.isVirtual() :%s%n", e.isVirtual());
			displayNetAddress(e.getInetAddresses());
			out.printf(" : %s%n", e.getNetworkInterfaces());

		}
		Assert.notEmpty(list);

	}

	private void displayNetAddress(Enumeration<InetAddress> inetAddresses) {
		// TODO Auto-generated method stub
		Collections.list(inetAddresses).forEach(e -> {
			out.printf("    getHostAddress %s%n:", e.getHostAddress());
			out.printf("    getHostName %s%n:", e.getHostName());
			try {
				out.printf("    getLocalHost %s%n:", e.getLocalHost());
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
	}

}
