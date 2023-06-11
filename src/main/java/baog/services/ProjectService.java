package baog.services;

import baog.models.Project;

public interface ProjectService {

    Project createProject(String projectId, String projectName, String projectDescription);
}
