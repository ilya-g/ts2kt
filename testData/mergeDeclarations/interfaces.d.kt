package interfaces

@module
object _ {
    interface LoDashStatic {
        fun chain(value: Number): LoDashWrapper<Number>
        fun chain(value: String): LoDashWrapper<String>
        fun chain(value: Boolean): LoDashWrapper<Boolean>
        fun chain<T>(value: Array<T>): LoDashArrayWrapper<T>
        fun chain(value: Any): LoDashWrapper<Any>
        fun compact<T>(array: Array<T>): Array<T>
        fun compact<T>(array: List<T>): Array<T>
    }
}
