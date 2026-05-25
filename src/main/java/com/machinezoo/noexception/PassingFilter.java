// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception;

class PassingFilter extends ExceptionFilter {

    final ExceptionHandler handler;

    PassingFilter(ExceptionHandler handler) {
        this.handler = handler;
    }

    @Override
    public void handle(Throwable exception) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
