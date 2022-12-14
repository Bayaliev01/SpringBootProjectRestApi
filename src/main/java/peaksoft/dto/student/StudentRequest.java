package peaksoft.dto.student;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import peaksoft.enums.StudyFormat;

@Setter
@Getter
public class StudentRequest {

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

    @Enumerated(EnumType.STRING)
    private StudyFormat studyFormat;
}
