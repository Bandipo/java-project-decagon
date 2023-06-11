package baog.models;

import baog.enums.TeamMemberRole;

import java.util.Objects;

public abstract class TeamMember {
    protected String id;
    protected String firstName;
    protected String lastName;
    protected TeamMemberRole teamMemberRole;

    public TeamMember(String id, String firstName, String lastName, TeamMemberRole teamMemberRole) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamMemberRole = teamMemberRole;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public TeamMemberRole getTeamMemberRole() {
        return teamMemberRole;
    }

    public void setTeamMemberRole(TeamMemberRole teamMemberRole) {
        this.teamMemberRole = teamMemberRole;
    }

    public abstract boolean isAbleToCreateTask();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeamMember)) return false;
        TeamMember that = (TeamMember) o;
        return Objects.equals(id, that.id) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && teamMemberRole == that.teamMemberRole;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, teamMemberRole);
    }

    @Override
    public String toString() {
        return "TeamMember{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", teamMemberRole=" + teamMemberRole +
                '}';
    }
}
