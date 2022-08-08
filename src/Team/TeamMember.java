package Team;

import Homework1.Status;

public class TeamMember {

    private Status status = Status.NoPassedDistance;

    private final String name;

    private final int power;

    public TeamMember(String name, int power) {

        this.name = name;

        this.power = power;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void jump(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus (Status.PassedDistance, " Победил в прыжках");
        }
        else {
            changeStatus (Status.NoPassedDistance, " Проиграл в прыжках");
        }
    }

    public void cross(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus (Status.PassedDistance, " Победил в забеге");
        }
        else {
            changeStatus (Status.NoPassedDistance, " Проиграл в забеге");
        }
    }

    public void swimming(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus (Status.PassedDistance, " Победил в заплыве");
        }
        else {
            changeStatus (Status.NoPassedDistance, " Проиграл в заплыве");
        }
    }

    public void flight(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus (Status.PassedDistance, " Умеет летать");
        }
        else {
            changeStatus (Status.NoPassedDistance, " Не умеет летать");
        }
    }

    private boolean checkPower(int courseDifficulty) { return power > courseDifficulty || power == courseDifficulty; }

    private void changeStatus(Status newStatus, String message) {
        status = newStatus;
        System.out.println(name + message);
    }
}
