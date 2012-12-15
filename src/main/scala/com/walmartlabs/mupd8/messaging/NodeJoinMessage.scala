/**
 * Copyright 2011-2012 @WalmartLabs, a division of Wal-Mart Stores, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.walmartlabs.mupd8.messaging

import com.walmartlabs.mupd8.messaging.ActivityStatus._
import com.walmartlabs.mupd8.messaging.MessageKind._
import com.walmartlabs.mupd8.messaging.MessageTransportKind._

class NodeJoinMessage(joiningNode: String) extends Message(MessageKind.NODE_JOIN, MessageTransportKind.BROADCAST) {

  def getJoiningNode() = joiningNode

  override def toString(): String = {
     joiningNode
  }
}
