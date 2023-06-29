package com.codecool.ftd.logic;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;

import java.util.List;

public class DiagonalMovement {
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
            case "RIGHT"->drone.setPosition(new Position(drone.getPosition().x(), drone.getPosition().y()+1, drone.getPosition().z()));
        }
    }
    public List<String> getCommands() {
        return List.of("FORWARD", "BACKWARD", "LEFT", "RIGHT" );
    }
}
