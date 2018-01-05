/*
 * Copyright 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.gwtproject.aria.client;
/////////////////////////////////////////////////////////
// This is auto-generated code.  Do not manually edit! //
/////////////////////////////////////////////////////////

import elemental2.dom.HTMLElement;

/**
 * <p>Implements {@link ListitemRole}.</p>
 */
class ListitemRoleImpl extends RoleImpl implements ListitemRole {
  ListitemRoleImpl(String roleName) {
    super(roleName);
  }

  @Override
  public String getAriaExpandedState(HTMLElement element) {
    return State.EXPANDED.get(element);
  }

  @Override
  public String getAriaLevelProperty(HTMLElement element) {
    return Property.LEVEL.get(element);
  }

  @Override
  public String getAriaPosinsetProperty(HTMLElement element) {
    return Property.POSINSET.get(element);
  }

  @Override
  public String getAriaSetsizeProperty(HTMLElement element) {
    return Property.SETSIZE.get(element);
  }

  @Override
  public void removeAriaExpandedState(HTMLElement element) {
    State.EXPANDED.remove(element);
  }

  @Override
  public void removeAriaLevelProperty(HTMLElement element) {
    Property.LEVEL.remove(element);
  }

  @Override
  public void removeAriaPosinsetProperty(HTMLElement element) {
    Property.POSINSET.remove(element);
  }

  @Override
  public void removeAriaSetsizeProperty(HTMLElement element) {
    Property.SETSIZE.remove(element);
  }

  @Override
  public void setAriaExpandedState(HTMLElement element, ExpandedValue value) {
    State.EXPANDED.set(element, value);
  }

  @Override
  public void setAriaLevelProperty(HTMLElement element, int value) {
    Property.LEVEL.set(element, value);
  }

  @Override
  public void setAriaPosinsetProperty(HTMLElement element, int value) {
    Property.POSINSET.set(element, value);
  }

  @Override
  public void setAriaSetsizeProperty(HTMLElement element, int value) {
    Property.SETSIZE.set(element, value);
  }
}
