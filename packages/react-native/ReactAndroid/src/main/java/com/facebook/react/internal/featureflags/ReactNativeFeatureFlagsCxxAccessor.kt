/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 *
 * @generated SignedSource<<d4ece56f9329579346fbfe08f7681632>>
 */

/**
 * IMPORTANT: Do NOT modify this file directly.
 *
 * To change the definition of the flags, edit
 *   packages/react-native/scripts/featureflags/ReactNativeFeatureFlags.config.js.
 *
 * To regenerate this code, run the following script from the repo root:
 *   yarn featureflags-update
 */

package com.facebook.react.internal.featureflags

class ReactNativeFeatureFlagsCxxAccessor : ReactNativeFeatureFlagsAccessor {
  private var commonTestFlagCache: Boolean? = null
  private var useModernRuntimeSchedulerCache: Boolean? = null
  private var enableMicrotasksCache: Boolean? = null
  private var batchRenderingUpdatesInEventLoopCache: Boolean? = null
  private var enableSpannableBuildingUnificationCache: Boolean? = null
  private var enableCustomDrawOrderFabricCache: Boolean? = null
  private var enableFixForClippedSubviewsCrashCache: Boolean? = null

  override fun commonTestFlag(): Boolean {
    var cached = commonTestFlagCache
    if (cached == null) {
      cached = ReactNativeFeatureFlagsCxxInterop.commonTestFlag()
      commonTestFlagCache = cached
    }
    return cached
  }

  override fun useModernRuntimeScheduler(): Boolean {
    var cached = useModernRuntimeSchedulerCache
    if (cached == null) {
      cached = ReactNativeFeatureFlagsCxxInterop.useModernRuntimeScheduler()
      useModernRuntimeSchedulerCache = cached
    }
    return cached
  }

  override fun enableMicrotasks(): Boolean {
    var cached = enableMicrotasksCache
    if (cached == null) {
      cached = ReactNativeFeatureFlagsCxxInterop.enableMicrotasks()
      enableMicrotasksCache = cached
    }
    return cached
  }

  override fun batchRenderingUpdatesInEventLoop(): Boolean {
    var cached = batchRenderingUpdatesInEventLoopCache
    if (cached == null) {
      cached = ReactNativeFeatureFlagsCxxInterop.batchRenderingUpdatesInEventLoop()
      batchRenderingUpdatesInEventLoopCache = cached
    }
    return cached
  }

  override fun enableSpannableBuildingUnification(): Boolean {
    var cached = enableSpannableBuildingUnificationCache
    if (cached == null) {
      cached = ReactNativeFeatureFlagsCxxInterop.enableSpannableBuildingUnification()
      enableSpannableBuildingUnificationCache = cached
    }
    return cached
  }

  override fun enableCustomDrawOrderFabric(): Boolean {
    var cached = enableCustomDrawOrderFabricCache
    if (cached == null) {
      cached = ReactNativeFeatureFlagsCxxInterop.enableCustomDrawOrderFabric()
      enableCustomDrawOrderFabricCache = cached
    }
    return cached
  }

  override fun enableFixForClippedSubviewsCrash(): Boolean {
    var cached = enableFixForClippedSubviewsCrashCache
    if (cached == null) {
      cached = ReactNativeFeatureFlagsCxxInterop.enableFixForClippedSubviewsCrash()
      enableFixForClippedSubviewsCrashCache = cached
    }
    return cached
  }

  override fun override(provider: ReactNativeFeatureFlagsProvider) =
      ReactNativeFeatureFlagsCxxInterop.override(provider as Any)

  override fun dangerouslyReset() = ReactNativeFeatureFlagsCxxInterop.dangerouslyReset()
}
