import static org.junit.Assert.assertEquals;
import org.junit.*;

public class RegistrationTest {

  Classroom classroom;
  Person person;
  Registration registration;

  @Before
  public void before(){
    classroom = new Classroom('a');
    person = new Person();
    registration = new Registration("Reception");
  }

  @Test
  public void hasName() {
    assertEquals("Reception", registration.getName());
  }

  @Test
  public void canRegisterPerson() {
    registration.registerPerson(person);
    assertEquals(1, registration.peopleInRegistration());
  }

  @Test
  public void canMovePersonToSeat() {
    registration.registerPerson(person);
    registration.movePersonToSeat(classroom);
    assertEquals(0, registration.peopleInRegistration());
    assertEquals(1, classroom.seatCount());
  }

}