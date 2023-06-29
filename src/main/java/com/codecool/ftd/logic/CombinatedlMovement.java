package com.codecool.ftd.logic;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;

import java.util.List;

public class CombinatedlMovement {
    public void move(Drone drone, String command) {
        MovementEngine movementEngine = new MovementEngine();
        switch (command){
            case "FORWARD-LEFT"->{
                movementEngine.move(drone, "FORWARD");
                movementEngine.move(drone, "LEFT");
            }
            case "FORWARD-RIGHT"->{
                movementEngine.move(drone, "FORWARD");
                movementEngine.move(drone, "RIGHT");
            }
            case "BACKWARD-LEFT"->{
                movementEngine.move(drone, "BACKWARD");
                movementEngine.move(drone, "LEFT");
            }
            case "BACKWARD-RIGHT"->{
                movementEngine.move(drone, "BACKWARD");
                movementEngine.move(drone, "RIGHT");
            }
            case "UP"->movementEngine.setNewPosition(drone, 0, 0, 1);
            case "DOWN"->movementEngine.setNewPosition(drone, 0, 0, -1);
        }
    }
    public List<String> getCommands() {
        return List.of("FORWARD-LEFT", "FORWARD-RIGHT", "BACKWARD-LEFT", "BACKWARD-RIGHT" );
    }
}
