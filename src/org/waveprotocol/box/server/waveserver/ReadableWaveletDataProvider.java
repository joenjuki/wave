/**
 * Copyright 2012 Apache Wave.
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

package org.waveprotocol.box.server.waveserver;

import org.waveprotocol.wave.model.id.WaveletName;
import org.waveprotocol.wave.model.wave.data.ReadableWaveletData;

/**
 * Adapter for {@link WaveletProvider} with simpler interface for accessing
 * wavelet data.
 *
 * @author yurize@apache.org (Yuri Zelikov)
 */
public interface ReadableWaveletDataProvider {

  ReadableWaveletData getReadableWaveletData(WaveletName waveletName) throws WaveServerException;
}
