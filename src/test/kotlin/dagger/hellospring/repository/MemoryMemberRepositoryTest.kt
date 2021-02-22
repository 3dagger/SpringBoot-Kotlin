package dagger.hellospring.repository

import dagger.hellospring.domain.Member
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MemoryMemberRepositoryTest {

    private val repository = MemoryMemberRepository()

    @Test
    fun save() {
        val member = Member(id = 0L,name = "")
        member.name = "spring"

        repository.save(member)

        val result = repository.findById(member.id)
        Assertions.assertThat(member).isEqualTo(result)
    }

    @Test
    fun findByName() {
//        var member1 = Member()
    }
}