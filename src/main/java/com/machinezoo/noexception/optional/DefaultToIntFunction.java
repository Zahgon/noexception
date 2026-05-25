// Part of NoException: https://noexception.machinezoo.com
// Generated code. Edit generate.py instead.
package com.machinezoo.noexception.optional;

import java.util.function.*;

final class DefaultToIntFunction<T> implements ToIntFunction<T> {

    private final OptionalToIntFunction<T> inner;

    private final int result;

    public DefaultToIntFunction(OptionalToIntFunction<T> inner, int result) {
        this.inner = inner;
        this.result = result;
    }

    @Override
    public int applyAsInt(T value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
