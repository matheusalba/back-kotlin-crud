package alba.kotlindelphi.User.dto

import java.util.UUID


class UserDto (
    val name: String,
    val email: String,
    val phone: String,
    val uuid: UUID
)