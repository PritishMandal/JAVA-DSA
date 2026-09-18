public class interfaces {
    public static void main(String[] args) {
       Queen q = new Queen();
       q.moves();
    }
    }
interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("UP,down,left,right,giogonal,(all in one)");
      

    }

}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right");

    }

}
