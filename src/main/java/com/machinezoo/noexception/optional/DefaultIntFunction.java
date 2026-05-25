// Part of NoException: https://noexception.machinezoo.com
// Generated code. Edit generate.py instead.
package com.machinezoo.noexception.optional;

import java.util.function.*;

final class DefaultIntFunction<R> implements IntFunction<R> {

    private final OptionalIntFunction<R> inner;

    private final R result;

    public DefaultIntFunction(OptionalIntFunction<R> inner, R result) {
        this.inner = inner;
        this.result = result;
    }

    @Override
    public R apply(int value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
