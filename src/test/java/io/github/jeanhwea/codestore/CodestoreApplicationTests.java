package io.github.jeanhwea.codestore;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CodestoreApplicationTests {
  public static final Logger LOG = LoggerFactory.getLogger(CodestoreApplicationTests.class);

  @Test
  void contextLoads() {
    LOG.info("context loads successful");
  }
}
