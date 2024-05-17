package main.java.quiz_assignment;

public class main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        Login login = new Login();
        login.register();
        login.inputCredentials();
        quiz.play();
    }
}
