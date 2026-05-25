// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception;

import java.lang.reflect.*;
import java.util.*;

final class WrappingHandler extends CheckedExceptionHandler {

    @Override
    public RuntimeException handle(Exception exception) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
