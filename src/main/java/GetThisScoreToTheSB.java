import java.util.concurrent.CopyOnWriteArrayList;

public abstract class GetThisScoreToTheSB {
static private CopyOnWriteArrayList<String> sortOfLogin = new CopyOnWriteArrayList<String>();
static private CopyOnWriteArrayList<Integer> sortOfScore = new CopyOnWriteArrayList<Integer>();

public static void AddLoginAndScore (Account SortAccount){
    sortOfLogin.add(SortAccount.getLogin());
    sortOfScore.add(SortAccount.getScore());
    }

    public static void SortAccounts (){

    }
}
