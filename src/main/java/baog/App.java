package baog;

import baog.models.Project;
import baog.models.ProjectTask;
import baog.services.ProjectService;
import baog.services.impl.ProjectServiceImpl;

public class App {
    private static  ProjectService projectService = new ProjectServiceImpl();

    public static void main(String[] args) {
        //create a Task

//        Project project = new Project("MBL","Moniepoint Business Loan","Whatever");
//
//        ProjectTask projectTask = new ProjectTask("1",project);


        Project project = projectService.createProject("", "", null);

        System.out.println(project);

    }
}
