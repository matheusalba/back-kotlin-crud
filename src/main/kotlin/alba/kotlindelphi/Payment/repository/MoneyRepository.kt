package alba.kotlindelphi.Payment.repository

import alba.kotlindelphi.Payment.entity.MoneyEntity
import org.springframework.data.jpa.repository.JpaRepository

interface MoneyRepository:JpaRepository<MoneyEntity, Long>