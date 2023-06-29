package com.codecool.ftd.logic;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;

import java.util.List;

public class MovementEngine {

    public void move(Drone drone, String command) {
        switch (command){
            case "FORWARD": drone.setPosition(new Position(drone.getPosition().x()-1, drone.getPosition().y(), drone.getPosition().z()));
            case "BACKWARD": drone.setPosition(new Position(drone.getPosition().x()+1, drone.getPosition().y(), drone.getPosition().z()));
            case "LEFT":drone.setPosition(new Position(drone.getPosition().x(), drone.getPosition().y()+1, drone.getPosition().z()));
            case "RIGHT":drone.setPosition(new Position(drone.getPosition().x(), drone.getPosition().y()+1, drone.getPosition().z()));
        }

    }

    public List<String> getCommands() {
        return List.of("FORWARD", "BACKWARD", "LEFT", "RIGHT" );
    }
}
