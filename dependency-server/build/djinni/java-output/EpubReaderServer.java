// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from proj.djinni

package com.epubreader.library;

import java.util.concurrent.atomic.AtomicBoolean;

/** EpubServer class */
public abstract class EpubReaderServer {
    public abstract void start();

    public abstract void stop();

    public static native EpubReaderServer create(String documentRoot, String epubFile);

    private static final class CppProxy extends EpubReaderServer
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
        public void destroy()
        {
            boolean destroyed = this.destroyed.getAndSet(true);
            if (!destroyed) nativeDestroy(this.nativeRef);
        }
        protected void finalize() throws java.lang.Throwable
        {
            destroy();
            super.finalize();
        }

        @Override
        public void start()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_start(this.nativeRef);
        }
        private native void native_start(long _nativeRef);

        @Override
        public void stop()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_stop(this.nativeRef);
        }
        private native void native_stop(long _nativeRef);
    }
}
