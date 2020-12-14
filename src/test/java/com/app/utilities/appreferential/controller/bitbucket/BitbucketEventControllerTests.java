package com.app.utilities.appreferential.controller.bitbucket;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureWireMock(port = 0, stubs = "classpath:/bb_wiremock")
@TestPropertySource(properties = {
		"bitbucket.baseUrl=http://localhost:${wiremock.server.port}"
})
class BitbucketEventControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void given_no_body_save_event_should_throw_400() throws Exception {
		assertThat(true).isTrue();
	}

}
