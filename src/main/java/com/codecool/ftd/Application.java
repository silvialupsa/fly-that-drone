package com.codecool.ftd;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;
import com.codecool.ftd.logic.CombinatedlMovement;
import com.codecool.ftd.logic.MovementEngine;
import com.codecool.ftd.ui.FlyThatDroneUi;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Position startingPosition = new Position(0, 0, 0);
        Drone drone = new Drone(startingPosition);
        MovementEngine movementEngine = new MovementEngine();
        CombinatedlMovement combinatedlMovement= new CombinatedlMovement();
        Scanner scanner = new Scanner(System.in);
        FlyThatDroneUi flyThatDroneUi = new FlyThatDroneUi(drone, movementEngine, combinatedlMovement, combinatedlMovement, scanner);
        flyThatDroneUi.start();
    }
}
