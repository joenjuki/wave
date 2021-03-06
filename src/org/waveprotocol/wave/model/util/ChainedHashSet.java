/**
 * Copyright 2009 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.waveprotocol.wave.model.util;

import java.util.Set;

/**
 * @author danilatos@google.com (Daniel Danilatos)
 */
public class ChainedHashSet<T> extends ChainedData<Set<T>, Set<T>> {

  public static final ChainedHashSet<Object> EMPTY_ROOT = new ChainedHashSet<Object>();

  @SuppressWarnings("unchecked")
  public static <T> ChainedHashSet<T> emptyRoot() {
    return (ChainedHashSet<T>) EMPTY_ROOT;
  }

  /**
   * Root
   */
  public ChainedHashSet() {
    super(CollectionUtils.<T>hashSetDomain());
  }

  /**
   * Chained
   */
  public ChainedHashSet(ChainedHashSet<T> parent) {
    super(parent);
  }

  /** Create a child set */
  public ChainedHashSet<T> createExtension() {
    return new ChainedHashSet<T>(this);
  }
}
