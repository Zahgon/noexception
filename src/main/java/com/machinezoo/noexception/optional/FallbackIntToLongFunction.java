// Part of NoException: https://noexception.machinezoo.com
// Generated code. Edit generate.py instead.
package com.machinezoo.noexception.optional;

import java.util.function.*;

final class FallbackIntToLongFunction implements IntToLongFunction {

    private final OptionalIntToLongFunction inner;

    private final LongSupplier source;

    public FallbackIntToLongFunction(OptionalIntToLongFunction inner, LongSupplier source) {
        this.inner = inner;
        this.source = source;
    }

    @Override
    public long applyAsLong(int value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
