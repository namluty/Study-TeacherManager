package Controller;

import Model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherManager {
    private List<Teacher> teachersList = new ArrayList<>();

    public TeacherManager() {
    }

    public TeacherManager(List<Teacher> teachers) {
        this.teachersList = teachers;
    }

    public List<Teacher> getTeachers() {
        return teachersList;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachersList = teachers;
    }

    public void addInfoTeacher(Teacher teacher) {
        teachersList.add(teacher);
    }
    public void editInfoTeacher(int index,Teacher editer) {
        teachersList.remove(index);
        teachersList.add(index,editer);
    }
    public void deleteInfoTeacher(int index) {
        teachersList.remove(index);
    }
    public int searchByName(String name) {
        for (int i = 0; i < teachersList.size(); i++) {
            if (teachersList.get(i).getName().equals(name)){
                return i;
            }
        }
        return  -1;
    }
    public void showAll(){
        for (Teacher teacher:teachersList) {
            System.out.println(teacher);
        }
    }



}
