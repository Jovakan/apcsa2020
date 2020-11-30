public class Post {

  private String a;
  private String b;
  private int c;

public Post(String user, String contents, int favorites) {
  a = user;
  b = contents;
  c = favorites; }
 
 public String toString() {
    return a + "\n" + b + "\n\tFavorited by " + c + " users";
 }
}
