package alba.kotlindelphi.repository

import alba.kotlindelphi.entity.MoneyEntity
import org.springframework.data.jpa.repository.JpaRepository

interface MoneyRepository:JpaRepository<MoneyEntity, Long>