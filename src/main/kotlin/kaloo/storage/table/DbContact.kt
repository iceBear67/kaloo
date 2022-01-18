package kaloo.storage.table

import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.long
import org.ktorm.schema.varchar

object Contacts : Table<CachedContact>("t_contacts"){
    val id = long("id").primaryKey()
    val name = varchar("name")
}
interface CachedContact : Entity<CachedContact>{
    companion object : Entity.Factory<CachedContact>()
    var id: Long
    var name: String
}

object Groups : Table<CachedGroup>("t_groups"){
    val id = long("id").primaryKey()
    val name = varchar("name")
}

interface CachedGroup : Entity<CachedGroup>{
    companion object : Entity.Factory<CachedGroup>()
    var id: Long
    var name: String
}