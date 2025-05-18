package com.web.designPatterns.creational.builder.userexample;

public class User {

    private String firstName;
    private String lastName;
    private Integer age;
    private String phno;
    private String address;

    public User(UserBuilder userBuilder) {
        this.firstName=userBuilder.firstName;
        this.lastName=userBuilder.lastName;
        this.age= userBuilder.age;
        this.phno= userBuilder.phno;
        this.address= userBuilder.address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phno='" + phno + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhno() {
        return phno;
    }


    public String getAddress() {
        return address;
    }
    public static class UserBuilder{
        private String firstName;
        private String lastName;
        private Integer age;
        private String phno;
        private String address;

        public UserBuilder(String firstName, String lastName){
            this.firstName=firstName;
            this.lastName=lastName;
        }
        public UserBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }
        public UserBuilder setPhno(String phno){
            this.phno=phno;
            return this;
        }
        public UserBuilder setAddress(String address){
            this.address=address;
            return this;
        }
        public User build(){
            return new User(this);
        }
        
    }
}
