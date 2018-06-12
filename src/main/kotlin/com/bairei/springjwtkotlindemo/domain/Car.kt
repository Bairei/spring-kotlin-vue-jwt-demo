package com.bairei.springjwtkotlindemo.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Car (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var make: String = "",
        var model: String = "",
        var horsePower: Int = 0,
        var yearOfProduction: Int = 0
)