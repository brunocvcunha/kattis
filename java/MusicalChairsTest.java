import java.io.ByteArrayInputStream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicalChairsTest {

  @Test
  public void test1() {
    assertEquals(3, MusicalChairs.solve(new ByteArrayInputStream(("4\n" + "8 2 4 2").getBytes())));
  }

  @Test
  public void test2() {
    assertEquals(2, MusicalChairs.solve(new ByteArrayInputStream(("2\n" + "1 2").getBytes())));
  }

  @Test
  public void test3() {
    assertEquals(1, MusicalChairs.solve(new ByteArrayInputStream(("4\n" + "2 2 2 2").getBytes())));
  }
}
