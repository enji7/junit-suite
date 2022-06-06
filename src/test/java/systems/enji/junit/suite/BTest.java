package systems.enji.junit.suite;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("custom-tag-2")
public class BTest {

  @Test
  void test() {
    System.out.println("demo test - B");
  }
  
}
