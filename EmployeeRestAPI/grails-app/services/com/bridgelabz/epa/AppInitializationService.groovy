package com.bridgelabz.epa

import grails.gorm.transactions.Transactional

@Transactional
class AppInitializationService {

    static initialize() {
        initMember()
    }

    private static initMember() {
        if(Employee.count == 0){
            println("Sorry No Data Avaiable")
        }
        if (Employee.count() == 0) {

        }
    }
}
