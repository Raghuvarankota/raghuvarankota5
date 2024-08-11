public class Person {
    String name;
    int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display person details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        person.display();
    }
}
