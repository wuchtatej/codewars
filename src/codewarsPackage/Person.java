package codewarsPackage;
public class Person {
  String name;

    public Person(String personName) {
      this.name = personName;
    }

    public String greet(String yourName) {
      return "Konbanwa! My name is " + this.name + ". It is nice to meet you, " + yourName + "!";

    }
    
    
    public static void main( String[] args ) {
      Person shoki = new Person("Nadal");
      System.out.println(shoki.greet("Federer"));    }
}