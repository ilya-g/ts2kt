package function

@native
interface `T$0` {
    fun bar(a: Any): Number
    var baz: Any? = noImpl
    var boo: Any? = noImpl
    var show: (overrideChecks: Boolean) -> Unit
}
@native
fun withObjectTypeParam(opt: `T$0`): Unit = noImpl
@native
interface `T$1` {
    fun bar(a: Any): Number
    var baz: Any? = noImpl
    var show: (overrideChecks: Boolean) -> Unit
}
@native
fun returnsObjectType(): `T$1` = noImpl
