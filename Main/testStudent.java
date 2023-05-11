package Main;

import Classs.Student;

public class testStudent {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("john");
        st.setClasses("CO2");
        System.out.println("name : " +st.getName() + " classes " + st.getClasses());
    }
}
