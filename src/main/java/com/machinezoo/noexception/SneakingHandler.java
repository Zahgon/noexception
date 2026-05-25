// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception;

final class SneakingHandler extends CheckedExceptionHandler {

    @Override
    public RuntimeException handle(Exception exception) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    static <T extends Throwable> RuntimeException sneak(Throwable exception) throws T {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
