package com.rest.seed.service

import com.rest.seed.model.SomeEntity
import com.rest.seed.model.SomeEntityRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional


@Service
@Transactional
class SomeEntityService(val repository: SomeEntityRepository) {

    fun findAll(): List<SomeEntity> {
        return repository.findAll()
    }

    fun save(someEntity: SomeEntity): SomeEntity {
        return repository.saveAndFlush(someEntity)
    }

}


