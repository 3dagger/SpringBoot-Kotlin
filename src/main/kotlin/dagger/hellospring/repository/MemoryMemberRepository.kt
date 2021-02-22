package dagger.hellospring.repository

import dagger.hellospring.domain.Member
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class MemoryMemberRepository : MemberRepository{

    var store: HashMap<Long, Member> = HashMap()
    var sequence: Long = 0L

    override fun save(member: Member): Member {
        member.id = ++sequence
        store.put(member.id, member)
        return member
    }

    override fun findById(id: Long?): Member? {
        return store[id]
    }

//    override fun findByName(name: String?): Optional<Member> {
//        return store.values.stream()
//                .filter {member ->
//                    member.name.equals(name)
//                }
//                .findAny()
//    }

    override fun findByName(name: String?): Member? {
        return store.values.filter {member -> member.name.equals(name)}.find { true }
    }

    override fun finaAll(): List<Member> {
        return ArrayList(store.values)
    }
}