package com.bridgelabz.epa

import grails.gorm.transactions.Transactional
import grails.web.servlet.mvc.GrailsParameterMap

@Transactional
class EmployeeService {

    def serviceMethod() {

    }

    def save(GrailsParameterMap params) {
        Employee employee = new Employee(params)
        def response = AppUtil.saveResponse(false, employee)
        if (employee.validate()) {
            employee.save(flush: true)
            if (!employee.hasErrors()){
                response.isSuccess = true
            }
        }
        return response
    }

    def list(GrailsParameterMap params) {
        params.max = params.max ?: GlobalConfig.itemsPerPage()
        List<Employee> listOfEmployees = Employee.createCriteria().list(params) {
            if (params?.colName && params?.colValue) {
                like(params.colName, "%" + params.colValue + "%")
            }
            if (!params.sort) {
                order("id", "desc")
            }
        }
        return [list: listOfEmployees, count: listOfEmployees.totalCount]
    }

    def create(){

    }
}
