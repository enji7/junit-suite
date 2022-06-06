package systems.enji.junit.suite;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("custom-tag-1")
public class ATest {

  @Test
  void test() {
    System.out.println("demo test - A");
  }
  
}
