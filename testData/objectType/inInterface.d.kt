package inInterface

@native
interface `T$0` {
    fun bar(a: Any): Number
    var baz: Any? = noImpl
    var boo: Any? = noImpl
    var show: (overrideChecks: Boolean) -> Unit
}
@native
interface `T$1` {
    var value: Any? = noImpl
    var done: Boolean
}
@native
interface `T$2` {
    fun bar(a: Any): Number
    fun baz(a: Any, b: Any, c: String): Boolean
}
@native
interface Foo {
    fun withObjectTypeParam(opt: `T$0`)
    fun returnsObjectType(): `T$1`
    var foo: `T$2`
}
