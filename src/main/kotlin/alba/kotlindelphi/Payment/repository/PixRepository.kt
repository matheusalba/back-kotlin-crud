package alba.kotlindelphi.Payment.repository

import alba.kotlindelphi.Payment.entity.PixEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PixRepository:JpaRepository<PixEntity, Long>