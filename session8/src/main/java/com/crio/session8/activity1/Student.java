package com.crio.session8.activity1;


public class Student {
    
    private final String firstName; // mandatory
    private final String lastName; // mandatory
    private final String age; // optional
    private final String gender; // optional
    private final boolean isGraduate; // optional
    private final boolean hasExperience; // optional
    private final String city; // optional
    private final String state; // optional
    private final boolean isEarning; // optional


    private Student(StudentBuilder studentbuilder){
        this.firstName=studentbuilder.firstName;
        this.lastName=studentbuilder.lastName;
        this.age=studentbuilder.age;
        this.gender=studentbuilder.gender;
        this.isGraduate=studentbuilder.isGraduate; 
        this.hasExperience=studentbuilder.hasExperience; 
        this.city=studentbuilder.city; 
        this.state=studentbuilder.state; 
        this.isEarning=studentbuilder.isEarning; 
    }

    public static class StudentBuilder{
        private String firstName; // mandatory
        private String lastName; // mandatory
        private String age; // optional
        private String gender; // optional
        private boolean isGraduate; // optional
        private boolean hasExperience; // optional
        private String city; // optional
        private String state; // optional
        private boolean isEarning; // optional

        public StudentBuilder(String firstName,String lastName){
            this.firstName=firstName;
            this.lastName=lastName;
        }

        public StudentBuilder addAge(String age){
            this.age=age;
            return this;
        }

        public StudentBuilder addGender(String gender){
            this.gender=gender;
            return this;
        }

        @Override
        public String toString() {
            return "StudentBuilder [age=" + age + ", city=" + city + ", firstName=" + firstName
                    + ", gender=" + gender + ", hasExperience=" + hasExperience + ", isEarning="
                    + isEarning + ", isGraduate=" + isGraduate + ", lastName=" + lastName
                    + ", state=" + state + "]";
        }

        public StudentBuilder addCity(String city){
            this.city=city;
            return this;
        }

        public StudentBuilder addisGraduate(boolean isGraduate){
            this.isGraduate=isGraduate;
            return this;
        }
        public StudentBuilder addState(String state){
            this.state=state;
            return this;
        }
        public StudentBuilder addhasExperience(boolean hasExperience){
            this.hasExperience=hasExperience;
            return this;
        }
        public StudentBuilder addisEarning(boolean isEarning){
            this.isEarning=isEarning;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
        
    }
    
    public static void main(String args[])
    { 

       Student student=new Student.StudentBuilder("Gowri", "Manohari")
       .addAge("24").build();
        System.out.print(student.firstName);

    }
}