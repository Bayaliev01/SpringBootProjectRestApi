package peaksoft.dto.task;


import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TaskRequest {
    private String taskName;

    private String taskText;

    private String deadLine;
}
