/**
 * Copyright 2010 Google Inc.
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

package org.waveprotocol.wave.model.waveref;

/**
 * Checked exception indicating that a serialised waveref is invalid.
 *
 * @author meade@google.com <Edwina Mead>
 */
public class InvalidWaveRefException extends Exception {

  private final String ref;

  public InvalidWaveRefException(String ref, String message) {
    super(message);
    this.ref = ref;
  }

  public InvalidWaveRefException(String ref, String message, Throwable cause) {
    super(message, cause);
    this.ref = ref;
  }

  public String getId() {
    return ref;
  }

  @Override
  public String getMessage() {
    return "Invalid waveRef '" + ref + "': " + super.getMessage();
  }
}
