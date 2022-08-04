package foldenx.parser.util

class Namespace(val id: String, val parent: Namespace? = null) {
    fun isEqualTo(other: Namespace?): Boolean =
        other?.let { it.id == id && (parent?.isEqualTo(it.parent) ?: it.parent) == null } ?: false
}