package com.bridgelabz

import grails.rest.Resource

import java.time.LocalDate;

@Resource(uri = "/employee")
class EmployeeModel {
    Long id
    String name
    Integer age
    LocalDate joined
    Long salary
    static constraints = {
        id blank: false,unique: true
        name blank: false
        age blank: false
        joined blank: false
        salary blank: false

    }
    String toString(){
        name
    }
}
