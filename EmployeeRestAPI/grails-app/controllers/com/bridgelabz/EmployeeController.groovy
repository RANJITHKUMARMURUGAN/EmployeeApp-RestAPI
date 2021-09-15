package com.bridgelabz

class EmployeeController {

    EmployeeService employeeService
    static allowedMethods = [create:["POST","DELETE"]]

    def index() { }
    def create(){
        if(request.method=="POST"){
            employeeService.create();
        }else{
            return false
        }
    }
}
