/*
 * Copyright © 2019 The GWT Project Authors
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
 */
package org.gwtproject.aria.client;
/////////////////////////////////////////////////////////
// This is auto-generated code.  Do not manually edit! //
/////////////////////////////////////////////////////////

/** ARIA specific type attribute. */
class AriaValueAttribute<T extends AriaAttributeType> extends Attribute<T> {

  public AriaValueAttribute(String name, String defaultValue) {
    super(name, defaultValue);
  }

  public AriaValueAttribute(String name) {
    super(name);
  }

  @Override
  protected String getSingleValue(T value) {
    return value.getAriaValue();
  }
}
