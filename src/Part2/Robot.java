package Part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Robot {
    private String name;
    private char direction;
    private int x,y;
    public Robot(String name, char dir, int x, int y){
        this.name = name;
        if("NESWnesw".indexOf(dir) == -1){
            //set default
            direction = 'N';
        }
        else{
            direction = Character.toUpperCase(dir);
        }
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return name + " is standing at (" + x + "," + y + ") and facing "+ direction;
    }
    public void turnClockwise(){
        String dir = "NESWN";
        int index = dir.indexOf(direction);
        direction = dir.charAt(index+1);
    }
    public void turnCounterClockwise(){
        String dir = "WNESW";
        int index = dir.indexOf(direction,1);
        direction = dir.charAt(index -1);
    }
    public void takeSteps(int steps){
        switch (direction){
            case 'N':
                y += steps;
                break;
            case 'S':
                y -= steps;
                break;
            case 'E':
                x += steps;
                break;
            case 'W':
                x -= steps;
                break;
        }
    }
    public static Robot[] fillRobot(){
        Robot[] robby = new Robot[5];
        for (int i = 0; i < 5; i++){
            robby[i] = new Robot("robot "+ (i+1),'E',i+1,i+1);
        }
        return robby;
    }

    public static void main(String[] args) {
        Robot[] robots = fillRobot();
        for (Robot robot: robots){
            System.out.println(robot);
        }
    }
}
