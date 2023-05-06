package alba.kotlindelphi.repository

import alba.kotlindelphi.entity.PaymentCodeEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface PaymentCodeRepository:JpaRepository<PaymentCodeEntity, UUID>