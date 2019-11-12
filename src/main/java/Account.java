import sun.security.util.Length;

import javax.persistence.*;
import java.io.*;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue
    private int id;

    @Column(length = 32, unique = true, nullable = false)
    private String login;

    @Column(length = 32, nullable = false)
    private String password;

    @Column(length = 1000000, nullable = false)
    private int score;

    static OutputStream fighter = new OutputStream() {
        @Override
        public void write(int b) throws IOException {

        }
    }

    static Writer output = new OutputStreamWriter(new BufferedOutputStream(null));
    static BufferedReader input = new BufferedReader ( new InputStreamReader(null));

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Account(String login, String password) {
        this.login = login;
        this.password = password;
        this.score = 0;
    }

    public static Account CreateAccount(OutputStream outputStream) throws Exception {
        fighter = outputStream;
        String testLogin = input.readLine();
        String testPassword = input.readLine();
        Account testAccount = new Account(testLogin, testPassword);
    }
}
