/*
 * Copyright (c) 2019, 2019, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.oracle.svm.jni.nativeapi;

import org.graalvm.nativeimage.c.function.CFunctionPointer;
import org.graalvm.nativeimage.c.function.InvokeCFunctionPointer;
import org.graalvm.nativeimage.c.type.CCharPointer;
import org.graalvm.word.PointerBase;
import org.graalvm.word.WordBase;

public final class JNIFunctionPointerTypes {
    public interface GetEnvFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        int invoke(JNIJavaVM vm, PointerBase env, int version);
    }

    public interface DefineClassFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        JNIObjectHandle invoke(JNIEnvironment env, CCharPointer name, JNIObjectHandle loader, CCharPointer buf, int bufLen);
    }

    public interface FindClassFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        JNIObjectHandle invoke(JNIEnvironment env, CCharPointer name);
    }

    public interface GetMemberIDFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        JNIMethodId invoke(JNIEnvironment env, JNIObjectHandle clazz, CCharPointer name, CCharPointer signature);
    }

    public interface GetFieldIDFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        JNIFieldId invoke(JNIEnvironment env, JNIObjectHandle clazz, CCharPointer name, CCharPointer signature);
    }

    public interface GetObjectClassFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        JNIObjectHandle invoke(JNIEnvironment env, JNIObjectHandle obj);
    }

    public interface CallObjectMethodFunctionPointer extends CFunctionPointer {
    }

    public interface CallObjectMethod0FunctionPointer extends CallObjectMethodFunctionPointer {
        @InvokeCFunctionPointer
        JNIObjectHandle invoke(JNIEnvironment env, JNIObjectHandle objOrClass, JNIMethodId methodID);
    }

    public interface CallObjectMethod1FunctionPointer extends CallObjectMethodFunctionPointer {
        @InvokeCFunctionPointer
        JNIObjectHandle invoke(JNIEnvironment env, JNIObjectHandle objOrClass, JNIMethodId methodID, WordBase arg0);
    }

    public interface CallObjectMethod2FunctionPointer extends CallObjectMethodFunctionPointer {
        @InvokeCFunctionPointer
        JNIObjectHandle invoke(JNIEnvironment env, JNIObjectHandle objOrClass, JNIMethodId methodID, WordBase arg0, WordBase arg1);
    }

    public interface CallObjectMethod3FunctionPointer extends CallObjectMethodFunctionPointer {
        @InvokeCFunctionPointer
        JNIObjectHandle invoke(JNIEnvironment env, JNIObjectHandle objOrClass, JNIMethodId methodID, WordBase arg0, WordBase arg1, WordBase arg2);
    }

    public interface CallObjectMethod4FunctionPointer extends CallObjectMethodFunctionPointer {
        @InvokeCFunctionPointer
        JNIObjectHandle invoke(JNIEnvironment env, JNIObjectHandle objOrClass, JNIMethodId methodID, WordBase arg0, WordBase arg1, WordBase arg2, WordBase arg3);
    }

    public interface CallObjectMethod5FunctionPointer extends CallObjectMethodFunctionPointer {
        @InvokeCFunctionPointer
        JNIObjectHandle invoke(JNIEnvironment env, JNIObjectHandle objOrClass, JNIMethodId methodID, WordBase arg0, WordBase arg1, WordBase arg2, WordBase arg3, WordBase arg4);
    }

    public interface CallBooleanMethodFunctionPointer extends CFunctionPointer {
    }

    public interface CallBooleanMethod0FunctionPointer extends CallBooleanMethodFunctionPointer {
        @InvokeCFunctionPointer
        boolean invoke(JNIEnvironment env, JNIObjectHandle objOrClass, JNIMethodId methodID);
    }

    public interface CallLongMethodFunctionPointer extends CFunctionPointer {
    }

    public interface CallLongMethod1FunctionPointer extends CallLongMethodFunctionPointer {
        @InvokeCFunctionPointer
        long invoke(JNIEnvironment env, JNIObjectHandle objOrClass, JNIMethodId methodID, WordBase arg0);
    }

    public interface CallLongMethod2FunctionPointer extends CallLongMethodFunctionPointer {
        @InvokeCFunctionPointer
        long invoke(JNIEnvironment env, JNIObjectHandle objOrClass, JNIMethodId methodID, WordBase arg0, WordBase arg1);
    }

    public interface GetStringUTFCharsFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        CCharPointer invoke(JNIEnvironment env, JNIObjectHandle str, CCharPointer isCopy);
    }

    public interface ReleaseStringUTFCharsFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        CCharPointer invoke(JNIEnvironment env, JNIObjectHandle str, CCharPointer utf);
    }

    public interface NewGlobalRefFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        JNIObjectHandle invoke(JNIEnvironment env, JNIObjectHandle obj);
    }

    public interface ExceptionVoidFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        void invoke(JNIEnvironment env);
    }

    public interface ExceptionCheckFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        boolean invoke(JNIEnvironment env);
    }

    public interface GetArrayLengthFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        int invoke(JNIEnvironment env, JNIObjectHandle array);
    }

    public interface NewObjectArrayFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        JNIObjectHandle invoke(JNIEnvironment env, int length, JNIObjectHandle elementClass, JNIObjectHandle initialElement);
    }

    public interface GetObjectArrayElementFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        JNIObjectHandle invoke(JNIEnvironment env, JNIObjectHandle array, int index);
    }

    public interface SetObjectArrayElementFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        void invoke(JNIEnvironment env, JNIObjectHandle array, int index, JNIObjectHandle value);
    }

    public interface FromReflectedMethodFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        JNIMethodId invoke(JNIEnvironment env, JNIObjectHandle method);
    }

    public interface ToReflectedMethodFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        JNIObjectHandle invoke(JNIEnvironment env, JNIObjectHandle clazz, JNIMethodId method, boolean isStatic);
    }

    public interface DeleteGlobalRefFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        void invoke(JNIEnvironment env, JNIObjectHandle globalRef);
    }

    public interface ExceptionOccurredFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        JNIObjectHandle invoke(JNIEnvironment env);
    }

    public interface ThrowFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        int invoke(JNIEnvironment env, JNIObjectHandle throwable);
    }

    public interface ThrowNewFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        int invoke(JNIEnvironment env, JNIObjectHandle clazz, CCharPointer message);
    }

    public interface GetSuperclassFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        JNIObjectHandle invoke(JNIEnvironment env, JNIObjectHandle clazz);
    }

    public interface IsAssignableFromFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        boolean invoke(JNIEnvironment env, JNIObjectHandle clazz, JNIObjectHandle toClazz);
    }

    public interface FromReflectedFieldFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        JNIFieldId invoke(JNIEnvironment env, JNIObjectHandle field);
    }

    public interface ToReflectedFieldFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        JNIObjectHandle invoke(JNIEnvironment env, JNIObjectHandle clazz, JNIFieldId field, boolean isStatic);
    }

    public interface RegisterNativesFunctionPointer extends CFunctionPointer {
        @InvokeCFunctionPointer
        int invoke(JNIEnvironment env, JNIObjectHandle clazz, JNINativeMethod methods, int nMethods);
    }

    private JNIFunctionPointerTypes() {
    }
}
