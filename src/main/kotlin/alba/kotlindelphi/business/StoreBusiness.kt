package alba.kotlindelphi.business

import alba.kotlindelphi.DTO.StoreDto
import alba.kotlindelphi.entity.StoreEntity
import alba.kotlindelphi.entity.UserEntity
import alba.kotlindelphi.repository.StoreRepository
import alba.kotlindelphi.repository.UserRepository
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("store")
class StoreBusiness(
    val storeRepository: StoreRepository,
    val userRepository: UserRepository
) {
    @PostMapping("save/{user_id}")
    fun postStore(@PathVariable user_id:Long, @RequestBody storeDto: StoreDto){
        userRepository.findById(user_id).map{
            user ->
            storeRepository.save(storeDtoToStoreEntity(storeDto,user))
        }
    }

    fun storeDtoToStoreEntity(storeDto: StoreDto, user: UserEntity):StoreEntity{
        return StoreEntity(null,storeDto.store_name,user)
    }
}
