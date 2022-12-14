package peaksoft.dto.instructor;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InstructorRequest {

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

    private String specialization;


}