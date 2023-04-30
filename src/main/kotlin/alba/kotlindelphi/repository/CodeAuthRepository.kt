package alba.kotlindelphi.repository

import alba.kotlindelphi.entity.CodeEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface CodeAuthRepository: JpaRepository<CodeEntity,Long> {

    @Query("""
        select
        exists(
        select 
        atc.code
        from authcodes atc
        where atc.code = :codigo
) 
    """, nativeQuery = true)
    fun queryAuthCode(
        @Param("codigo")codigo:UUID
    ):List<*>

}