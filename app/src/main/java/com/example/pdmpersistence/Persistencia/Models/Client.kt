package com.example.pdmpersistence.Persistencia.Models

import org.w3c.dom.DocumentType

class Client(idClient: Int, documentType: String, documentNumber: Number, firstName: String, secondName: String,
            lastName: String, secondSurname: String, sex: String, birthdate: String, email: String, cellphone: String,
            createdDate: String, modifiedDate: String) {

    var idClient: Int = 0
    var documentType: String = ""
    var documentNumber: Int = 0
    var firstName: String = ""
    var secondName: String = ""
    var lastName: String = ""
    var secondSurname: String = ""
    var sex: String = ""
    var birthdate: String = ""
    var email: String = ""
    var cellphone: String = ""
    var createdDate: String = ""
    var modifiedDate: String = ""

    constructor():this(0, "", 0, "", "", "", "", "", "", "", "", "", "")
}