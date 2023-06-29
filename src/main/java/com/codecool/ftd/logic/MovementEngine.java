package com.codecool.ftd.logic;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;

import java.util.List;

public class MovementEngine {

    public void move(Drone drone, String command) {
        switch (command){
            case "FORWARD"->setNewPosition(drone, -1, 0, 0);
            case "BACKWARD"->setNewPosition(drone, +1, 0, 0);
            case "LEFT"->setNewPosition(drone, 0, -1, 0);
            case "RIGHT"->setNewPosition(drone, 0, +1, 0);
        }
    }
    public List<String> getCommands() {
        return List.of("FORWARD", "BACKWARD", "LEFT", "RIGHT" );
    }

    public void setNewPosition(Drone drone, int xMove, int yMove, int zMove){
        drone.setPosition(new Position(drone.getPosition().x()+xMove, drone.getPosition().y()+yMove, drone.getPosition().z()+zMove));
    }
}
