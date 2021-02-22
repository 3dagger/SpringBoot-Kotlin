package dagger.hellospring.repository

import dagger.hellospring.domain.Member
import java.util.*

interface MemberRepository {
    fun save(member: Member) : Member

    fun findById(id: Long?) : Member?

    fun findByName(name: String?) : Member?

    fun finaAll(): List<Member>
}