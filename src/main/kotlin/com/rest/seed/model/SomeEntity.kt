package com.rest.seed.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.AUTO
import javax.persistence.Id

@Entity
data class SomeEntity(
        @Id @GeneratedValue(strategy = AUTO) var id: Long = 0,
        var name: String = ""
)
