import sun.security.util.Length;

import javax.persistence.*;

@Entity
@Table (name = "scoreBoard")
public class ScoreBoard {
    @Id
    @GeneratedValue
    private int id;

   @Column(length = 32, unique = true, nullable = false)
    private String topAccounts;

   @Column(length = 1000000, nullable = false)
    private int topScore;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopAccounts() {
        return topAccounts;
    }

    public void setTopAccounts(String topAccounts) {
        this.topAccounts = topAccounts;
    }

    public int getTopScore() {
        return topScore;
    }

    public void setTopScore(int topScore) {
        this.topScore = topScore;
    }
}
