import java.time.LocalDate;

enum Class {PROGRAMMING, ALGORITHMS, GAME_DESIGN, CALCULUS}

public class User {
    static int globalId;
    private String name;
    LocalDate dob;
    int id;
    Class[] classes;
    String email;


    public User(String name) {
        System.out.println("Called the user constructor");
        this.name = name;
        this.id = ++globalId;
        }

        public String GetName() {
            return this.name;
    }
}
