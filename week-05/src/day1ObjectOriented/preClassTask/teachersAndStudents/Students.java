package day1ObjectOriented.preClassTask.teachersAndStudents;

public class Students {

    public void learn() {
        System.out.println("boooooooooring");
    }

    public void question(Teachers teacher) {
        System.out.println("Hey teacher!");
        teacher.answer();
    }
}


/*
Student
learn()
question(teacher) -> calls the teachers answer method
Teacher
teach(student) -> calls the students learn method
answer()
 */