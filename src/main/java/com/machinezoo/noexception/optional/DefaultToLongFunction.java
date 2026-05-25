// Part of NoException: https://noexception.machinezoo.com
// Generated code. Edit generate.py instead.
package com.machinezoo.noexception.optional;

import java.util.function.*;

final class DefaultToLongFunction<T> implements ToLongFunction<T> {

    private final OptionalToLongFunction<T> inner;

    private final long result;

    public DefaultToLongFunction(OptionalToLongFunction<T> inner, long result) {
        this.inner = inner;
        this.result = result;
    }

    @Override
    public long applyAsLong(T value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
