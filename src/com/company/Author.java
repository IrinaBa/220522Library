package com.company;

public class Author {
    String firstname;
    String lastname;
    int yearbirth;

    public Author(String firstname, String lastname, int yearbirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearbirth = yearbirth;
    }
    public String toString(){
        return firstname+" "+lastname+". Year of birth "+yearbirth;
    }
}
