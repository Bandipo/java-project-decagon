package baog.models;

import java.util.Objects;

public class Project {
    private final String projectId;
    private final String name;
    private  String description;
    //add list of tasks
    //add list of teamMember


    public Project(String projectId, String name, String description) {
        this.projectId = projectId;
        this.name = name;
        this.description = description;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project)) return false;
        Project project = (Project) o;
        return Objects.equals(projectId, project.projectId) && Objects.equals(name, project.name) && Objects.equals(description, project.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, name, description);
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId='" + projectId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
