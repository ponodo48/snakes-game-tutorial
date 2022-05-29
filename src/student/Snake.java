package student;

import snakes.Bot;
import snakes.Coordinate;
import snakes.Direction;

import java.util.Vector;

public class Snake implements Bot {

    public Direction BFS(snakes.Snake snake,Snake opponent, Coordinate mazeSize, Coordinate apple){
        Vector<Boolean> visited;
        
        return  null;
    }


    @Override
    public Direction chooseDirection(snakes.Snake snake, snakes.Snake opponent, Coordinate mazeSize, Coordinate apple) {
        return Direction.UP;
    }
}
