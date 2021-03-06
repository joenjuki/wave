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

package org.waveprotocol.wave.model.document;


/**
 * Handler for mutable document events.
 *
 */
public interface MutableDocumentListener {
  MutableDocumentListener VOID = new MutableDocumentListener() {
    public void onDocumentEvents(MutableDocumentEvent events) {
      // Do nothing.
    }
  };

  /**
   * Triggered on changes to the document. The events should be in index order.
   *
   * @param events list of events
   */
  void onDocumentEvents(MutableDocumentEvent events);
}
