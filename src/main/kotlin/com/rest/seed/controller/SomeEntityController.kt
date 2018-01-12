package com.rest.seed.controller

import com.rest.seed.model.SomeEntity
import com.rest.seed.service.SomeEntityService
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = "/someentities")
class SomeEntityController(val service: SomeEntityService) {

    @GetMapping
    fun findAll(): ResponseEntity<List<SomeEntity>> {
        return ok(service.findAll())
    }

    @PostMapping
    fun save(@RequestBody someEntity: SomeEntity): ResponseEntity<SomeEntity> {
        return ok(service.save(someEntity))
    }


}
