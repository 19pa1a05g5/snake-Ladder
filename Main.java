import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
       System.out.println("Enter Number of Dice");
       int n =sc.nextInt();
      //Dice dice=new Dice(1);
         Dice dice = new Dice(n);
         System.out.println("Enter no of players ");
         int n1=sc.nextInt();
        //  Player p1 = new Player("Sirisha");
        //  Player p2 = new Player("Renu");
        //  Player p3=new Player("Sri");
         Map<String,Integer> playersCurrentPosition = new HashMap<>();
        Queue<Player> allPlayers = new LinkedList<>();
         for(int i=0;i<n1;i++){
           System.out.println("Name of the player"+(i+1));
          String p1=sc.next();
           Player p=new Player(p1);
           playersCurrentPosition.put(p1,0);
          allPlayers.add(p);
        //  allPlayers.offer(p2);
        //  allPlayers.offer(p3);
         }
         System.out.println("Enter no of Snakes");
         int n2=sc.nextInt();
         
         
        // System.out.println(allPlayers);
        // Jumper snake1 = new Jumper(10,2);
        // Jumper snake2 = new Jumper(99,12);

        List<Jumper> snakes = new ArrayList<>();
        for(int i=0;i<n2;i++){
          System.out.println("Enter Start and end positions");
          int s=sc.nextInt();
          int s1=sc.nextInt();
          // String[] arr=sc.nextLine().split(" ");
          Jumper snake1=new Jumper(s,s1);
          snakes.add(snake1);
        // snakes.add(snake2);
        }
        System.out.println("Enter no of ladders");
         int n3=sc.nextInt();
        // Jumper ladder1 = new Jumper(5,25);
        // Jumper ladder2 = new Jumper(40,89);
        List<Jumper> ladders = new ArrayList<>();
        for(int i=0;i<n3;i++){
          System.out.println("Enter Start and end positions");
          int l=sc.nextInt();
          int l1=sc.nextInt();
          // String[] arr=sc.nextLine().split(" ");
          Jumper ladder1=new Jumper(l,l1);
        ladders.add(ladder1);
        // ladders.add(ladder2);
        }
       
        // playersCurrentPosition.put("Sirisha",0);
        // playersCurrentPosition.put("Renu",0);
        // playersCurrentPosition.put("Sri",0);
        GameBoard gb=new GameBoard(dice,allPlayers,snakes,ladders, playersCurrentPosition,100);
        gb.startGame();
    }
}