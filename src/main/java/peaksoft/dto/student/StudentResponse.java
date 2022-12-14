package peaksoft.dto.student;


import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import peaksoft.enums.StudyFormat;

@Setter
@Getter
public class StudentResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    @Enumerated(EnumType.STRING)
    private StudyFormat studyFormat;
}
