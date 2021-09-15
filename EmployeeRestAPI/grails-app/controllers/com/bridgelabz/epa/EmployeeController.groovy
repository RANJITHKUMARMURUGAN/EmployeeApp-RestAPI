package com.bridgelabz.epa

class EmployeeController {

    EmployeeService employeeService

    def index() {
    }

    def create(){
    }

    def save() {
        def response = employeeService.save(params)
        if (!response.isSuccess) {
            flash.redirectParams = response.model
            redirect(controller: "employee", action: "create")
        }else{
            redirect(controller: "employee", action: "index")
        }
    }
}
