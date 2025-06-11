package Day5Looping;

public class GameProgram {
    public static void main(String[] args) {
       // System.out.println("Game Start: at level 1");

        for (int level = 1; level <=10; level++){
            if(level==3){
                System.out.println("level 3 is locked/under maintence");
                continue; //skip level 3
            } else if (level==6) {
                System.out.println("player eliminated");
                break; //end the game
            }
            else {
                System.out.println("Level" + level);
            }
        }
    }
}
