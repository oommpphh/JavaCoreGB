package Homework1;

import Obstacle.*;
import Team.Team;
import Team.TeamMember;


public class Main {

    public static void main(String[] args) {
        Team newTeam = new Team ("NewTeam",
        new TeamMember("Кот", 5),
        new TeamMember("Собака", 6),
        new TeamMember("Змея", 6),
        new TeamMember("Слон", 3));

        Course course = new Course(new Cross(5), new Swimming(6), new Jump(4), new Flight(7));
        course.doIt(newTeam);
    }
}
