import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ClassroomTest{
  Classroom classroom;
  Person person;

  @Before 
  public void before() {
    classroom = new Classroom('a');
    person = new Person();
  }

  @Test
  public void hasName() {
    assertEquals('a', classroom.getName());
  }


  @Test
  public void seatsStartEmpty() {
    assertEquals(0, classroom.seatCount());
  }

  @Test
  public void canSeatPerson() {
    classroom.seat(person);
    assertEquals(1,classroom.seatCount());
  }


  @Test
  public void cannotSeatPersonWhenSeatsAreFull() {
    for(int i = 0; i < 10; i++) {
      classroom.seat(person);
    }
    assertEquals(10, classroom.seatCount());
  }

  @Test
  public void areSeatsFull() {
    for(int i = 0; i < 10; i++) {
      classroom.seat(person);
    }
    assertEquals(true, classroom.areSeatsFull());
  }

  @Test
  public void emptySeatsAfterSchool() {
    classroom.seat(person);
    classroom.empty();
    assertEquals(0, classroom.seatCount());
  }

}