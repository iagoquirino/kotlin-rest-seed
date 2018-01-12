package com.rest.seed.model

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SomeEntityRepository : JpaRepository<SomeEntity, Long>
