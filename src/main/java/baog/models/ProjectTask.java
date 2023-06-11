package baog.models;

import baog.enums.TaskStatus;
import baog.enums.TaskTimeFrame;

import java.time.LocalDate;
import java.util.Objects;

public class ProjectTask {
    private String taskId;
    private Project project;
    // assignedBy
    //assignedTo
    //testedBy
   private TaskStatus status;
   private String estimate;
   private int timeUnit;
   private TaskTimeFrame timeFrame;
   private LocalDate startDate;

    public ProjectTask(String taskId, Project project) {
        this.taskId = taskId;
        this.project = project;
    }

    public ProjectTask(String taskId, Project project, TaskStatus status, String estimate, int timeUnit, TaskTimeFrame timeFrame, LocalDate startDate) {
        this.taskId = taskId;
        this.project = project;
        this.status = status;
        this.estimate = estimate;
        this.timeUnit = timeUnit;
        this.timeFrame = timeFrame;
        this.startDate = startDate;
    }


    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public String getEstimate() {
        return estimate;
    }

    public void setEstimate(String estimate) {
        this.estimate = estimate;
    }

    public int getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(int timeUnit) {
        this.timeUnit = timeUnit;
    }

    public TaskTimeFrame getTimeFrame() {
        return timeFrame;
    }

    public void setTimeFrame(TaskTimeFrame timeFrame) {
        this.timeFrame = timeFrame;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProjectTask)) return false;
        ProjectTask that = (ProjectTask) o;
        return Objects.equals(taskId, that.taskId) && Objects.equals(project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, project);
    }

    @Override
    public String toString() {
        return "ProjectTask{" +
                "taskId='" + taskId + '\'' +
                ", project=" + project +
                '}';
    }
}
