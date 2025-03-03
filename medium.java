import java.io.*;

class Student implements Serializable {
    int id;
    String name;
    double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }
}

public class SerializeStudent {
    public static void main(String[] args) {
        String filename = "student.ser";

        // Serialize
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            Student s = new Student(1, "John Doe", 3.8);
            out.writeObject(s);
            System.out.println("Serialization complete.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        // Deserialize
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Student s = (Student) in.readObject();
            System.out.println("Deserialized Student Data:");
            s.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}
