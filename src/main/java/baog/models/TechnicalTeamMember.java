package baog.models;

import baog.enums.JiraAuthorities;
import baog.enums.TeamMemberRole;

import java.util.Objects;
import java.util.Set;

public class TechnicalTeamMember extends TeamMember{
    private Set<JiraAuthorities> jiraAuthorities;

    public TechnicalTeamMember(String id, String firstName, String lastName, TeamMemberRole teamMemberRole, Set<JiraAuthorities> jiraAuthorities) {
        super(id, firstName, lastName, teamMemberRole);
        this.jiraAuthorities = jiraAuthorities;
    }

    public  void printFirstName(){
        System.out.println(firstName);
    }

    @Override
    public boolean isAbleToCreateTask() {
//        !Objects.equals(TeamMemberRole.DEVELOPER, teamMemberRole)
        return !TeamMemberRole.DEVELOPER.equals(teamMemberRole) ;
    }

    @Override
    public String toString() {
        return "TechnicalTeamMember{" +
                "jiraAuthorities=" + jiraAuthorities +
                ", id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
