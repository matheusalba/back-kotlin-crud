package alba.kotlindelphi.DTO

import java.util.UUID


data class UserDto (
    val name: String,
    val email: String,
    val phone: String,
    val uuid: UUID
    )