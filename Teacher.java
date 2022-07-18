import java.util.ArrayList;



    public class Teacher extends Person { //чтобы все свойства персоны перекочевали сюда пишем  extends

        private final ArrayList<Student> students; // храним студентов в ArrayList

        public Teacher(String surname, String name) {
            super(surname, name); //super - вызов конструктора класса родителя
            students = new ArrayList<>(); //даём ссылку на лист
        }

        public ArrayList<Student> getStudents() {
            return students;  //Getter на список студентов
        }

        public void addStudent(Student student) {   //передаём студента
            students.add(student);  //эту функцию нам надо вызвать в студенте

        }

        @Override
        public String toString() {   // передаем имя и фамилию у учителя
            return "Teacher{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }


    }



