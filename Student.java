
    public class Student extends Person {

        private Teacher teacher;

        public Student(String surname, String name) {
            super(surname, name);
        }

        public Teacher getTeacher() {   //нужен Getter учителя (ALT + Insert)
            return teacher;
        }


        public void choiceTeacher(Teacher teacher) { //сетит учителя - передаём учителя какого-нибудь
            this.teacher = teacher;
            teacher.addStudent(this);  //добавили студента учителю из класса Teacher

        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }


