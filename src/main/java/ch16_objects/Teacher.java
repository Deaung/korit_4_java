package ch16_objects;

import java.util.Objects;

public class Teacher {
    private String name;
    private String schoolName;

    public Teacher() {
    }

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", schoolName='" + schoolName
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(schoolName, teacher.schoolName);
    }

    // 객체명1.equals(객체명 2
    // )

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }
}
