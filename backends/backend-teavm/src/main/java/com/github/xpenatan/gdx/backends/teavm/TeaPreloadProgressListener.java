package com.github.xpenatan.gdx.backends.teavm;

/**
 * Listener for preload progress updates.
 * Called each frame during asset preloading with the current progress (0.0 to 1.0).
 */
public interface TeaPreloadProgressListener {
    void onProgress(float progress);
}
