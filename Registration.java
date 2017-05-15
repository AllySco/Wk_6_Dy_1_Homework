public class Registration {

  private String room;
  private Person[] register;

  public Registration(String room) {
    this.room = room;
    this.register = new Person[10];
  }

  public String getName() {
    return this.room;
  }

  public int peopleInRegistration(){
    int count = 0;
    for (Person person : register) {
      if (person != null) {
        count++;
      }
    }
    return count;
  }

  public void registerPerson(Person person) {
    register[peopleInRegistration()] = person;
  }

  public void movePersonToSeat(Classroom classroom) {
    if (peopleInRegistration() > 0) {
      Person person = register[0];
      classroom.seat(person);
      register[peopleInRegistration() -1] = null;
    }
  }

}