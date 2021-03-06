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

package org.waveprotocol.wave.federation.xmpp;

import org.xmpp.packet.Packet;

/**
 * Generic incoming XMPP packet handler interface. This should only be
 * implemented by {@link XmppManager}, regardless of which wire transport is in
 * use.
 *
 * @author thorogood@google.com (Sam Thorogood)
 */
public interface IncomingPacketHandler {

  /**
   * Accept a generic XMPP packet from on-the-wire.
   */
  void receivePacket(Packet packet);

}
