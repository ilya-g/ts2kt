package useJsonWhenPossible

native
public var foo: Json = noImpl
module
public object Module {
    public var bar: Json = noImpl
    public fun withObjectTypeParam(bar: Json): Unit = noImpl
    public class Foo {
        public var prop: Json = noImpl
    }
}
native
public trait `T$0` {
    public fun get(s: Number): Any
    public fun set(s: Number, value: Any): Unit
}
native
public trait Foo {
    public var foo: Json
    public var boo: `T$0`
}
