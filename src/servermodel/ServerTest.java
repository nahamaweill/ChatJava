package servermodel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ServerTest {
	Server S;

	@Test
	void ServerTest() {
		try {
			S = new Server();
		}
		catch (Exception e) {
			fail("The server fail to connect");
		}
	}

}
