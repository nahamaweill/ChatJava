package clientmodel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClientTest {
	Client C;
	
	
	@Test
	void ClientTest() {
		try {
			C = new Client();
		}
		catch (Exception e) {
			fail("The client fail to connect");
		}
	}

}
