// Part of NoException: https://noexception.machinezoo.com
// Generated code. Edit generate.py instead.
package com.machinezoo.noexception.optional;

import java.util.function.*;

final class FallbackLongToIntFunction implements LongToIntFunction {

    private final OptionalLongToIntFunction inner;

    private final IntSupplier source;

    public FallbackLongToIntFunction(OptionalLongToIntFunction inner, IntSupplier source) {
        this.inner = inner;
        this.source = source;
    }

    @Override
    public int applyAsInt(long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
