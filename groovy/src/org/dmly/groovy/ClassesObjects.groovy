package org.dmly.groovy

class Patient {
    def firstName, lastName, age

    void setLastName(lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException('Last name cannot be null');
        }
        this.lastName = lastName
    }
}

Patient patient = new Patient(firstName:'John', lastName:'Doe', age:45);
println(patient.firstName + " " + patient.lastName + " " + patient.age)

Patient patient1 = new Patient(firstName:'John', age:45);
patient1.setLastName(null);
println(patient1)

c = {

}