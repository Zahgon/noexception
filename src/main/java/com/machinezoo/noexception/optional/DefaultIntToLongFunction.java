// Part of NoException: https://noexception.machinezoo.com
// Generated code. Edit generate.py instead.
package com.machinezoo.noexception.optional;

import java.util.function.*;

final class DefaultIntToLongFunction implements IntToLongFunction {

    private final OptionalIntToLongFunction inner;

    private final long result;

    public DefaultIntToLongFunction(OptionalIntToLongFunction inner, long result) {
        this.inner = inner;
        this.result = result;
    }

    @Override
    public long applyAsLong(int value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
