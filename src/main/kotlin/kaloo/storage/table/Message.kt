package kaloo.storage.table

import org.ktorm.entity.Entity
import org.ktorm.schema.*

object GroupMessages : Table<CachedGroupMessage>("t_group_messages") {
    val id = long("id").primaryKey()
    val groupId = long("group_id")
    val memberId = long("member_id")
    val date = datetime("time")
    val content = varchar("content")
}

object ContactMessages : Table<CachedContactMessage>("t_contact_messages") {
    val id = long("id").primaryKey()
    val contactId = long("contact_id")
    val date = datetime("time")
    val content = varchar("content")
}

interface CachedGroupMessage : Entity<CachedGroupMessage> {
    companion object : Entity.Factory<CachedGroupMessage>()

    var id: Long
    var groupId: Long
    var memberId: Long
    var date: Long
    var content: String
}

interface CachedContactMessage : Entity<CachedContactMessage> {
    companion object : Entity.Factory<CachedContactMessage>()

    var id: Long
    var contactId: Long
    var date: Long
    var content: String
}