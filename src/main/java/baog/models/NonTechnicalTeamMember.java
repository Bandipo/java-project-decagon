package baog.models;

import baog.enums.JiraAuthorities;
import baog.enums.TeamMemberRole;

import java.util.List;
import java.util.Set;

import static baog.enums.JiraAuthorities.*;

public class NonTechnicalTeamMember extends TeamMember {
    private Set<JiraAuthorities> jiraAuthorities;

    public NonTechnicalTeamMember(String id, String firstName, String lastName, TeamMemberRole teamMemberRole) {
        super(id, firstName, lastName, teamMemberRole);
    }

    @Override
    public boolean isAbleToCreateTask() {
        List<JiraAuthorities> requiredAuthourities = List.of(PROJECT_MANAGER_AUTHORITY, TECHNICAL_MANAGER_AUTHORITY, CAN_CREATE_TASK);
        return getJiraAuthorities().containsAll(requiredAuthourities);

    }

    public Set<JiraAuthorities> getJiraAuthorities() {
        return jiraAuthorities;
    }

    @Override
    public String toString() {
        return "NonTechnicalTeamMember{" +
                "jiraAuthorities=" + jiraAuthorities +
                ", id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
