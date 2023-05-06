package alba.kotlindelphi.repository

import alba.kotlindelphi.entity.PixEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PixRepository:JpaRepository<PixEntity, Long>