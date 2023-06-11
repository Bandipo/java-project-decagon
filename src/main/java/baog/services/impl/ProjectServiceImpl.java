package baog.services.impl;

import baog.models.Project;
import baog.services.ProjectService;
import org.apache.commons.lang3.StringUtils;

public class ProjectServiceImpl implements ProjectService {


    @Override
    public Project createProject(String projectId, String projectName, String projectDescription) {
        //validations
        // check if projectId is null or empty. if it is throw a runtime exception
        validateProjectId(projectId);
        return new Project(projectId, projectName, projectDescription);
    }

    private void validateProjectId(String projectId){
        if(StringUtils.isBlank(projectId)){
            throw new RuntimeException("ProjectId must be supplied");
        }
    }
}
