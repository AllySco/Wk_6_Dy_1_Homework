public class Classroom{
  private char name;
  private Person[] seats;

  public Classroom(char name){
    this.name = name;
    this.seats = new Person[10];
  }

  public char getName() {
    return this.name;
  }

  public int seatCount() {
    int count = 0;
    for(Person person : seats) {
      if(person !=null) {
        count++;
      }
    }
    return count;
  }

  public void seat(Person person) {
    if(areSeatsFull()) {
      return;
    }
    int seatCount = seatCount();
    seats[seatCount()] = person;
  }

  public boolean areSeatsFull() {
    return seatCount() == seats.length;
  }

  public void empty() {
    for(int i = 0; i < seats.length; i++) {
      seats[i] = null;
    }
  }

}