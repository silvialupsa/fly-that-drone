package com.codecool.ftd.ui;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.logic.CombinatedlMovement;
import com.codecool.ftd.logic.MovementEngine;

import java.util.Scanner;

import static java.util.stream.Collectors.joining;

public class FlyThatDroneUi {
    private final Drone drone;
    private final MovementEngine movementEngine;
    private final CombinatedlMovement combinatedlMovement;
    private final Scanner scanner;

    public FlyThatDroneUi(Drone drone, MovementEngine movementEngine, CombinatedlMovement diagonalMovement, CombinatedlMovement combinatedlMovement, Scanner scanner) {
        this.drone = drone;
        this.movementEngine = movementEngine;
        this.combinatedlMovement = combinatedlMovement;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            displayMenu();
            handleChoice();
        }
    }

    private void displayMenu() {
        System.out.println("\n*** Fly That Drone ***");
        System.out.println("\nCurrent drone position: " + drone.getPosition());
        System.out.println("Available movements:\n" + getMovementNames());
    }

    private String getMovementNames() {
        return movementEngine.getCommands().stream()
                .collect(joining(", ")).concat(", "+ combinatedlMovement.getCommands().stream().collect(joining(", ")));
    }

    private void handleChoice() {
        System.out.print("\nChoice: ");
        String choice = scanner.next();
        movementEngine.move(drone, choice.toUpperCase());
        combinatedlMovement.move(drone, choice.toUpperCase());
    }
}
