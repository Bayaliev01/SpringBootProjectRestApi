package peaksoft.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Groups {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "group_seq")
    @SequenceGenerator(name = "group_seq", sequenceName = "group_seq", allocationSize = 1)
    private Long id;

    @Column(length = 100000, name = "group_name")
    private String groupName;

    @Column(name = "date_of_start")
    @CreatedDate
    @CreationTimestamp
    private LocalDateTime dateOfStart;

    @Column(length = 100000, name = "image")
    private String image;

    private int count;

    public void plusCount() {
        count++;
    }

    public void minusCount() {
        count--;
    }


    @ManyToMany(cascade = {MERGE, REFRESH, DETACH}, mappedBy = "groups")
    private List<Course> courses;

    public void addCourse(Course course) {
        if (courses == null) {
            courses = new ArrayList<>();
        }
        courses.add(course);
        plusCount();
    }

    @OneToMany(cascade = {ALL}, fetch = FetchType.LAZY, mappedBy = "groups")

    private List<Student> students;

    public void addStudent(Student student) {
        if (students == null) {
            students = new ArrayList<>();
        }
        students.add(student);
        this.getCompany().plusStudent();
    }

    @ManyToOne(cascade = {MERGE, DETACH, REFRESH, PERSIST}, fetch = FetchType.EAGER)
    private Company company;

    public void assignStudent(Student student) {
        if (students == null) {
            students = new ArrayList<>();
        }
        students.add(student);
    }

}